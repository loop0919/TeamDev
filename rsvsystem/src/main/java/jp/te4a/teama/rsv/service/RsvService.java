package jp.te4a.teama.rsv.service;

import java.util.List;

import jp.te4a.teama.rsv.form.RsvForm;

public interface RsvService {
    public RsvForm save(RsvForm rsvForm);
    public void deleteById(Integer rsvId);
    public List<RsvForm> findAllValid();
    public List<RsvForm> findByDate(String date);
    public RsvForm findOne(Integer rsvId);
}
