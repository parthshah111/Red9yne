package Main;

import javax.persistence.*;

@Entity
@Table(name = "Gratuity", schema = "dbo", catalog = "newDB")
public class GratuityEntity {
    private int gratuityOrderId;
    private String gratuityType;
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
    @Column(name = "Gratuity_Type", nullable = false, length = 255)
    public String getGratuityType() {
        return gratuityType;
    }

    public void setGratuityType(String gratuityType) {
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

        GratuityEntity that = (GratuityEntity) o;

        if (gratuityOrderId != that.gratuityOrderId) return false;
        if (Double.compare(that.gratuityTotal, gratuityTotal) != 0) return false;
        if (gratuityType != null ? !gratuityType.equals(that.gratuityType) : that.gratuityType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = gratuityOrderId;
        result = 31 * result + (gratuityType != null ? gratuityType.hashCode() : 0);
        temp = Double.doubleToLongBits(gratuityTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
