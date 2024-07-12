package jp.te4a.teama.rsv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import jp.te4a.teama.rsv.bean.RsvBean;

public interface RsvRepository extends JpaRepository<RsvBean, String>, JpaSpecificationExecutor<RsvBean> {
    @Query("SELECT rsv FROM reservations rsv WHERE rsv.date = ?1")
    RsvBean findByDate(String date);
}
