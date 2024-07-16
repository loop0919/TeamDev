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
@Table(name="subjects")
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;
}
