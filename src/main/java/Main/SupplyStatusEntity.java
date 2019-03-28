package Main;

import javax.persistence.*;

@Entity
@Table(name = "Supply_Status", schema = "dbo", catalog = "newDB")
public class SupplyStatusEntity {
    private int supplyId;
    private int supplyName;
    private int supplyStatus;

    @Id
    @Column(name = "SUPPLY_ID", nullable = false)
    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    @Basic
    @Column(name = "SUPPLY_NAME", nullable = false)
    public int getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(int supplyName) {
        this.supplyName = supplyName;
    }

    @Basic
    @Column(name = "SUPPLY_STATUS", nullable = false)
    public int getSupplyStatus() {
        return supplyStatus;
    }

    public void setSupplyStatus(int supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplyStatusEntity that = (SupplyStatusEntity) o;

        if (supplyId != that.supplyId) return false;
        if (supplyName != that.supplyName) return false;
        if (supplyStatus != that.supplyStatus) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplyId;
        result = 31 * result + supplyName;
        result = 31 * result + supplyStatus;
        return result;
    }
}
