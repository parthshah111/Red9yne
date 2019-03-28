package Main;

import javax.persistence.*;

@Entity
@Table(name = "Order", schema = "dbo", catalog = "newDB")
public class OrderEntity {
    private int orderNo;
    private int taxOrderId;
    private Object orderTotal;

    @Id
    @Column(name = "Order_no", nullable = false)
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "TaxOrder_ID", nullable = false)
    public int getTaxOrderId() {
        return taxOrderId;
    }

    public void setTaxOrderId(int taxOrderId) {
        this.taxOrderId = taxOrderId;
    }

    @Basic
    @Column(name = "Order_Total", nullable = false)
    public Object getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Object orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orderNo != that.orderNo) return false;
        if (taxOrderId != that.taxOrderId) return false;
        if (orderTotal != null ? !orderTotal.equals(that.orderTotal) : that.orderTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNo;
        result = 31 * result + taxOrderId;
        result = 31 * result + (orderTotal != null ? orderTotal.hashCode() : 0);
        return result;
    }
}
