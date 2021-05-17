package mapping;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class CourseregisterEntityPK implements Serializable {
    private String courseId;
    private Date registerDay;

    @Column(name = "course_id", nullable = false, length = 10)
    @Id
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Column(name = "register_day", nullable = false)
    @Id
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
        CourseregisterEntityPK that = (CourseregisterEntityPK) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(registerDay, that.registerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, registerDay);
    }
}
