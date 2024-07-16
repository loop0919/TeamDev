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
@Table(name="reschedulings")
@AllArgsConstructor
@NoArgsConstructor
public class ReschedulingBean {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="applicant_id")
    private String applicantId;

    @Column(name="prev_reservation_id")
    private int prevRsvId;

    @Column(name="next_reservation_id")
    private int nextRsvId;

    @Column(name="status")
    private int status;
}
