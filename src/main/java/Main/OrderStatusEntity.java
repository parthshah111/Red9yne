package Main;

import javax.persistence.*;

@Entity
@Table(name = "Order_Status", schema = "dbo", catalog = "DBdummy3")
public class OrderStatusEntity {
    private int orderStatusId;
    private String orderDesc;



    @Id
    @Column(name = "Order_StatusID", nullable = false)
    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    @Basic
    @Column(name = "Order_Desc", nullable = false, length = 24)
    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderStatusEntity that = (OrderStatusEntity) o;

        if (orderStatusId != that.orderStatusId) return false;
        if (orderDesc != null ? !orderDesc.equals(that.orderDesc) : that.orderDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderStatusId;
        result = 31 * result + (orderDesc != null ? orderDesc.hashCode() : 0);
        return result;
    }
}
