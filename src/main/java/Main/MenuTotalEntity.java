package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Menu_Total", schema = "dbo", catalog = "newDB")
public class MenuTotalEntity {
    private int reportId;
    private int foodMenuId;
    private int orderNo;
    private int customerId;
    private int foodId;
    private int foodQty;
    private int foodTotal;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private FoodEntity foodByFoodId;
    private Collection<OrderEntity> ordersByFoodMenuId;

//    @Basic
//    @Column(name = "Report_ID", nullable = false)
//    public int getReportId() {
//        return reportId;
//    }
//
//    public void setReportId(int reportId) {
//        this.reportId = reportId;
//    }

    @Id
    @Column(name = "FoodMenu_ID", nullable = false)
    public int getFoodMenuId() {
        return foodMenuId;
    }

    public void setFoodMenuId(int foodMenuId) {
        this.foodMenuId = foodMenuId;
    }

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
//    @Column(name = "Food_ID", nullable = false)
//    public int getFoodId() {
//        return foodId;
//    }
//
//    public void setFoodId(int foodId) {
//        this.foodId = foodId;
//    }

    @Basic
    @Column(name = "Food_Qty", nullable = false)
    public int getFoodQty() {
        return foodQty;
    }

    public void setFoodQty(int foodQty) {
        this.foodQty = foodQty;
    }

    @Basic
    @Column(name = "Food_Total", nullable = false)
    public int getFoodTotal() {
        return foodTotal;
    }

    public void setFoodTotal(int foodTotal) {
        this.foodTotal = foodTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuTotalEntity that = (MenuTotalEntity) o;

        if (reportId != that.reportId) return false;
        if (foodMenuId != that.foodMenuId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (foodId != that.foodId) return false;
        if (foodQty != that.foodQty) return false;
        if (foodTotal != that.foodTotal) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + foodMenuId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + foodId;
        result = 31 * result + foodQty;
        result = 31 * result + foodTotal;
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
    @JoinColumn(name = "Food_ID", referencedColumnName = "Food_ID", nullable = false)
    public FoodEntity getFoodByFoodId() {
        return foodByFoodId;
    }

    public void setFoodByFoodId(FoodEntity foodByFoodId) {
        this.foodByFoodId = foodByFoodId;
    }

    @OneToMany(mappedBy = "menuTotalByFoodMenuId")
    public Collection<OrderEntity> getOrdersByFoodMenuId() {
        return ordersByFoodMenuId;
    }

    public void setOrdersByFoodMenuId(Collection<OrderEntity> ordersByFoodMenuId) {
        this.ordersByFoodMenuId = ordersByFoodMenuId;
    }
}
