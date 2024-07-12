package jp.te4a.teama.rsv.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RsvForm {
    @NotBlank
    String id;

    @NotBlank
    String name;

    @NotBlank
    String date;

    @NotBlank
    String time;

    @NotBlank
    String room;

    @NotBlank
    String subject;

    @NotBlank
    int people;

    String comment;
}
