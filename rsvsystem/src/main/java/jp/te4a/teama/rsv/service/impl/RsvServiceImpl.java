package jp.te4a.teama.rsv.service.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.te4a.teama.rsv.bean.RsvBean;
import jp.te4a.teama.rsv.form.RsvForm;
import jp.te4a.teama.rsv.repository.RsvRepository;
import jp.te4a.teama.rsv.service.RsvService;

@Service
public class RsvServiceImpl implements RsvService {
    @Autowired
    private RsvRepository rsvRepo;
    
    @Override
    public RsvForm save(RsvForm rsvForm) {
        RsvBean rsvBean = new RsvBean();

        BeanUtils.copyProperties(rsvForm, rsvBean);
        rsvRepo.save(rsvBean);
        return rsvForm;
    }

    @Override
    public void deleteById(Integer rsvId) {
        rsvRepo.deleteById(rsvId);
    }

    @Override
    public List<RsvForm> findAllValid() {
        List<RsvForm> formList = rsvRepo.findAllValid()
                .stream()
                .map(bean -> {
                    RsvForm form = new RsvForm();
                    BeanUtils.copyProperties(bean, form);
                    return form;
                })
                .collect(Collectors.toList());
        
        return formList;
    }

    @Override
    public List<RsvForm> findByDate(String date) {
        List<RsvForm> formList = rsvRepo.findByDate(date)
                .stream()
                .map(bean -> {
                    RsvForm form = new RsvForm();
                    BeanUtils.copyProperties(bean, form);
                    return form;
                })
                .collect(Collectors.toList());
        
        return formList;
    }

    @Override
    public RsvForm findOne(Integer rsvId) {
        RsvBean rsvBean = rsvRepo.findById(rsvId).orElseThrow(NoSuchElementException::new);
        RsvForm rsvForm = new RsvForm();

        BeanUtils.copyProperties(rsvBean, rsvForm);
        return rsvForm;
    }

    private void setPropaties(RsvForm rsvForm, RsvBean rsvBean, boolean isValid) {
        rsvBean.setTimestamp(new Timestamp(System.currentTimeMillis()));
        rsvBean.setRoomId(rsvForm.getRoom());
        rsvBean.setPeriodId(rsvForm.getTime());
        rsvBean.setPeriodId(rsvForm.getTime());
        rsvBean.setTeacherId(rsvForm.getName());
        rsvBean.setSubjectId(rsvForm.getSubject());
        rsvBean.setRemark(rsvForm.getComment());
        rsvBean.setStatus(isValid);
    } 
}
