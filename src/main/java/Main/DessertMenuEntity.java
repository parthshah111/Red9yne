package Main;

import javax.persistence.*;

@Entity
@Table(name = "Dessert_Menu", schema = "dbo", catalog = "newDB")
public class DessertMenuEntity {
    private int dessertMenu;
    private int dessertQty;
    private int dessertTotal;

    @Id
    @Column(name = "Dessert_Menu", nullable = false)
    public int getDessertMenu() {
        return dessertMenu;
    }

    public void setDessertMenu(int dessertMenu) {
        this.dessertMenu = dessertMenu;
    }

    @Basic
    @Column(name = "Dessert_Qty", nullable = false)
    public int getDessertQty() {
        return dessertQty;
    }

    public void setDessertQty(int dessertQty) {
        this.dessertQty = dessertQty;
    }

    @Basic
    @Column(name = "Dessert_Total", nullable = false)
    public int getDessertTotal() {
        return dessertTotal;
    }

    public void setDessertTotal(int dessertTotal) {
        this.dessertTotal = dessertTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DessertMenuEntity that = (DessertMenuEntity) o;

        if (dessertMenu != that.dessertMenu) return false;
        if (dessertQty != that.dessertQty) return false;
        if (dessertTotal != that.dessertTotal) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dessertMenu;
        result = 31 * result + dessertQty;
        result = 31 * result + dessertTotal;
        return result;
    }
}
