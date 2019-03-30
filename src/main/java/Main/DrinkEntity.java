package Main;

import javax.persistence.*;

@Entity
@Table(name = "Drink", schema = "dbo", catalog = "DBdummy2")
public class DrinkEntity {
    private int drinkId;
    private String drinkName;
    private String drinkDesc;

    @Id
    @Column(name = "DRINK_ID")
    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    @Basic
    @Column(name = "DRINK_NAME")
    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Basic
    @Column(name = "DRINK_DESC")
    public String getDrinkDesc() {
        return drinkDesc;
    }

    public void setDrinkDesc(String drinkDesc) {
        this.drinkDesc = drinkDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkEntity that = (DrinkEntity) o;

        if (drinkId != that.drinkId) return false;
        if (drinkName != null ? !drinkName.equals(that.drinkName) : that.drinkName != null) return false;
        if (drinkDesc != null ? !drinkDesc.equals(that.drinkDesc) : that.drinkDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = drinkId;
        result = 31 * result + (drinkName != null ? drinkName.hashCode() : 0);
        result = 31 * result + (drinkDesc != null ? drinkDesc.hashCode() : 0);
        return result;
    }
}
