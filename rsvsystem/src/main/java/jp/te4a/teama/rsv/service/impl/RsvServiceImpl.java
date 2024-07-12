// package jp.te4a.teama.rsv.service.impl;

// import java.util.List;
// import java.util.stream.Collectors;

// import org.springframework.beans.BeanUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.domain.Specification;
// import org.springframework.stereotype.Service;

// import jp.te4a.teama.rsv.bean.RsvBean;
// import jp.te4a.teama.rsv.form.RsvForm;
// import jp.te4a.teama.rsv.repository.RsvRepository;
// import jp.te4a.teama.rsv.service.RsvService;

// @Service
// public class RsvServiceImpl implements RsvService {
//     @Autowired
//     RsvRepository rsvRepo;
    
//     @Override
//     public RsvForm save(RsvForm rsvForm) {
//         RsvBean rsvBean = new RsvBean();

//         BeanUtils.copyProperties(rsvForm, rsvBean);
//         rsvRepo.save(rsvBean);
//         return rsvForm;
//     }

//     @Override
//     public void deleteById(String rsvId) {
//         rsvRepo.deleteById(rsvId);
//     }

//     @Override
//     public List<RsvForm> findAll() {
//         List<RsvForm> formList = rsvRepo.findAll()
//                 .stream()
//                 .map(bean -> {
//                     RsvForm form = new RsvForm();
//                     BeanUtils.copyProperties(bean, form);
//                     return form;
//                 })
//                 .collect(Collectors.toList());
        
//         return formList;
//     }

//     @Override
//     public List<RsvForm> findByDate(String date) {
//         List<RsvForm> formList = rsvRepo.findAll()
//                 .stream()
//                 .map(bean -> {
//                     RsvForm form = new RsvForm();
//                     BeanUtils.copyProperties(bean, form);
//                     return form;
//                 })
//                 .collect(Collectors.toList());
        
//         return formList;
//     }

// }
