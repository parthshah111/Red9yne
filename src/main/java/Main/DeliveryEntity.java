package Main;

import javax.persistence.*;

@Entity
@Table(name = "Delivery", schema = "dbo", catalog = "DBdummy2")
public class DeliveryEntity {
    private int deliveryId;
    private double deliveryFee;

    @Id
    @Column(name = "DELIVERY_ID")
    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Basic
    @Column(name = "DELIVERY_FEE")
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
}
