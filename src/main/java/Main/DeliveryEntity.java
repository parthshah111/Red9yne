package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Delivery", schema = "dbo", catalog = "newDB")
public class DeliveryEntity {
    private int deliveryId;
    private double deliveryFee;
    private Collection<OrderEntity> ordersByDeliveryId;

    @Id
    @Column(name = "DELIVERY_ID", nullable = false)
    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Basic
    @Column(name = "DELIVERY_FEE", nullable = false, precision = 0)
    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryEntity that = (DeliveryEntity) o;

        if (deliveryId != that.deliveryId) return false;
        if (Double.compare(that.deliveryFee, deliveryFee) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = deliveryId;
        temp = Double.doubleToLongBits(deliveryFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "deliveryByDeliveryId")
    public Collection<OrderEntity> getOrdersByDeliveryId() {
        return ordersByDeliveryId;
    }

    public void setOrdersByDeliveryId(Collection<OrderEntity> ordersByDeliveryId) {
        this.ordersByDeliveryId = ordersByDeliveryId;
    }
}
