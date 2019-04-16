package Main;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Late_Fee", schema = "dbo", catalog = "DBdummy3")
public class LateFeeEntity {
    private int rentalId;
    private Timestamp rentalExp;
    private Timestamp rentalReturn;
    private Timestamp lateDay;
    private double lateFee;
    private double lateTotal;

    @Id
    @Column(name = "Rental_ID", nullable = false)
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    @Basic
    @Column(name = "Rental_Exp", nullable = false)
    public Timestamp getRentalExp() {
        return rentalExp;
    }

    public void setRentalExp(Timestamp rentalExp) {
        this.rentalExp = rentalExp;
    }

    @Basic
    @Column(name = "Rental_Return", nullable = false)
    public Timestamp getRentalReturn() {
        return rentalReturn;
    }

    public void setRentalReturn(Timestamp rentalReturn) {
        this.rentalReturn = rentalReturn;
    }

    @Basic
    @Column(name = "Late_Day", nullable = false)
    public Timestamp getLateDay() {
        return lateDay;
    }

    public void setLateDay(Timestamp lateDay) {
        this.lateDay = lateDay;
    }

    @Basic
    @Column(name = "Late_Fee", nullable = false, precision = 0)
    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Basic
    @Column(name = "Late_Total", nullable = false, precision = 0)
    public double getLateTotal() {
        return lateTotal;
    }

    public void setLateTotal(double lateTotal) {
        this.lateTotal = lateTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LateFeeEntity that = (LateFeeEntity) o;

        if (rentalId != that.rentalId) return false;
        if (Double.compare(that.lateFee, lateFee) != 0) return false;
        if (Double.compare(that.lateTotal, lateTotal) != 0) return false;
        if (rentalExp != null ? !rentalExp.equals(that.rentalExp) : that.rentalExp != null) return false;
        if (rentalReturn != null ? !rentalReturn.equals(that.rentalReturn) : that.rentalReturn != null) return false;
        if (lateDay != null ? !lateDay.equals(that.lateDay) : that.lateDay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = rentalId;
        result = 31 * result + (rentalExp != null ? rentalExp.hashCode() : 0);
        result = 31 * result + (rentalReturn != null ? rentalReturn.hashCode() : 0);
        result = 31 * result + (lateDay != null ? lateDay.hashCode() : 0);
        temp = Double.doubleToLongBits(lateFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lateTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
