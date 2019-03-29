package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Tax_Type", schema = "dbo", catalog = "newDB")
public class TaxTypeEntity {
    private int taxType;
    private int taxPercentage;
    private Collection<TaxEntity> taxesByTaxType;

    @Id
    @Column(name = "Tax_Type", nullable = false)
    public int getTaxType() {
        return taxType;
    }

    public void setTaxType(int taxType) {
        this.taxType = taxType;
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

        if (taxType != that.taxType) return false;
        if (taxPercentage != that.taxPercentage) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taxType;
        result = 31 * result + taxPercentage;
        return result;
    }

    @OneToMany(mappedBy = "taxTypeByTaxType")
    public Collection<TaxEntity> getTaxesByTaxType() {
        return taxesByTaxType;
    }

    public void setTaxesByTaxType(Collection<TaxEntity> taxesByTaxType) {
        this.taxesByTaxType = taxesByTaxType;
    }
}
