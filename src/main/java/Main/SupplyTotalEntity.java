package Main;

import javax.persistence.*;

@Entity
@Table(name = "Supply_Total", schema = "dbo", catalog = "newDB")
public class SupplyTotalEntity {
    private int supplyOrderId;
    private int supplyQty;
    private double supplyFee;
    private double supplyTotal;

    @Id
    @Column(name = "SupplyOrder_ID", nullable = false)
    public int getSupplyOrderId() {
        return supplyOrderId;
    }

    public void setSupplyOrderId(int supplyOrderId) {
        this.supplyOrderId = supplyOrderId;
    }

    @Basic
    @Column(name = "Supply_Qty", nullable = false)
    public int getSupplyQty() {
        return supplyQty;
    }

    public void setSupplyQty(int supplyQty) {
        this.supplyQty = supplyQty;
    }

    @Basic
    @Column(name = "Supply_Fee", nullable = false, precision = 0)
    public double getSupplyFee() {
        return supplyFee;
    }

    public void setSupplyFee(double supplyFee) {
        this.supplyFee = supplyFee;
    }

    @Basic
    @Column(name = "Supply_Total", nullable = false, precision = 0)
    public double getSupplyTotal() {
        return supplyTotal;
    }

    public void setSupplyTotal(double supplyTotal) {
        this.supplyTotal = supplyTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplyTotalEntity that = (SupplyTotalEntity) o;

        if (supplyOrderId != that.supplyOrderId) return false;
        if (supplyQty != that.supplyQty) return false;
        if (Double.compare(that.supplyFee, supplyFee) != 0) return false;
        if (Double.compare(that.supplyTotal, supplyTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = supplyOrderId;
        result = 31 * result + supplyQty;
        temp = Double.doubleToLongBits(supplyFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(supplyTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
