package Main;

import javax.persistence.*;

@Entity
@Table(name = "Tax", schema = "dbo", catalog = "newDB")
public class TaxEntity {
    private int gratuityOrderId;
    private int gratuityType;
    private double gratuityTotal;

    @Id
    @Column(name = "GratuityOrder_ID", nullable = false)
    public int getGratuityOrderId() {
        return gratuityOrderId;
    }

    public void setGratuityOrderId(int gratuityOrderId) {
        this.gratuityOrderId = gratuityOrderId;
    }

    @Basic
    @Column(name = "Gratuity_Type", nullable = false)
    public int getGratuityType() {
        return gratuityType;
    }

    public void setGratuityType(int gratuityType) {
        this.gratuityType = gratuityType;
    }

    @Basic
    @Column(name = "Gratuity_Total", nullable = false, precision = 0)
    public double getGratuityTotal() {
        return gratuityTotal;
    }

    public void setGratuityTotal(double gratuityTotal) {
        this.gratuityTotal = gratuityTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxEntity taxEntity = (TaxEntity) o;

        if (gratuityOrderId != taxEntity.gratuityOrderId) return false;
        if (gratuityType != taxEntity.gratuityType) return false;
        if (Double.compare(taxEntity.gratuityTotal, gratuityTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = gratuityOrderId;
        result = 31 * result + gratuityType;
        temp = Double.doubleToLongBits(gratuityTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
