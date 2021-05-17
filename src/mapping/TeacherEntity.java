package mapping;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEACHER", schema = "public", catalog = "StudentDB")
public class TeacherEntity {
    private String teacherId;
    private String teacherName;

    @Id
    @Column(name = "teacher_id", nullable = false, length = 10)
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "teacher_name", nullable = true, length = 50)
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherEntity that = (TeacherEntity) o;
        return Objects.equals(teacherId, that.teacherId) && Objects.equals(teacherName, that.teacherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, teacherName);
    }
}
