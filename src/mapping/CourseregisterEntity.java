package mapping;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "COURSEREGISTER", schema = "public", catalog = "StudentDB")
@IdClass(CourseregisterEntityPK.class)
public class CourseregisterEntity {
    private String courseId;
    private Date registerDay;

    @Id
    @Column(name = "course_id", nullable = false, length = 10)
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "register_day", nullable = false)
    public Date getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseregisterEntity that = (CourseregisterEntity) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(registerDay, that.registerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, registerDay);
    }
}
