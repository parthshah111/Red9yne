package Main;

import javax.persistence.*;

@Entity
@Table(name = "Order", schema = "dbo", catalog = "DBdummy2")
public class OrderEntity {
    private int orderNo;
    private int reportId;
    private int customerId;
    private int foodMenuId;
    private int dessertMenuId;
    private int taxOrderId;
    private int rentalId;
    private int supplyOrderId;
    private int deliveryId;
    private int staffId;
    private int gratuityOrderId;
    private int drinkMenuId;
    private int orderStatus;
    private double orderTotal;

    @Id
    @Column(name = "Order_no")
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
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
    @Column(name = "Customer_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "FoodMenu_ID")
    public int getFoodMenuId() {
        return foodMenuId;
    }

    public void setFoodMenuId(int foodMenuId) {
        this.foodMenuId = foodMenuId;
    }

    @Basic
    @Column(name = "Dessert_MenuID")
    public int getDessertMenuId() {
        return dessertMenuId;
    }

    public void setDessertMenuId(int dessertMenuId) {
        this.dessertMenuId = dessertMenuId;
    }

    @Basic
    @Column(name = "TaxOrder_ID")
    public int getTaxOrderId() {
        return taxOrderId;
    }

    public void setTaxOrderId(int taxOrderId) {
        this.taxOrderId = taxOrderId;
    }

    @Basic
    @Column(name = "Rental_ID")
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    @Basic
    @Column(name = "SupplyOrder_ID")
    public int getSupplyOrderId() {
        return supplyOrderId;
    }

    public void setSupplyOrderId(int supplyOrderId) {
        this.supplyOrderId = supplyOrderId;
    }

    @Basic
    @Column(name = "Delivery_ID")
    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Basic
    @Column(name = "Staff_ID")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "GratuityOrder_ID")
    public int getGratuityOrderId() {
        return gratuityOrderId;
    }

    public void setGratuityOrderId(int gratuityOrderId) {
        this.gratuityOrderId = gratuityOrderId;
    }

    @Basic
    @Column(name = "Drink_MenuID")
    public int getDrinkMenuId() {
        return drinkMenuId;
    }

    public void setDrinkMenuId(int drinkMenuId) {
        this.drinkMenuId = drinkMenuId;
    }

    @Basic
    @Column(name = "Order_Status")
    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "Order_Total")
    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orderNo != that.orderNo) return false;
        if (reportId != that.reportId) return false;
        if (customerId != that.customerId) return false;
        if (foodMenuId != that.foodMenuId) return false;
        if (dessertMenuId != that.dessertMenuId) return false;
        if (taxOrderId != that.taxOrderId) return false;
        if (rentalId != that.rentalId) return false;
        if (supplyOrderId != that.supplyOrderId) return false;
        if (deliveryId != that.deliveryId) return false;
        if (staffId != that.staffId) return false;
        if (gratuityOrderId != that.gratuityOrderId) return false;
        if (drinkMenuId != that.drinkMenuId) return false;
        if (orderStatus != that.orderStatus) return false;
        if (Double.compare(that.orderTotal, orderTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderNo;
        result = 31 * result + reportId;
        result = 31 * result + customerId;
        result = 31 * result + foodMenuId;
        result = 31 * result + dessertMenuId;
        result = 31 * result + taxOrderId;
        result = 31 * result + rentalId;
        result = 31 * result + supplyOrderId;
        result = 31 * result + deliveryId;
        result = 31 * result + staffId;
        result = 31 * result + gratuityOrderId;
        result = 31 * result + drinkMenuId;
        result = 31 * result + orderStatus;
        temp = Double.doubleToLongBits(orderTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
