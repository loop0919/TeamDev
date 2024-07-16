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
@Table(name="periods")
@AllArgsConstructor
@NoArgsConstructor
public class PeriodBean {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
}
