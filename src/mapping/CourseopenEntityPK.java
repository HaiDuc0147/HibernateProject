package mapping;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class CourseopenEntityPK implements Serializable {
    private Date startDay;
    private Date endDay;

    @Column(name = "start_day", nullable = false)
    @Id
    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    @Column(name = "end_day", nullable = false)
    @Id
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
        CourseopenEntityPK that = (CourseopenEntityPK) o;
        return Objects.equals(startDay, that.startDay) && Objects.equals(endDay, that.endDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDay, endDay);
    }
}
