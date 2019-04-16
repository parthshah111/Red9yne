package Main;

import javax.persistence.*;

@Entity
@Table(name = "Supply_Status", schema = "dbo", catalog = "DBdummy3")
public class SupplyStatusEntity {
    private int supplyId;
    private String supplyName;
    private String supplyStatus;

    @Id
    @Column(name = "SUPPLY_ID", nullable = false)
    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    @Basic
    @Column(name = "SUPPLY_NAME", nullable = false, length = 24)
    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    @Basic
    @Column(name = "SUPPLY_STATUS", nullable = false, length = 24)
    public String getSupplyStatus() {
        return supplyStatus;
    }

    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplyStatusEntity that = (SupplyStatusEntity) o;

        if (supplyId != that.supplyId) return false;
        if (supplyName != null ? !supplyName.equals(that.supplyName) : that.supplyName != null) return false;
        if (supplyStatus != null ? !supplyStatus.equals(that.supplyStatus) : that.supplyStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplyId;
        result = 31 * result + (supplyName != null ? supplyName.hashCode() : 0);
        result = 31 * result + (supplyStatus != null ? supplyStatus.hashCode() : 0);
        return result;
    }
}
