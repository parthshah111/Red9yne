package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Dessert_Menu", schema = "dbo", catalog = "newDB")
public class DessertMenuEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int dessertMenu;
    private int dessertId;
    private int dessertQty;
    private int dessertTotal;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private DessertEntity dessertByDessertId;
    private Collection<OrderEntity> ordersByDessertMenu;

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
//    @Column(name = "Order_No", nullable = false)
//    public int getOrderNo() {
//        return orderNo;
//    }
//
//    public void setOrderNo(int orderNo) {
//        this.orderNo = orderNo;
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

    @Id
    @Column(name = "Dessert_Menu", nullable = false)
    public int getDessertMenu() {
        return dessertMenu;
    }

    public void setDessertMenu(int dessertMenu) {
        this.dessertMenu = dessertMenu;
    }

//    @Basic
//    @Column(name = "Dessert_ID", nullable = false)
//    public int getDessertId() {
//        return dessertId;
//    }
//
//    public void setDessertId(int dessertId) {
//        this.dessertId = dessertId;
//    }

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

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (dessertMenu != that.dessertMenu) return false;
        if (dessertId != that.dessertId) return false;
        if (dessertQty != that.dessertQty) return false;
        if (dessertTotal != that.dessertTotal) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + dessertMenu;
        result = 31 * result + dessertId;
        result = 31 * result + dessertQty;
        result = 31 * result + dessertTotal;
        return result;
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
    @JoinColumn(name = "Order_No", referencedColumnName = "Order_no", nullable = false)
    public OrderEntity getOrderByOrderNo() {
        return orderByOrderNo;
    }

    public void setOrderByOrderNo(OrderEntity orderByOrderNo) {
        this.orderByOrderNo = orderByOrderNo;
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
    @JoinColumn(name = "Dessert_ID", referencedColumnName = "Dessert_ID", nullable = false)
    public DessertEntity getDessertByDessertId() {
        return dessertByDessertId;
    }

    public void setDessertByDessertId(DessertEntity dessertByDessertId) {
        this.dessertByDessertId = dessertByDessertId;
    }

    @OneToMany(mappedBy = "dessertMenuByDessertMenuId")
    public Collection<OrderEntity> getOrdersByDessertMenu() {
        return ordersByDessertMenu;
    }

    public void setOrdersByDessertMenu(Collection<OrderEntity> ordersByDessertMenu) {
        this.ordersByDessertMenu = ordersByDessertMenu;
    }
}
