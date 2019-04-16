package Main;

import javax.persistence.*;

@Entity
@Table(name = "Menu_Total", schema = "dbo", catalog = "DBdummy3")
public class MenuTotalEntity {
    private int foodMenuId;
    private int foodQty;
    private double foodTotal;
//    public FoodEntity foodEntity;
//
//    @ManyToOne
//    @JoinColumn(name = "Food_ID", referencedColumnName = "Food_ID")
//    public FoodEntity getFoodEntity() {
//        return foodEntity;
//    }
//
//    public void setFoodEntity(FoodEntity foodEntity) {
//        this.foodEntity = foodEntity;
//    }
//

    @Id
    @Column(name = "FoodMenu_ID", nullable = false)
    public int getFoodMenuId() {
        return foodMenuId;
    }

    public void setFoodMenuId(int foodMenuId) {
        this.foodMenuId = foodMenuId;
    }

    @Basic
    @Column(name = "Food_Qty", nullable = false)
    public int getFoodQty() {
        return foodQty;
    }

    public void setFoodQty(int foodQty) {
        this.foodQty = foodQty;
    }

    @Basic
    @Column(name = "Food_Total", nullable = false, precision = 0)
    public double getFoodTotal() {
        return foodTotal;
    }

    public void setFoodTotal(double foodTotal) {
        this.foodTotal = foodTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuTotalEntity that = (MenuTotalEntity) o;

        if (foodMenuId != that.foodMenuId) return false;
        if (foodQty != that.foodQty) return false;
        if (Double.compare(that.foodTotal, foodTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = foodMenuId;
        result = 31 * result + foodQty;
        temp = Double.doubleToLongBits(foodTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
