package Main;

import javax.persistence.*;

@Entity
@Table(name = "Order_Status", schema = "dbo", catalog = "DBdummy2")
public class OrderStatusEntity {
    private int orderStatus;
    private int orderDesc;

    @Id
    @Column(name = "Order_Status")
    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "Order_Desc")
    public int getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(int orderDesc) {
        this.orderDesc = orderDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderStatusEntity that = (OrderStatusEntity) o;

        if (orderStatus != that.orderStatus) return false;
        if (orderDesc != that.orderDesc) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderStatus;
        result = 31 * result + orderDesc;
        return result;
    }
}
