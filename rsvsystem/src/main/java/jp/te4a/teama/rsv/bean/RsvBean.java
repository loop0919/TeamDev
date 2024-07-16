package jp.te4a.teama.rsv.bean;


import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="reservations")
@AllArgsConstructor
@NoArgsConstructor
public class RsvBean {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="timestamp")
    private Timestamp timestamp;

    @Column(name="room_id")
    private String roomId;

    @Column(name="period_id")
    private String periodId;

    @Column(name="teacher_id")
    private String teacherId;

    @Column(name="subject_id")
    private String subjectId;

    @Column(name="remark")
    private String remark;

    @Column(name="status")
    private boolean status;
    
}
