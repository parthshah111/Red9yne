package Main;

import javax.persistence.*;

@Entity
@Table(name = "Food", schema = "dbo", catalog = "DBdummy3")
public class FoodEntity {
    private int foodId;
    private String foodName;
    private double foodPrice;

    @Id
    @Column(name = "Food_ID", nullable = false)
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
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
    @Column(name = "Food_Price", nullable = false, precision = 0)
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
        if (Double.compare(that.foodPrice, foodPrice) != 0) return false;
        if (foodName != null ? !foodName.equals(that.foodName) : that.foodName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = foodId;
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        temp = Double.doubleToLongBits(foodPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
