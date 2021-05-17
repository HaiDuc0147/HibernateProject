package mapping;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "COURSE", schema = "public", catalog = "StudentDB")
@IdClass(CourseEntityPK.class)
public class CourseEntity {
    private String courseId;
    private Date studyDay;
    private String studyTime;
    private String teacherId;
    private String classroom;

    @Id
    @Column(name = "course_id", nullable = false, length = 10)
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "study_day", nullable = false)
    public Date getStudyDay() {
        return studyDay;
    }

    public void setStudyDay(Date studyDay) {
        this.studyDay = studyDay;
    }

    @Id
    @Column(name = "study_time", nullable = false, length = 5)
    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    @Basic
    @Column(name = "teacher_id", nullable = true, length = 10)
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "classroom", nullable = true, length = 6)
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(studyDay, that.studyDay) && Objects.equals(studyTime, that.studyTime) && Objects.equals(teacherId, that.teacherId) && Objects.equals(classroom, that.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, studyDay, studyTime, teacherId, classroom);
    }
}
