package Main;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dessert_Menu", schema = "dbo", catalog = "DBdummy3")
public class DessertMenuEntity {
    private int dessertMenuId;
    private int dessertQty;
    private double dessertTotal;

    public DessertEntity dessertEntity;

    @ManyToOne
    @JoinColumn(name = "Dessert_ID", referencedColumnName = "Dessert_ID")
    public DessertEntity getDessertEntity() {
        return dessertEntity;
    }

    public void setDessertEntity(DessertEntity dessertEntity) {
        this.dessertEntity = dessertEntity;
    }
    //======================================================================================
    public List<OrderTableEntity> orderTableEntities;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "dessertMenuEntity", cascade = CascadeType.ALL)
    public List<OrderTableEntity> getOrderTableEntities() {
        return orderTableEntities;
    }

    public void setOrderTableEntities(List<OrderTableEntity> orderTableEntities) {
        this.orderTableEntities = orderTableEntities;
    }
    //============================================================================================

    @Id
    @Column(name = "Dessert_MenuID", nullable = false)
    public int getDessertMenuId() {
        return dessertMenuId;
    }

    public void setDessertMenuId(int dessertMenuId) {
        this.dessertMenuId = dessertMenuId;
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
    @Column(name = "Dessert_Total", nullable = false, precision = 0)
    public double getDessertTotal() {
        return dessertTotal;
    }

    public void setDessertTotal(double dessertTotal) {
        this.dessertTotal = dessertTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DessertMenuEntity that = (DessertMenuEntity) o;

        if (dessertMenuId != that.dessertMenuId) return false;
        if (dessertQty != that.dessertQty) return false;
        if (Double.compare(that.dessertTotal, dessertTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = dessertMenuId;
        result = 31 * result + dessertQty;
        temp = Double.doubleToLongBits(dessertTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
