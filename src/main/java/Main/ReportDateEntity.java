package Main;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "ReportDate", schema = "dbo", catalog = "newDB")
public class ReportDateEntity {
    private int reportId;
    private Timestamp reportDate;
    private double grandTotal;
    private Collection<DessertMenuEntity> dessertMenusByReportId;
    private Collection<DrinkMenuEntity> drinkMenusByReportId;
    private Collection<EventEntity> eventsByReportId;
    private Collection<GratuityEntity> gratuitiesByReportId;
    private Collection<LateFeeEntity> lateFeesByReportId;
    private Collection<ManagerNoteEntity> managerNotesByReportId;
    private Collection<MenuTotalEntity> menuTotalsByReportId;
    private Collection<OrderEntity> ordersByReportId;
    private Collection<PaymentInformationEntity> paymentInformationsByReportId;
    private Collection<StaffEntity> staffByReportId;
    private Collection<SupplyTotalEntity> supplyTotalsByReportId;
    private Collection<TaxEntity> taxesByReportId;

    @Id
    @Column(name = "Report_ID", nullable = false)
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "REPORT_DATE", nullable = false)
    public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }

    @Basic
    @Column(name = "GRAND_TOTAL", nullable = false, precision = 0)
    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportDateEntity that = (ReportDateEntity) o;

        if (reportId != that.reportId) return false;
        if (Double.compare(that.grandTotal, grandTotal) != 0) return false;
        if (reportDate != null ? !reportDate.equals(that.reportDate) : that.reportDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reportId;
        result = 31 * result + (reportDate != null ? reportDate.hashCode() : 0);
        temp = Double.doubleToLongBits(grandTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<DessertMenuEntity> getDessertMenusByReportId() {
        return dessertMenusByReportId;
    }

    public void setDessertMenusByReportId(Collection<DessertMenuEntity> dessertMenusByReportId) {
        this.dessertMenusByReportId = dessertMenusByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<DrinkMenuEntity> getDrinkMenusByReportId() {
        return drinkMenusByReportId;
    }

    public void setDrinkMenusByReportId(Collection<DrinkMenuEntity> drinkMenusByReportId) {
        this.drinkMenusByReportId = drinkMenusByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<EventEntity> getEventsByReportId() {
        return eventsByReportId;
    }

    public void setEventsByReportId(Collection<EventEntity> eventsByReportId) {
        this.eventsByReportId = eventsByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<GratuityEntity> getGratuitiesByReportId() {
        return gratuitiesByReportId;
    }

    public void setGratuitiesByReportId(Collection<GratuityEntity> gratuitiesByReportId) {
        this.gratuitiesByReportId = gratuitiesByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<LateFeeEntity> getLateFeesByReportId() {
        return lateFeesByReportId;
    }

    public void setLateFeesByReportId(Collection<LateFeeEntity> lateFeesByReportId) {
        this.lateFeesByReportId = lateFeesByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<ManagerNoteEntity> getManagerNotesByReportId() {
        return managerNotesByReportId;
    }

    public void setManagerNotesByReportId(Collection<ManagerNoteEntity> managerNotesByReportId) {
        this.managerNotesByReportId = managerNotesByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<MenuTotalEntity> getMenuTotalsByReportId() {
        return menuTotalsByReportId;
    }

    public void setMenuTotalsByReportId(Collection<MenuTotalEntity> menuTotalsByReportId) {
        this.menuTotalsByReportId = menuTotalsByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<OrderEntity> getOrdersByReportId() {
        return ordersByReportId;
    }

    public void setOrdersByReportId(Collection<OrderEntity> ordersByReportId) {
        this.ordersByReportId = ordersByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<PaymentInformationEntity> getPaymentInformationsByReportId() {
        return paymentInformationsByReportId;
    }

    public void setPaymentInformationsByReportId(Collection<PaymentInformationEntity> paymentInformationsByReportId) {
        this.paymentInformationsByReportId = paymentInformationsByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<StaffEntity> getStaffByReportId() {
        return staffByReportId;
    }

    public void setStaffByReportId(Collection<StaffEntity> staffByReportId) {
        this.staffByReportId = staffByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<SupplyTotalEntity> getSupplyTotalsByReportId() {
        return supplyTotalsByReportId;
    }

    public void setSupplyTotalsByReportId(Collection<SupplyTotalEntity> supplyTotalsByReportId) {
        this.supplyTotalsByReportId = supplyTotalsByReportId;
    }

    @OneToMany(mappedBy = "reportDateByReportId")
    public Collection<TaxEntity> getTaxesByReportId() {
        return taxesByReportId;
    }

    public void setTaxesByReportId(Collection<TaxEntity> taxesByReportId) {
        this.taxesByReportId = taxesByReportId;
    }
}
