package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Gratuity", schema = "dbo", catalog = "newDB")
public class GratuityEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int gratuityOrderId;
    private int gratuityType;
    private double gratuityTotal;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private GratuityTypeEntity gratuityTypeByGratuityType;
    private Collection<OrderEntity> ordersByGratuityOrderId;

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
    @Column(name = "GratuityOrder_ID", nullable = false)
    public int getGratuityOrderId() {
        return gratuityOrderId;
    }

    public void setGratuityOrderId(int gratuityOrderId) {
        this.gratuityOrderId = gratuityOrderId;
    }

//    @Basic
//    @Column(name = "Gratuity_Type", nullable = false)
//    public int getGratuityType() {
//        return gratuityType;
//    }
//
//    public void setGratuityType(int gratuityType) {
//        this.gratuityType = gratuityType;
//    }

    @Basic
    @Column(name = "Gratuity_Total", nullable = false, precision = 0)
    public double getGratuityTotal() {
        return gratuityTotal;
    }

    public void setGratuityTotal(double gratuityTotal) {
        this.gratuityTotal = gratuityTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GratuityEntity that = (GratuityEntity) o;

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (gratuityOrderId != that.gratuityOrderId) return false;
        if (gratuityType != that.gratuityType) return false;
        if (Double.compare(that.gratuityTotal, gratuityTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + gratuityOrderId;
        result = 31 * result + gratuityType;
        temp = Double.doubleToLongBits(gratuityTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
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
    @JoinColumn(name = "Gratuity_Type", referencedColumnName = "Gratuity_Type", nullable = false)
    public GratuityTypeEntity getGratuityTypeByGratuityType() {
        return gratuityTypeByGratuityType;
    }

    public void setGratuityTypeByGratuityType(GratuityTypeEntity gratuityTypeByGratuityType) {
        this.gratuityTypeByGratuityType = gratuityTypeByGratuityType;
    }

    @OneToMany(mappedBy = "gratuityByGratuityOrderId")
    public Collection<OrderEntity> getOrdersByGratuityOrderId() {
        return ordersByGratuityOrderId;
    }

    public void setOrdersByGratuityOrderId(Collection<OrderEntity> ordersByGratuityOrderId) {
        this.ordersByGratuityOrderId = ordersByGratuityOrderId;
    }
}
