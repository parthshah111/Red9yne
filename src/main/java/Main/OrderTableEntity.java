package Main;

import javax.persistence.*;

@Entity
@Table(name = "Order_Table", schema = "dbo", catalog = "DBdummy3")
public class OrderTableEntity {
    private int orderNo;
    private double orderTotal;
    public CustomerEntity customerEntity;
    public OrderStatusEntity orderStatusEntity;
    public MenuTotalEntity menuTotalEntity;
    public DrinkMenuEntity drinkMenuEntity;

    @ManyToOne
    @JoinColumn(name = "Drink_MenuID", referencedColumnName = "Drink_MenuID")
    public DrinkMenuEntity getDrinkMenuEntity() {
        return drinkMenuEntity;
    }

    public void setDrinkMenuEntity(DrinkMenuEntity drinkMenuEntity) {
        this.drinkMenuEntity = drinkMenuEntity;
    }


//    @ManyToOne
//    @JoinColumn(name = "FoodMenu_ID", referencedColumnName = "FoodMenu_ID")
//    public MenuTotalEntity getMenuTotalEntity() { return menuTotalEntity;
//    }
//
//    public void setMenuTotalEntity(MenuTotalEntity menuTotalEntity) {
//        this.menuTotalEntity = menuTotalEntity;
//    }

    @ManyToOne
    @JoinColumn(name = "Order_StatusID", referencedColumnName = "Order_StatusID")
    public OrderStatusEntity getOrderStatusEntity() {
        return orderStatusEntity;
    }

    public void setOrderStatusEntity(OrderStatusEntity orderStatusEntity) {
        this.orderStatusEntity = orderStatusEntity;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_ID")
    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }


    @Id
    @Column(name = "Order_no", nullable = false)
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "Order_Total", nullable = false, precision = 0)
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

        OrderTableEntity that = (OrderTableEntity) o;

        if (orderNo != that.orderNo) return false;
        if (Double.compare(that.orderTotal, orderTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderNo;
        temp = Double.doubleToLongBits(orderTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
