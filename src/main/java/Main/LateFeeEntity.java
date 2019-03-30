package Main;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Late_Fee", schema = "dbo", catalog = "DBdummy2")
public class LateFeeEntity {
    private int rentalId;
    private int reportId;
    private int orderNo;
    private int customerId;
    private int supplyId;
    private int rentalExp;
    private int rentalReturn;
    private Timestamp lateDay;
    private double lateFee;
    private double lateTotal;

    @Id
    @Column(name = "Rental_ID")
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

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
    @Column(name = "Supply_ID")
    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    @Basic
    @Column(name = "Rental_Exp")
    public int getRentalExp() {
        return rentalExp;
    }

    public void setRentalExp(int rentalExp) {
        this.rentalExp = rentalExp;
    }

    @Basic
    @Column(name = "Rental_Return")
    public int getRentalReturn() {
        return rentalReturn;
    }

    public void setRentalReturn(int rentalReturn) {
        this.rentalReturn = rentalReturn;
    }

    @Basic
    @Column(name = "Late_Day")
    public Timestamp getLateDay() {
        return lateDay;
    }

    public void setLateDay(Timestamp lateDay) {
        this.lateDay = lateDay;
    }

    @Basic
    @Column(name = "Late_Fee")
    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Basic
    @Column(name = "Late_Total")
    public double getLateTotal() {
        return lateTotal;
    }

    public void setLateTotal(double lateTotal) {
        this.lateTotal = lateTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LateFeeEntity that = (LateFeeEntity) o;

        if (rentalId != that.rentalId) return false;
        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (supplyId != that.supplyId) return false;
        if (rentalExp != that.rentalExp) return false;
        if (rentalReturn != that.rentalReturn) return false;
        if (Double.compare(that.lateFee, lateFee) != 0) return false;
        if (Double.compare(that.lateTotal, lateTotal) != 0) return false;
        if (lateDay != null ? !lateDay.equals(that.lateDay) : that.lateDay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = rentalId;
        result = 31 * result + reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + supplyId;
        result = 31 * result + rentalExp;
        result = 31 * result + rentalReturn;
        result = 31 * result + (lateDay != null ? lateDay.hashCode() : 0);
        temp = Double.doubleToLongBits(lateFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lateTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
