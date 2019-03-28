package Main;

import javax.persistence.*;

@Entity
@Table(name = "Menu_Total", schema = "dbo", catalog = "newDB")
public class MenuTotalEntity {
    private int foodMenuId;
    private int foodQty;
    private int foodTotal;

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
    @Column(name = "Food_Total", nullable = false)
    public int getFoodTotal() {
        return foodTotal;
    }

    public void setFoodTotal(int foodTotal) {
        this.foodTotal = foodTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuTotalEntity that = (MenuTotalEntity) o;

        if (foodMenuId != that.foodMenuId) return false;
        if (foodQty != that.foodQty) return false;
        if (foodTotal != that.foodTotal) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = foodMenuId;
        result = 31 * result + foodQty;
        result = 31 * result + foodTotal;
        return result;
    }
}
