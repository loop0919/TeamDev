package jp.te4a.teama.rsv.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="password")
    @JsonIgnore
    private String password;

    @Column(name="role_id")
    private String roleId;
}
