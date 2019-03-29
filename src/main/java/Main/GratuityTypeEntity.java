package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Gratuity_Type", schema = "dbo", catalog = "newDB")
public class GratuityTypeEntity {
    private int gratuityType;
    private int gratuityPercentage;
    private Collection<GratuityEntity> gratuitiesByGratuityType;

    @Id
    @Column(name = "Gratuity_Type", nullable = false)
    public int getGratuityType() {
        return gratuityType;
    }

    public void setGratuityType(int gratuityType) {
        this.gratuityType = gratuityType;
    }

    @Basic
    @Column(name = "Gratuity_Percentage", nullable = false)
    public int getGratuityPercentage() {
        return gratuityPercentage;
    }

    public void setGratuityPercentage(int gratuityPercentage) {
        this.gratuityPercentage = gratuityPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GratuityTypeEntity that = (GratuityTypeEntity) o;

        if (gratuityType != that.gratuityType) return false;
        if (gratuityPercentage != that.gratuityPercentage) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gratuityType;
        result = 31 * result + gratuityPercentage;
        return result;
    }

    @OneToMany(mappedBy = "gratuityTypeByGratuityType")
    public Collection<GratuityEntity> getGratuitiesByGratuityType() {
        return gratuitiesByGratuityType;
    }

    public void setGratuitiesByGratuityType(Collection<GratuityEntity> gratuitiesByGratuityType) {
        this.gratuitiesByGratuityType = gratuitiesByGratuityType;
    }
}
