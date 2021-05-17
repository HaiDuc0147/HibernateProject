package mapping;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "SEMESTER", schema = "public", catalog = "StudentDB")
@IdClass(SemesterEntityPK.class)
public class SemesterEntity {
    private String semesterName;
    private int year;
    private Date startDay;
    private Date endDay;

    @Id
    @Column(name = "semester_name", nullable = false, length = 3)
    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    @Id
    @Column(name = "year", nullable = false)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "start_day", nullable = true)
    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Basic
    @Column(name = "end_day", nullable = true)
    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemesterEntity that = (SemesterEntity) o;
        return year == that.year && Objects.equals(semesterName, that.semesterName) && Objects.equals(startDay, that.startDay) && Objects.equals(endDay, that.endDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semesterName, year, startDay, endDay);
    }
}
