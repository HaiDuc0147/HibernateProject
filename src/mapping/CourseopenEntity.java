package mapping;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "COURSEOPEN", schema = "public", catalog = "StudentDB")
@IdClass(CourseopenEntityPK.class)
public class CourseopenEntity {
    private Date startDay;
    private Date endDay;

    @Id
    @Column(name = "start_day", nullable = false)
    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Id
    @Column(name = "end_day", nullable = false)
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
        CourseopenEntity that = (CourseopenEntity) o;
        return Objects.equals(startDay, that.startDay) && Objects.equals(endDay, that.endDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDay, endDay);
    }
}
