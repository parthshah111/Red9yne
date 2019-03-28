package Main;

import javax.persistence.*;

@Entity
@Table(name = "Dessert", schema = "dbo", catalog = "newDB")
public class DessertEntity {
    private int dessertId;
    private String dessertName;
    private String dessertDesc;
    private Object dessertPrice;

    @Id
    @Column(name = "Dessert_ID", nullable = false)
    public int getDessertId() {
        return dessertId;
    }

    public void setDessertId(int dessertId) {
        this.dessertId = dessertId;
    }

    @Basic
    @Column(name = "Dessert_name", nullable = false, length = 50)
    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    @Basic
    @Column(name = "Dessert_desc", nullable = false, length = 100)
    public String getDessertDesc() {
        return dessertDesc;
    }

    public void setDessertDesc(String dessertDesc) {
        this.dessertDesc = dessertDesc;
    }

    @Basic
    @Column(name = "Dessert_price", nullable = false)
    public Object getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(Object dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DessertEntity that = (DessertEntity) o;

        if (dessertId != that.dessertId) return false;
        if (dessertName != null ? !dessertName.equals(that.dessertName) : that.dessertName != null) return false;
        if (dessertDesc != null ? !dessertDesc.equals(that.dessertDesc) : that.dessertDesc != null) return false;
        if (dessertPrice != null ? !dessertPrice.equals(that.dessertPrice) : that.dessertPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dessertId;
        result = 31 * result + (dessertName != null ? dessertName.hashCode() : 0);
        result = 31 * result + (dessertDesc != null ? dessertDesc.hashCode() : 0);
        result = 31 * result + (dessertPrice != null ? dessertPrice.hashCode() : 0);
        return result;
    }
}
