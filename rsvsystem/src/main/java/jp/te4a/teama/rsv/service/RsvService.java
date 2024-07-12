package jp.te4a.teama.rsv.service;

import java.util.List;

import jp.te4a.teama.rsv.form.RsvForm;

public interface RsvService {
    public RsvForm save(RsvForm rsvForm);
    public void deleteById(String rsvId);
    public List<RsvForm> findAll();
    public List<RsvForm> findByDate(String date);
    public RsvForm findOne(String rsvId);
}
