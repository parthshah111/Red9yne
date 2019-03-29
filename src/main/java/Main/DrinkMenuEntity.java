package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Drink_Menu", schema = "dbo", catalog = "newDB")
public class DrinkMenuEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int drinkMenuId;
    private int drinkId;
    private int drinkQty;
    private double drinkTotal;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private DrinkEntity drinkByDrinkId;
    private Collection<OrderEntity> ordersByDrinkMenuId;

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
    @Column(name = "Drink_MenuID", nullable = false)
    public int getDrinkMenuId() {
        return drinkMenuId;
    }

    public void setDrinkMenuId(int drinkMenuId) {
        this.drinkMenuId = drinkMenuId;
    }

//    @Basic
//    @Column(name = "Drink_ID", nullable = false)
//    public int getDrinkId() {
//        return drinkId;
//    }
//
//    public void setDrinkId(int drinkId) {
//        this.drinkId = drinkId;
//    }

    @Basic
    @Column(name = "Drink_Qty", nullable = false)
    public int getDrinkQty() {
        return drinkQty;
    }

    public void setDrinkQty(int drinkQty) {
        this.drinkQty = drinkQty;
    }

    @Basic
    @Column(name = "Drink_Total", nullable = false, precision = 0)
    public double getDrinkTotal() {
        return drinkTotal;
    }

    public void setDrinkTotal(double drinkTotal) {
        this.drinkTotal = drinkTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkMenuEntity that = (DrinkMenuEntity) o;

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (drinkMenuId != that.drinkMenuId) return false;
        if (drinkId != that.drinkId) return false;
        if (drinkQty != that.drinkQty) return false;
        if (Double.compare(that.drinkTotal, drinkTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + drinkMenuId;
        result = 31 * result + drinkId;
        result = 31 * result + drinkQty;
        temp = Double.doubleToLongBits(drinkTotal);
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
    @JoinColumn(name = "Drink_ID", referencedColumnName = "DRINK_ID", nullable = false)
    public DrinkEntity getDrinkByDrinkId() {
        return drinkByDrinkId;
    }

    public void setDrinkByDrinkId(DrinkEntity drinkByDrinkId) {
        this.drinkByDrinkId = drinkByDrinkId;
    }

    @OneToMany(mappedBy = "drinkMenuByDrinkMenuId")
    public Collection<OrderEntity> getOrdersByDrinkMenuId() {
        return ordersByDrinkMenuId;
    }

    public void setOrdersByDrinkMenuId(Collection<OrderEntity> ordersByDrinkMenuId) {
        this.ordersByDrinkMenuId = ordersByDrinkMenuId;
    }
}
