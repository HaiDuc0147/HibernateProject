package mapping;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class CourseEntityPK implements Serializable {
    private String courseId;
    private Date studyDay;
    private String studyTime;

    @Column(name = "course_id", nullable = false, length = 10)
    @Id
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Column(name = "study_day", nullable = false)
    @Id
    public Date getStudyDay() {
        return studyDay;
    }

    public void setStudyDay(Date studyDay) {
        this.studyDay = studyDay;
    }

    @Column(name = "study_time", nullable = false, length = 5)
    @Id
    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntityPK that = (CourseEntityPK) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(studyDay, that.studyDay) && Objects.equals(studyTime, that.studyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, studyDay, studyTime);
    }
}
