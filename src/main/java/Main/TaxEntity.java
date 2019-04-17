package Main;

import javax.persistence.*;

@Entity
@Table(name = "Tax", schema = "dbo", catalog = "DBdummy3")
public class TaxEntity {
    private int taxId;
    private double taxTotal;

    @Id
    @Column(name = "Tax_ID", nullable = false)
    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Basic
    @Column(name = "Tax_Total", nullable = false, precision = 0)
    public double getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(double taxTotal) {
        this.taxTotal = taxTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxEntity taxEntity = (TaxEntity) o;

        if (taxId != taxEntity.taxId) return false;
        if (Double.compare(taxEntity.taxTotal, taxTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = taxId;
        temp = Double.doubleToLongBits(taxTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
