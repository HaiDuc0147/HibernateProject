package mapping;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "STUDENT", schema = "public", catalog = "StudentDB")
public class StudentEntity {
    private String studentId;
    private String studentName;
    private String classId;
    private Integer credits;

    @Id
    @Column(name = "student_id", nullable = false, length = 8)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "student_name", nullable = true, length = 50)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "class_id", nullable = true, length = 6)
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "credits", nullable = true)
    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(studentId, that.studentId) && Objects.equals(studentName, that.studentName) && Objects.equals(classId, that.classId) && Objects.equals(credits, that.credits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, classId, credits);
    }
}
