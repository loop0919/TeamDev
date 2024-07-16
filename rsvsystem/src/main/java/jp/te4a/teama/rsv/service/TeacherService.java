package jp.te4a.teama.rsv.service;

import java.util.List;

import jp.te4a.teama.rsv.form.TeacherForm;

public interface TeacherService {
    List<TeacherForm> findAll();
    List<TeacherForm> findBySubjectId(int subjectId);
}
