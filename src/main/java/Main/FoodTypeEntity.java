package Main;

import javax.persistence.*;

@Entity
@Table(name = "FoodType", schema = "dbo", catalog = "newDB")
public class FoodTypeEntity {
    private int foodType;
    private String foodDesc;

    @Id
    @Column(name = "Food_Type", nullable = false)
    public int getFoodType() {
        return foodType;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    }

    @Basic
    @Column(name = "Food_Desc", nullable = false, length = 255)
    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodTypeEntity that = (FoodTypeEntity) o;

        if (foodType != that.foodType) return false;
        if (foodDesc != null ? !foodDesc.equals(that.foodDesc) : that.foodDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = foodType;
        result = 31 * result + (foodDesc != null ? foodDesc.hashCode() : 0);
        return result;
    }
}
