package jp.te4a.teama.rsv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.te4a.teama.rsv.bean.RsvBean;

@Repository
public interface RsvRepository extends JpaRepository<RsvBean, Integer> {
    @Query("SELECT r FROM RsvBean r WHERE r.date = :date")
    List<RsvBean> findByDate(@Param("date") String date);

    @Query("SELECT r FROM RsvBean r WHERE r.status = true")
    List<RsvBean> findAllValid();
}
