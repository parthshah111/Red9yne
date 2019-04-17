package Main;

import javax.persistence.*;

@Entity
@Table(name = "Tax_Type", schema = "dbo", catalog = "DBdummy3")
public class TaxTypeEntity {
    private int taxTypeId;
    private int taxPercentage;

    @Id
    @Column(name = "Tax_TypeID", nullable = false)
    public int getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(int taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    @Basic
    @Column(name = "Tax_Percentage", nullable = false)
    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxTypeEntity that = (TaxTypeEntity) o;

        if (taxTypeId != that.taxTypeId) return false;
        if (taxPercentage != that.taxPercentage) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taxTypeId;
        result = 31 * result + taxPercentage;
        return result;
    }
}
