package Main;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "Late_Fee", schema = "dbo", catalog = "newDB")
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
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private SupplyStatusEntity supplyStatusBySupplyId;
    private Collection<OrderEntity> ordersByRentalId;
    private Collection<SupplyTotalEntity> supplyTotalsByRentalId;

    @Id
    @Column(name = "Rental_ID", nullable = false)
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

//    @Basic
//    @Column(name = "Report_ID", nullable = false)
//    public int getReportId() {
//        return reportId;
//    }
//
//    public void setReportId(int reportId) {
//        this.reportId = reportId;
//    }
//
//    @Basic
//    @Column(name = "Order_No", nullable = false)
//    public int getOrderNo() {
//        return orderNo;
//    }
//
//    public void setOrderNo(int orderNo) {
//        this.orderNo = orderNo;
//    }
//
//    @Basic
//    @Column(name = "Customer_ID", nullable = false)
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    @Basic
//    @Column(name = "Supply_ID", nullable = false)
//    public int getSupplyId() {
//        return supplyId;
//    }
//
//    public void setSupplyId(int supplyId) {
//        this.supplyId = supplyId;
//    }

    @Basic
    @Column(name = "Rental_Exp", nullable = false)
    public int getRentalExp() {
        return rentalExp;
    }

    public void setRentalExp(int rentalExp) {
        this.rentalExp = rentalExp;
    }

    @Basic
    @Column(name = "Rental_Return", nullable = false)
    public int getRentalReturn() {
        return rentalReturn;
    }

    public void setRentalReturn(int rentalReturn) {
        this.rentalReturn = rentalReturn;
    }

    @Basic
    @Column(name = "Late_Day", nullable = false)
    public Timestamp getLateDay() {
        return lateDay;
    }

    public void setLateDay(Timestamp lateDay) {
        this.lateDay = lateDay;
    }

    @Basic
    @Column(name = "Late_Fee", nullable = false, precision = 0)
    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Basic
    @Column(name = "Late_Total", nullable = false, precision = 0)
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

    @ManyToOne
    @JoinColumn(name = "Report_ID", referencedColumnName = "Report_ID", nullable = false)
    public ReportDateEntity getReportDateByReportId() {
        return reportDateByReportId;
    }

    public void setReportDateByReportId(ReportDateEntity reportDateByReportId) {
        this.reportDateByReportId = reportDateByReportId;
    }

    @ManyToOne
    @JoinColumn(name = "Order_No", referencedColumnName = "Order_no", nullable = false)
    public OrderEntity getOrderByOrderNo() {
        return orderByOrderNo;
    }

    public void setOrderByOrderNo(OrderEntity orderByOrderNo) {
        this.orderByOrderNo = orderByOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "Customer_ID", referencedColumnName = "CUSTOMER_ID", nullable = false)
    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "Supply_ID", referencedColumnName = "SUPPLY_ID", nullable = false)
    public SupplyStatusEntity getSupplyStatusBySupplyId() {
        return supplyStatusBySupplyId;
    }

    public void setSupplyStatusBySupplyId(SupplyStatusEntity supplyStatusBySupplyId) {
        this.supplyStatusBySupplyId = supplyStatusBySupplyId;
    }

    @OneToMany(mappedBy = "lateFeeByRentalId")
    public Collection<OrderEntity> getOrdersByRentalId() {
        return ordersByRentalId;
    }

    public void setOrdersByRentalId(Collection<OrderEntity> ordersByRentalId) {
        this.ordersByRentalId = ordersByRentalId;
    }

    @OneToMany(mappedBy = "lateFeeByRentalId")
    public Collection<SupplyTotalEntity> getSupplyTotalsByRentalId() {
        return supplyTotalsByRentalId;
    }

    public void setSupplyTotalsByRentalId(Collection<SupplyTotalEntity> supplyTotalsByRentalId) {
        this.supplyTotalsByRentalId = supplyTotalsByRentalId;
    }
}
