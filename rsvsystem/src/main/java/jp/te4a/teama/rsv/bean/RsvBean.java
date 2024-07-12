package jp.te4a.teama.rsv.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reservations")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RsvBean {
    @Id
    @Column(name="id")
    private String id;
    
    @Column(name="name")
    private String name;

    @Column(name="date")
    private String date;

    @Column(name="time")
    private String time;

    @Column(name="room")
    private String room;

    @Column(name="subject")
    private String subject;

    @Column(name="people")
    private int people;

    @Column(name="comment")
    private String comment;
}
