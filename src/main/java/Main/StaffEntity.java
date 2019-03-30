package Main;

import javax.persistence.*;

@Entity
@Table(name = "Staff", schema = "dbo", catalog = "DBdummy2")
public class StaffEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int staffId;
    private int titleId;
    private int staffQty;
    private double staffFee;
    private double staffTotal;

    @Basic
    @Column(name = "Report_ID")
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "Order_No")
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "Customer_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "Staff_ID")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "Title_ID")
    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    @Basic
    @Column(name = "Staff_Qty")
    public int getStaffQty() {
        return staffQty;
    }

    public void setStaffQty(int staffQty) {
        this.staffQty = staffQty;
    }

    @Basic
    @Column(name = "Staff_Fee")
    public double getStaffFee() {
        return staffFee;
    }

    public void setStaffFee(double staffFee) {
        this.staffFee = staffFee;
    }

    @Basic
    @Column(name = "Staff_Total")
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

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (staffId != that.staffId) return false;
        if (titleId != that.titleId) return false;
        if (staffQty != that.staffQty) return false;
        if (Double.compare(that.staffFee, staffFee) != 0) return false;
        if (Double.compare(that.staffTotal, staffTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + staffId;
        result = 31 * result + titleId;
        result = 31 * result + staffQty;
        temp = Double.doubleToLongBits(staffFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(staffTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
