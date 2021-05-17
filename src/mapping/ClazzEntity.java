package mapping;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CLASS", schema = "public", catalog = "StudentDB")
public class ClazzEntity {
    private String classId;
    private Integer numberOfStudent;
    private Integer numberOfMale;
    private Integer numberOfFemale;

    @Id
    @Column(name = "class_id", nullable = false, length = 6)
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "number_of_student", nullable = true)
    public Integer getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(Integer numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Basic
    @Column(name = "number_of_male", nullable = true)
    public Integer getNumberOfMale() {
        return numberOfMale;
    }

    public void setNumberOfMale(Integer numberOfMale) {
        this.numberOfMale = numberOfMale;
    }

    @Basic
    @Column(name = "number_of_female", nullable = true)
    public Integer getNumberOfFemale() {
        return numberOfFemale;
    }

    public void setNumberOfFemale(Integer numberOfFemale) {
        this.numberOfFemale = numberOfFemale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzEntity that = (ClazzEntity) o;
        return Objects.equals(classId, that.classId) && Objects.equals(numberOfStudent, that.numberOfStudent) && Objects.equals(numberOfMale, that.numberOfMale) && Objects.equals(numberOfFemale, that.numberOfFemale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, numberOfStudent, numberOfMale, numberOfFemale);
    }
}
