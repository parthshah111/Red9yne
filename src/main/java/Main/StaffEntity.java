package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Staff", schema = "dbo", catalog = "newDB")
public class StaffEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int staffId;
    private int titleId;
    private int staffQty;
    private double staffFee;
    private double staffTotal;
    private Collection<OrderEntity> ordersByStaffId;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private StaffTitleEntity staffTitleByTitleId;

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

    @Id
    @Column(name = "Staff_ID", nullable = false)
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

//    @Basic
//    @Column(name = "Title_ID", nullable = false)
//    public int getTitleId() {
//        return titleId;
//    }
//
//    public void setTitleId(int titleId) {
//        this.titleId = titleId;
//    }

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

    @OneToMany(mappedBy = "staffByStaffId")
    public Collection<OrderEntity> getOrdersByStaffId() {
        return ordersByStaffId;
    }

    public void setOrdersByStaffId(Collection<OrderEntity> ordersByStaffId) {
        this.ordersByStaffId = ordersByStaffId;
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
    @JoinColumn(name = "Title_ID", referencedColumnName = "Tittle_ID", nullable = false)
    public StaffTitleEntity getStaffTitleByTitleId() {
        return staffTitleByTitleId;
    }

    public void setStaffTitleByTitleId(StaffTitleEntity staffTitleByTitleId) {
        this.staffTitleByTitleId = staffTitleByTitleId;
    }
}
