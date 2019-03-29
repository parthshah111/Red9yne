package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Order_Status", schema = "dbo", catalog = "newDB")
public class OrderStatusEntity {
    private int orderStatus;
    private int orderDesc;
    private Collection<OrderEntity> ordersByOrderStatus;

    @Id
    @Column(name = "Order_Status", nullable = false)
    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "Order_Desc", nullable = false)
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

    @OneToMany(mappedBy = "orderStatusByOrderStatus")
    public Collection<OrderEntity> getOrdersByOrderStatus() {
        return ordersByOrderStatus;
    }

    public void setOrdersByOrderStatus(Collection<OrderEntity> ordersByOrderStatus) {
        this.ordersByOrderStatus = ordersByOrderStatus;
    }
}
