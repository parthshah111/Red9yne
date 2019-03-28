package Main;

import javax.persistence.*;

@Entity
@Table(name = "StaffTitle", schema = "dbo", catalog = "newDB")
public class StaffTitleEntity {
    private int tittleId;
    private String tittleDesc;

    @Id
    @Column(name = "Tittle_ID", nullable = false)
    public int getTittleId() {
        return tittleId;
    }

    public void setTittleId(int tittleId) {
        this.tittleId = tittleId;
    }

    @Basic
    @Column(name = "Tittle_Desc", nullable = false, length = 100)
    public String getTittleDesc() {
        return tittleDesc;
    }

    public void setTittleDesc(String tittleDesc) {
        this.tittleDesc = tittleDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffTitleEntity that = (StaffTitleEntity) o;

        if (tittleId != that.tittleId) return false;
        if (tittleDesc != null ? !tittleDesc.equals(that.tittleDesc) : that.tittleDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tittleId;
        result = 31 * result + (tittleDesc != null ? tittleDesc.hashCode() : 0);
        return result;
    }
}
