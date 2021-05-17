package mapping;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SUBJECT", schema = "public", catalog = "StudentDB")
public class SubjectEntity {
    private String subjectId;
    private String subjectName;
    private Short credit;

    @Id
    @Column(name = "subject_id", nullable = false, length = 10)
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "subject_name", nullable = true, length = 50)
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Basic
    @Column(name = "credit", nullable = true)
    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectEntity that = (SubjectEntity) o;
        return Objects.equals(subjectId, that.subjectId) && Objects.equals(subjectName, that.subjectName) && Objects.equals(credit, that.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, subjectName, credit);
    }
}
