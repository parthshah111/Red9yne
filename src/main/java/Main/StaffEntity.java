package Main;

import javax.persistence.*;

@Entity
@Table(name = "Staff", schema = "dbo", catalog = "DBdummy3")
public class StaffEntity {
    private int staffId;
    private int staffQty;
    private double staffFee;
    private double staffTotal;

    @Id
    @Column(name = "Staff_ID", nullable = false)
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "Staff_Qty", nullable = false)
    public int getStaffQty() {
        return staffQty;
    }

    public void setStaffQty(int staffQty) {
        this.staffQty = staffQty;
    }

    @Basic
    @Column(name = "Staff_Fee", nullable = false, precision = 0)
    public double getStaffFee() {
        return staffFee;
    }

    public void setStaffFee(double staffFee) {
        this.staffFee = staffFee;
    }

    @Basic
    @Column(name = "Staff_Total", nullable = false, precision = 0)
    public double getStaffTotal() {
        return staffTotal;
    }

    public void setStaffTotal(double staffTotal) {
        this.staffTotal = staffTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffEntity that = (StaffEntity) o;

        if (staffId != that.staffId) return false;
        if (staffQty != that.staffQty) return false;
        if (Double.compare(that.staffFee, staffFee) != 0) return false;
        if (Double.compare(that.staffTotal, staffTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = staffId;
        result = 31 * result + staffQty;
        temp = Double.doubleToLongBits(staffFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(staffTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
