package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Order", schema = "dbo", catalog = "newDB")
public class OrderEntity {
    private int orderNo;
    private int reportId;
    private int customerId;
    private int foodMenuId;
    private int dessertMenuId;
    private int taxOrderId;
    private int rentalId;
    private int supplyOrderId;
    private int deliveryId;
    private int staffId;
    private int gratuityOrderId;
    private int drinkMenuId;
    private int orderStatus;
    private double orderTotal;
    private Collection<DessertMenuEntity> dessertMenusByOrderNo;
    private Collection<DrinkMenuEntity> drinkMenusByOrderNo;
    private Collection<EventEntity> eventsByOrderNo;
    private Collection<GratuityEntity> gratuitiesByOrderNo;
    private Collection<LateFeeEntity> lateFeesByOrderNo;
    private Collection<ManagerNoteEntity> managerNotesByOrderNo;
    private Collection<MenuTotalEntity> menuTotalsByOrderNo;
    private ReportDateEntity reportDateByReportId;
    private CustomerEntity customerByCustomerId;
    private MenuTotalEntity menuTotalByFoodMenuId;
    private DessertMenuEntity dessertMenuByDessertMenuId;
    private TaxEntity taxByTaxOrderId;
    private LateFeeEntity lateFeeByRentalId;
    private SupplyTotalEntity supplyTotalBySupplyOrderId;
    private DeliveryEntity deliveryByDeliveryId;
    private StaffEntity staffByStaffId;
    private GratuityEntity gratuityByGratuityOrderId;
    private DrinkMenuEntity drinkMenuByDrinkMenuId;
    private OrderStatusEntity orderStatusByOrderStatus;
    private Collection<PaymentInformationEntity> paymentInformationsByOrderNo;
    private Collection<StaffEntity> staffByOrderNo;
    private Collection<SupplyTotalEntity> supplyTotalsByOrderNo;
    private Collection<TaxEntity> taxesByOrderNo;

    @Id
    @Column(name = "Order_no", nullable = false)
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

//    @Basic
//    @Column(name = "Report_ID", nullable = false)
//    public int getReportId() {
//        return reportId;
//    }
//
//    public void setReportId(int reportId) {
//        this.reportId = reportId;
//    }
//
//    @Basic
//    @Column(name = "Customer_ID", nullable = false)
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    @Basic
//    @Column(name = "FoodMenu_ID", nullable = false)
//    public int getFoodMenuId() {
//        return foodMenuId;
//    }
//
//    public void setFoodMenuId(int foodMenuId) {
//        this.foodMenuId = foodMenuId;
//    }
//
//    @Basic
//    @Column(name = "Dessert_MenuID", nullable = false)
//    public int getDessertMenuId() {
//        return dessertMenuId;
//    }
//
//    public void setDessertMenuId(int dessertMenuId) {
//        this.dessertMenuId = dessertMenuId;
//    }
//
//    @Basic
//    @Column(name = "TaxOrder_ID", nullable = false)
//    public int getTaxOrderId() {
//        return taxOrderId;
//    }
//
//    public void setTaxOrderId(int taxOrderId) {
//        this.taxOrderId = taxOrderId;
//    }
//
//    @Basic
//    @Column(name = "Rental_ID", nullable = false)
//    public int getRentalId() {
//        return rentalId;
//    }
//
//    public void setRentalId(int rentalId) {
//        this.rentalId = rentalId;
//    }
//
//    @Basic
//    @Column(name = "SupplyOrder_ID", nullable = false)
//    public int getSupplyOrderId() {
//        return supplyOrderId;
//    }
//
//    public void setSupplyOrderId(int supplyOrderId) {
//        this.supplyOrderId = supplyOrderId;
//    }
//
//    @Basic
//    @Column(name = "Delivery_ID", nullable = false)
//    public int getDeliveryId() {
//        return deliveryId;
//    }
//
//    public void setDeliveryId(int deliveryId) {
//        this.deliveryId = deliveryId;
//    }
//
//    @Basic
//    @Column(name = "Staff_ID", nullable = false)
//    public int getStaffId() {
//        return staffId;
//    }
//
//    public void setStaffId(int staffId) {
//        this.staffId = staffId;
//    }
//
//    @Basic
//    @Column(name = "GratuityOrder_ID", nullable = false)
//    public int getGratuityOrderId() {
//        return gratuityOrderId;
//    }
//
//    public void setGratuityOrderId(int gratuityOrderId) {
//        this.gratuityOrderId = gratuityOrderId;
//    }
//
//    @Basic
//    @Column(name = "Drink_MenuID", nullable = false)
//    public int getDrinkMenuId() {
//        return drinkMenuId;
//    }
//
//    public void setDrinkMenuId(int drinkMenuId) {
//        this.drinkMenuId = drinkMenuId;
//    }
//
//    @Basic
//    @Column(name = "Order_Status", nullable = false)
//    public int getOrderStatus() {
//        return orderStatus;
//    }
//
//    public void setOrderStatus(int orderStatus) {
//        this.orderStatus = orderStatus;
//    }

    @Basic
    @Column(name = "Order_Total", nullable = false, precision = 0)
    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orderNo != that.orderNo) return false;
        if (reportId != that.reportId) return false;
        if (customerId != that.customerId) return false;
        if (foodMenuId != that.foodMenuId) return false;
        if (dessertMenuId != that.dessertMenuId) return false;
        if (taxOrderId != that.taxOrderId) return false;
        if (rentalId != that.rentalId) return false;
        if (supplyOrderId != that.supplyOrderId) return false;
        if (deliveryId != that.deliveryId) return false;
        if (staffId != that.staffId) return false;
        if (gratuityOrderId != that.gratuityOrderId) return false;
        if (drinkMenuId != that.drinkMenuId) return false;
        if (orderStatus != that.orderStatus) return false;
        if (Double.compare(that.orderTotal, orderTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderNo;
        result = 31 * result + reportId;
        result = 31 * result + customerId;
        result = 31 * result + foodMenuId;
        result = 31 * result + dessertMenuId;
        result = 31 * result + taxOrderId;
        result = 31 * result + rentalId;
        result = 31 * result + supplyOrderId;
        result = 31 * result + deliveryId;
        result = 31 * result + staffId;
        result = 31 * result + gratuityOrderId;
        result = 31 * result + drinkMenuId;
        result = 31 * result + orderStatus;
        temp = Double.doubleToLongBits(orderTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<DessertMenuEntity> getDessertMenusByOrderNo() {
        return dessertMenusByOrderNo;
    }

    public void setDessertMenusByOrderNo(Collection<DessertMenuEntity> dessertMenusByOrderNo) {
        this.dessertMenusByOrderNo = dessertMenusByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<DrinkMenuEntity> getDrinkMenusByOrderNo() {
        return drinkMenusByOrderNo;
    }

    public void setDrinkMenusByOrderNo(Collection<DrinkMenuEntity> drinkMenusByOrderNo) {
        this.drinkMenusByOrderNo = drinkMenusByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<EventEntity> getEventsByOrderNo() {
        return eventsByOrderNo;
    }

    public void setEventsByOrderNo(Collection<EventEntity> eventsByOrderNo) {
        this.eventsByOrderNo = eventsByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<GratuityEntity> getGratuitiesByOrderNo() {
        return gratuitiesByOrderNo;
    }

    public void setGratuitiesByOrderNo(Collection<GratuityEntity> gratuitiesByOrderNo) {
        this.gratuitiesByOrderNo = gratuitiesByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<LateFeeEntity> getLateFeesByOrderNo() {
        return lateFeesByOrderNo;
    }

    public void setLateFeesByOrderNo(Collection<LateFeeEntity> lateFeesByOrderNo) {
        this.lateFeesByOrderNo = lateFeesByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<ManagerNoteEntity> getManagerNotesByOrderNo() {
        return managerNotesByOrderNo;
    }

    public void setManagerNotesByOrderNo(Collection<ManagerNoteEntity> managerNotesByOrderNo) {
        this.managerNotesByOrderNo = managerNotesByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<MenuTotalEntity> getMenuTotalsByOrderNo() {
        return menuTotalsByOrderNo;
    }

    public void setMenuTotalsByOrderNo(Collection<MenuTotalEntity> menuTotalsByOrderNo) {
        this.menuTotalsByOrderNo = menuTotalsByOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "Report_ID", referencedColumnName = "Report_ID", nullable = false)
    public ReportDateEntity getReportDateByReportId() {
        return reportDateByReportId;
    }

    public void setReportDateByReportId(ReportDateEntity reportDateByReportId) {
        this.reportDateByReportId = reportDateByReportId;
    }

    @ManyToOne
    @JoinColumn(name = "Customer_ID", referencedColumnName = "CUSTOMER_ID", nullable = false)
    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "FoodMenu_ID", referencedColumnName = "FoodMenu_ID", nullable = false)
    public MenuTotalEntity getMenuTotalByFoodMenuId() {
        return menuTotalByFoodMenuId;
    }

    public void setMenuTotalByFoodMenuId(MenuTotalEntity menuTotalByFoodMenuId) {
        this.menuTotalByFoodMenuId = menuTotalByFoodMenuId;
    }

    @ManyToOne
    @JoinColumn(name = "Dessert_MenuID", referencedColumnName = "Dessert_Menu", nullable = false)
    public DessertMenuEntity getDessertMenuByDessertMenuId() {
        return dessertMenuByDessertMenuId;
    }

    public void setDessertMenuByDessertMenuId(DessertMenuEntity dessertMenuByDessertMenuId) {
        this.dessertMenuByDessertMenuId = dessertMenuByDessertMenuId;
    }

    @ManyToOne
    @JoinColumn(name = "TaxOrder_ID", referencedColumnName = "Tax_ID", nullable = false)
    public TaxEntity getTaxByTaxOrderId() {
        return taxByTaxOrderId;
    }

    public void setTaxByTaxOrderId(TaxEntity taxByTaxOrderId) {
        this.taxByTaxOrderId = taxByTaxOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "Rental_ID", referencedColumnName = "Rental_ID", nullable = false)
    public LateFeeEntity getLateFeeByRentalId() {
        return lateFeeByRentalId;
    }

    public void setLateFeeByRentalId(LateFeeEntity lateFeeByRentalId) {
        this.lateFeeByRentalId = lateFeeByRentalId;
    }

    @ManyToOne
    @JoinColumn(name = "SupplyOrder_ID", referencedColumnName = "SupplyOrder_ID", nullable = false)
    public SupplyTotalEntity getSupplyTotalBySupplyOrderId() {
        return supplyTotalBySupplyOrderId;
    }

    public void setSupplyTotalBySupplyOrderId(SupplyTotalEntity supplyTotalBySupplyOrderId) {
        this.supplyTotalBySupplyOrderId = supplyTotalBySupplyOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "Delivery_ID", referencedColumnName = "DELIVERY_ID", nullable = false)
    public DeliveryEntity getDeliveryByDeliveryId() {
        return deliveryByDeliveryId;
    }

    public void setDeliveryByDeliveryId(DeliveryEntity deliveryByDeliveryId) {
        this.deliveryByDeliveryId = deliveryByDeliveryId;
    }

    @ManyToOne
    @JoinColumn(name = "Staff_ID", referencedColumnName = "Staff_ID", nullable = false)
    public StaffEntity getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(StaffEntity staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }

    @ManyToOne
    @JoinColumn(name = "GratuityOrder_ID", referencedColumnName = "GratuityOrder_ID", nullable = false)
    public GratuityEntity getGratuityByGratuityOrderId() {
        return gratuityByGratuityOrderId;
    }

    public void setGratuityByGratuityOrderId(GratuityEntity gratuityByGratuityOrderId) {
        this.gratuityByGratuityOrderId = gratuityByGratuityOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "Drink_MenuID", referencedColumnName = "Drink_MenuID", nullable = false)
    public DrinkMenuEntity getDrinkMenuByDrinkMenuId() {
        return drinkMenuByDrinkMenuId;
    }

    public void setDrinkMenuByDrinkMenuId(DrinkMenuEntity drinkMenuByDrinkMenuId) {
        this.drinkMenuByDrinkMenuId = drinkMenuByDrinkMenuId;
    }

    @ManyToOne
    @JoinColumn(name = "Order_Status", referencedColumnName = "Order_Status", nullable = false)
    public OrderStatusEntity getOrderStatusByOrderStatus() {
        return orderStatusByOrderStatus;
    }

    public void setOrderStatusByOrderStatus(OrderStatusEntity orderStatusByOrderStatus) {
        this.orderStatusByOrderStatus = orderStatusByOrderStatus;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<PaymentInformationEntity> getPaymentInformationsByOrderNo() {
        return paymentInformationsByOrderNo;
    }

    public void setPaymentInformationsByOrderNo(Collection<PaymentInformationEntity> paymentInformationsByOrderNo) {
        this.paymentInformationsByOrderNo = paymentInformationsByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<StaffEntity> getStaffByOrderNo() {
        return staffByOrderNo;
    }

    public void setStaffByOrderNo(Collection<StaffEntity> staffByOrderNo) {
        this.staffByOrderNo = staffByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<SupplyTotalEntity> getSupplyTotalsByOrderNo() {
        return supplyTotalsByOrderNo;
    }

    public void setSupplyTotalsByOrderNo(Collection<SupplyTotalEntity> supplyTotalsByOrderNo) {
        this.supplyTotalsByOrderNo = supplyTotalsByOrderNo;
    }

    @OneToMany(mappedBy = "orderByOrderNo")
    public Collection<TaxEntity> getTaxesByOrderNo() {
        return taxesByOrderNo;
    }

    public void setTaxesByOrderNo(Collection<TaxEntity> taxesByOrderNo) {
        this.taxesByOrderNo = taxesByOrderNo;
    }
}
