package Main;

import javax.persistence.*;

@Entity
@Table(name = "Food", schema = "dbo", catalog = "newDB")
public class FoodEntity {
    private int foodId;
    private String foodType;
    private String foodName;
    private Object foodPrice;

    @Id
    @Column(name = "Food_ID", nullable = false)
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Basic
    @Column(name = "Food_Type", nullable = false, length = 255)
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Basic
    @Column(name = "Food_Name", nullable = false, length = 255)
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Basic
    @Column(name = "Food_Price", nullable = false)
    public Object getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Object foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodEntity that = (FoodEntity) o;

        if (foodId != that.foodId) return false;
        if (foodType != null ? !foodType.equals(that.foodType) : that.foodType != null) return false;
        if (foodName != null ? !foodName.equals(that.foodName) : that.foodName != null) return false;
        if (foodPrice != null ? !foodPrice.equals(that.foodPrice) : that.foodPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = foodId;
        result = 31 * result + (foodType != null ? foodType.hashCode() : 0);
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        result = 31 * result + (foodPrice != null ? foodPrice.hashCode() : 0);
        return result;
    }
}
