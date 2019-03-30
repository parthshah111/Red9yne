package Main;

import javax.persistence.*;

@Entity
@Table(name = "Tax_Type", schema = "dbo", catalog = "DBdummy2")
public class TaxTypeEntity {
    private int taxType;
    private int taxPercentage;

    @Id
    @Column(name = "Tax_Type")
    public int getTaxType() {
        return taxType;
    }

    public void setTaxType(int taxType) {
        this.taxType = taxType;
    }

    @Basic
    @Column(name = "Tax_Percentage")
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
}
