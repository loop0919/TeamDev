package jp.te4a.teama.rsv.form;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeacherForm {
    @Id
    Integer id;

    String name;

    Integer subjectId;
}
