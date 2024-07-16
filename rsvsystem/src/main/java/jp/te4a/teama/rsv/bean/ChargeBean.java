package jp.te4a.teama.rsv.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="charges")
@AllArgsConstructor
@NoArgsConstructor
public class ChargeBean {
    @Id
    @Column(name="teacher_id")
    private String teacherId;

    @Id
    @Column(name="subject_id")
    private int subjectId;

}
