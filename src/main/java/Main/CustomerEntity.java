package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Customer", schema = "dbo", catalog = "newDB")
public class CustomerEntity {
    private int customerId;
    private String customerFname;
    private String customerLname;
    private String customerAddress;
    private String customerCity;
    private String customerState;
    private String customerCountry;
    private String customerPhone;
    private String customerAltcontact;
    private String customerEmail;
    private Collection<AppointmentCustomerEntity> appointmentCustomersByCustomerId;
    private Collection<DessertMenuEntity> dessertMenusByCustomerId;
    private Collection<DrinkMenuEntity> drinkMenusByCustomerId;
    private Collection<EventEntity> eventsByCustomerId;
    private Collection<GratuityEntity> gratuitiesByCustomerId;
    private Collection<LateFeeEntity> lateFeesByCustomerId;
    private Collection<ManagerNoteEntity> managerNotesByCustomerId;
    private Collection<MenuTotalEntity> menuTotalsByCustomerId;
    private Collection<OrderEntity> ordersByCustomerId;
    private Collection<PaymentInformationEntity> paymentInformationsByCustomerId;
    private Collection<StaffEntity> staffByCustomerId;
    private Collection<SupplyTotalEntity> supplyTotalsByCustomerId;
    private Collection<TaxEntity> taxesByCustomerId;

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "CUSTOMER_FNAME", nullable = false, length = 24)
    public String getCustomerFname() {
        return customerFname;
    }

    public void setCustomerFname(String customerFname) {
        this.customerFname = customerFname;
    }

    @Basic
    @Column(name = "CUSTOMER_LNAME", nullable = false, length = 24)
    public String getCustomerLname() {
        return customerLname;
    }

    public void setCustomerLname(String customerLname) {
        this.customerLname = customerLname;
    }

    @Basic
    @Column(name = "CUSTOMER_ADDRESS", nullable = false, length = 50)
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Basic
    @Column(name = "CUSTOMER_CITY", nullable = false, length = 24)
    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    @Basic
    @Column(name = "CUSTOMER_STATE", nullable = false, length = 24)
    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    @Basic
    @Column(name = "CUSTOMER_COUNTRY", nullable = false, length = 24)
    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    @Basic
    @Column(name = "CUSTOMER_PHONE", nullable = false, length = 24)
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Basic
    @Column(name = "CUSTOMER_ALTCONTACT", nullable = true, length = 24)
    public String getCustomerAltcontact() {
        return customerAltcontact;
    }

    public void setCustomerAltcontact(String customerAltcontact) {
        this.customerAltcontact = customerAltcontact;
    }

    @Basic
    @Column(name = "CUSTOMER_EMAIL", nullable = false, length = 24)
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (customerId != that.customerId) return false;
        if (customerFname != null ? !customerFname.equals(that.customerFname) : that.customerFname != null)
            return false;
        if (customerLname != null ? !customerLname.equals(that.customerLname) : that.customerLname != null)
            return false;
        if (customerAddress != null ? !customerAddress.equals(that.customerAddress) : that.customerAddress != null)
            return false;
        if (customerCity != null ? !customerCity.equals(that.customerCity) : that.customerCity != null) return false;
        if (customerState != null ? !customerState.equals(that.customerState) : that.customerState != null)
            return false;
        if (customerCountry != null ? !customerCountry.equals(that.customerCountry) : that.customerCountry != null)
            return false;
        if (customerPhone != null ? !customerPhone.equals(that.customerPhone) : that.customerPhone != null)
            return false;
        if (customerAltcontact != null ? !customerAltcontact.equals(that.customerAltcontact) : that.customerAltcontact != null)
            return false;
        if (customerEmail != null ? !customerEmail.equals(that.customerEmail) : that.customerEmail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerFname != null ? customerFname.hashCode() : 0);
        result = 31 * result + (customerLname != null ? customerLname.hashCode() : 0);
        result = 31 * result + (customerAddress != null ? customerAddress.hashCode() : 0);
        result = 31 * result + (customerCity != null ? customerCity.hashCode() : 0);
        result = 31 * result + (customerState != null ? customerState.hashCode() : 0);
        result = 31 * result + (customerCountry != null ? customerCountry.hashCode() : 0);
        result = 31 * result + (customerPhone != null ? customerPhone.hashCode() : 0);
        result = 31 * result + (customerAltcontact != null ? customerAltcontact.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<AppointmentCustomerEntity> getAppointmentCustomersByCustomerId() {
        return appointmentCustomersByCustomerId;
    }

    public void setAppointmentCustomersByCustomerId(Collection<AppointmentCustomerEntity> appointmentCustomersByCustomerId) {
        this.appointmentCustomersByCustomerId = appointmentCustomersByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<DessertMenuEntity> getDessertMenusByCustomerId() {
        return dessertMenusByCustomerId;
    }

    public void setDessertMenusByCustomerId(Collection<DessertMenuEntity> dessertMenusByCustomerId) {
        this.dessertMenusByCustomerId = dessertMenusByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<DrinkMenuEntity> getDrinkMenusByCustomerId() {
        return drinkMenusByCustomerId;
    }

    public void setDrinkMenusByCustomerId(Collection<DrinkMenuEntity> drinkMenusByCustomerId) {
        this.drinkMenusByCustomerId = drinkMenusByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<EventEntity> getEventsByCustomerId() {
        return eventsByCustomerId;
    }

    public void setEventsByCustomerId(Collection<EventEntity> eventsByCustomerId) {
        this.eventsByCustomerId = eventsByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<GratuityEntity> getGratuitiesByCustomerId() {
        return gratuitiesByCustomerId;
    }

    public void setGratuitiesByCustomerId(Collection<GratuityEntity> gratuitiesByCustomerId) {
        this.gratuitiesByCustomerId = gratuitiesByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<LateFeeEntity> getLateFeesByCustomerId() {
        return lateFeesByCustomerId;
    }

    public void setLateFeesByCustomerId(Collection<LateFeeEntity> lateFeesByCustomerId) {
        this.lateFeesByCustomerId = lateFeesByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<ManagerNoteEntity> getManagerNotesByCustomerId() {
        return managerNotesByCustomerId;
    }

    public void setManagerNotesByCustomerId(Collection<ManagerNoteEntity> managerNotesByCustomerId) {
        this.managerNotesByCustomerId = managerNotesByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<MenuTotalEntity> getMenuTotalsByCustomerId() {
        return menuTotalsByCustomerId;
    }

    public void setMenuTotalsByCustomerId(Collection<MenuTotalEntity> menuTotalsByCustomerId) {
        this.menuTotalsByCustomerId = menuTotalsByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<OrderEntity> getOrdersByCustomerId() {
        return ordersByCustomerId;
    }

    public void setOrdersByCustomerId(Collection<OrderEntity> ordersByCustomerId) {
        this.ordersByCustomerId = ordersByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<PaymentInformationEntity> getPaymentInformationsByCustomerId() {
        return paymentInformationsByCustomerId;
    }

    public void setPaymentInformationsByCustomerId(Collection<PaymentInformationEntity> paymentInformationsByCustomerId) {
        this.paymentInformationsByCustomerId = paymentInformationsByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<StaffEntity> getStaffByCustomerId() {
        return staffByCustomerId;
    }

    public void setStaffByCustomerId(Collection<StaffEntity> staffByCustomerId) {
        this.staffByCustomerId = staffByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<SupplyTotalEntity> getSupplyTotalsByCustomerId() {
        return supplyTotalsByCustomerId;
    }

    public void setSupplyTotalsByCustomerId(Collection<SupplyTotalEntity> supplyTotalsByCustomerId) {
        this.supplyTotalsByCustomerId = supplyTotalsByCustomerId;
    }

    @OneToMany(mappedBy = "customerByCustomerId")
    public Collection<TaxEntity> getTaxesByCustomerId() {
        return taxesByCustomerId;
    }

    public void setTaxesByCustomerId(Collection<TaxEntity> taxesByCustomerId) {
        this.taxesByCustomerId = taxesByCustomerId;
    }
}
