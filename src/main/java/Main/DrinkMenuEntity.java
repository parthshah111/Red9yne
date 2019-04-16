package Main;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Drink_Menu", schema = "dbo", catalog = "DBdummy3")
public class DrinkMenuEntity {
    private int drinkMenuId;
    private int drinkQty;
    private double drinkTotal;

    //--------------------------------------DrinkMenu->Drink Relationship-----------------
    public DrinkEntity drinkEntity;

    @ManyToOne
    @JoinColumn(name = "Drink_id", referencedColumnName = "drink_id")
    public DrinkEntity getDrinkEntity() {
        return drinkEntity;
    }

    public void setDrinkEntity(DrinkEntity drinkEntity) {
        this.drinkEntity = drinkEntity;
    }
    //======================================================================================
    //------------------------------Order->DrinkMenu Relation-------------------------------
    public List<OrderTableEntity> orderTableEntities;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "drinkMenuEntity", cascade = CascadeType.ALL)
    public List<OrderTableEntity> getOrderTableEntities() {
        return orderTableEntities;
    }

    public void setOrderTableEntities(List<OrderTableEntity> orderTableEntities) {
        this.orderTableEntities = orderTableEntities;
    }
    //============================================================================================



//    private DrinkMenuEntity drinkMenuEntity;
//    @Id
//    @GeneratedValue
//    @Column(name="Drink_ID")
//    private int Drink_ID;
//
//    @ManyToOne
//    @JoinColumn(name = "Drink_ID")
//    private DrinkEntity drinkEntity;

//    @ManyToOne
//    @JoinColumn(name = "Drink_ID", referencedColumnName = "Drink_ID")
//    public DrinkMenuEntity getDrinkMenuEntity() {
//        return drinkMenuEntity;
//    }
//
//    public void setDrinkMenuEntity(DrinkMenuEntity drinkMenuEntity) {
//        this.drinkMenuEntity = drinkMenuEntity;
//    }

    @Id
    @Column(name = "Drink_MenuID", nullable = false)
    public int getDrinkMenuId() {
        return drinkMenuId;
    }

    public void setDrinkMenuId(int drinkMenuId) {
        this.drinkMenuId = drinkMenuId;
    }

    @Basic
    @Column(name = "Drink_Qty", nullable = false)
    public int getDrinkQty() {
        return drinkQty;
    }

    public void setDrinkQty(int drinkQty) {
        this.drinkQty = drinkQty;
    }

    @Basic
    @Column(name = "Drink_Total", nullable = false, precision = 0)
    public double getDrinkTotal() {
        return drinkTotal;
    }

    public void setDrinkTotal(double drinkTotal) {
        this.drinkTotal = drinkTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkMenuEntity that = (DrinkMenuEntity) o;

        if (drinkMenuId != that.drinkMenuId) return false;
        if (drinkQty != that.drinkQty) return false;
        if (Double.compare(that.drinkTotal, drinkTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = drinkMenuId;
        result = 31 * result + drinkQty;
        temp = Double.doubleToLongBits(drinkTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
