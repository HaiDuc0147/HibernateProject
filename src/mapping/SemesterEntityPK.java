package mapping;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SemesterEntityPK implements Serializable {
    private String semesterName;
    private int year;

    @Column(name = "semester_name", nullable = false, length = 3)
    @Id
    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    @Column(name = "year", nullable = false)
    @Id
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemesterEntityPK that = (SemesterEntityPK) o;
        return year == that.year && Objects.equals(semesterName, that.semesterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semesterName, year);
    }
}
