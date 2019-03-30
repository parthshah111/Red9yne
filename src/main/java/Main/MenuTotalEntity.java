package Main;

import javax.persistence.*;

@Entity
@Table(name = "Menu_Total", schema = "dbo", catalog = "DBdummy2")
public class MenuTotalEntity {
    private int reportId;
    private int foodMenuId;
    private int orderNo;
    private int customerId;
    private int foodId;
    private int foodQty;
    private int foodTotal;

    @Basic
    @Column(name = "Report_ID")
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Id
    @Column(name = "FoodMenu_ID")
    public int getFoodMenuId() {
        return foodMenuId;
    }

    public void setFoodMenuId(int foodMenuId) {
        this.foodMenuId = foodMenuId;
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
    @Column(name = "Food_ID")
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Basic
    @Column(name = "Food_Qty")
    public int getFoodQty() {
        return foodQty;
    }

    public void setFoodQty(int foodQty) {
        this.foodQty = foodQty;
    }

    @Basic
    @Column(name = "Food_Total")
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
}
