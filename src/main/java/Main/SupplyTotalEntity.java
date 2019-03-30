package Main;

import javax.persistence.*;

@Entity
@Table(name = "Supply_Total", schema = "dbo", catalog = "DBdummy2")
public class SupplyTotalEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int rentalId;
    private int supplyOrderId;
    private int supplyId;
    private int supplyQty;
    private double supplyFee;
    private double supplyTotal;

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

    @Basic
    @Column(name = "Rental_ID")
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    @Id
    @Column(name = "SupplyOrder_ID")
    public int getSupplyOrderId() {
        return supplyOrderId;
    }

    public void setSupplyOrderId(int supplyOrderId) {
        this.supplyOrderId = supplyOrderId;
    }

    @Basic
    @Column(name = "Supply_ID")
    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    @Basic
    @Column(name = "Supply_Qty")
    public int getSupplyQty() {
        return supplyQty;
    }

    public void setSupplyQty(int supplyQty) {
        this.supplyQty = supplyQty;
    }

    @Basic
    @Column(name = "Supply_Fee")
    public double getSupplyFee() {
        return supplyFee;
    }

    public void setSupplyFee(double supplyFee) {
        this.supplyFee = supplyFee;
    }

    @Basic
    @Column(name = "Supply_Total")
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

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (rentalId != that.rentalId) return false;
        if (supplyOrderId != that.supplyOrderId) return false;
        if (supplyId != that.supplyId) return false;
        if (supplyQty != that.supplyQty) return false;
        if (Double.compare(that.supplyFee, supplyFee) != 0) return false;
        if (Double.compare(that.supplyTotal, supplyTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + rentalId;
        result = 31 * result + supplyOrderId;
        result = 31 * result + supplyId;
        result = 31 * result + supplyQty;
        temp = Double.doubleToLongBits(supplyFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(supplyTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
