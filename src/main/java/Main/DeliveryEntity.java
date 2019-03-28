package Main;

import javax.persistence.*;

@Entity
@Table(name = "Delivery", schema = "dbo", catalog = "newDB")
public class DeliveryEntity {
    private int deliveryId;
    private Object deliveryFee;

    @Id
    @Column(name = "DELIVERY_ID", nullable = false)
    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Basic
    @Column(name = "DELIVERY_FEE", nullable = false)
    public Object getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Object deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryEntity that = (DeliveryEntity) o;

        if (deliveryId != that.deliveryId) return false;
        if (deliveryFee != null ? !deliveryFee.equals(that.deliveryFee) : that.deliveryFee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deliveryId;
        result = 31 * result + (deliveryFee != null ? deliveryFee.hashCode() : 0);
        return result;
    }
}
