package Main;

import javax.persistence.*;

@Entity
@Table(name = "Food", schema = "dbo", catalog = "DBdummy2")
public class FoodEntity {
    private int foodId;
    private int foodType;
    private String foodName;
    private double foodPrice;

    @Id
    @Column(name = "Food_ID")
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Basic
    @Column(name = "Food_Type")
    public int getFoodType() {
        return foodType;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    }

    @Basic
    @Column(name = "Food_Name")
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Basic
    @Column(name = "Food_Price")
    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodEntity that = (FoodEntity) o;

        if (foodId != that.foodId) return false;
        if (foodType != that.foodType) return false;
        if (Double.compare(that.foodPrice, foodPrice) != 0) return false;
        if (foodName != null ? !foodName.equals(that.foodName) : that.foodName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = foodId;
        result = 31 * result + foodType;
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        temp = Double.doubleToLongBits(foodPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
