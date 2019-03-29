package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Tax", schema = "dbo", catalog = "newDB")
public class TaxEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int taxId;
    private int taxType;
    private double taxTotal;
    private Collection<OrderEntity> ordersByTaxId;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private TaxTypeEntity taxTypeByTaxType;

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
    @Column(name = "Tax_ID", nullable = false)
    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

//    @Basic
//    @Column(name = "Tax_Type", nullable = false)
//    public int getTaxType() {
//        return taxType;
//    }
//
//    public void setTaxType(int taxType) {
//        this.taxType = taxType;
//    }

    @Basic
    @Column(name = "Tax_Total", nullable = false, precision = 0)
    public double getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(double taxTotal) {
        this.taxTotal = taxTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxEntity taxEntity = (TaxEntity) o;

        if (reportId != taxEntity.reportId) return false;
        if (orderNo != taxEntity.orderNo) return false;
        if (customerId != taxEntity.customerId) return false;
        if (taxId != taxEntity.taxId) return false;
        if (taxType != taxEntity.taxType) return false;
        if (Double.compare(taxEntity.taxTotal, taxTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + taxId;
        result = 31 * result + taxType;
        temp = Double.doubleToLongBits(taxTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "taxByTaxOrderId")
    public Collection<OrderEntity> getOrdersByTaxId() {
        return ordersByTaxId;
    }

    public void setOrdersByTaxId(Collection<OrderEntity> ordersByTaxId) {
        this.ordersByTaxId = ordersByTaxId;
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
    @JoinColumn(name = "Tax_Type", referencedColumnName = "Tax_Type", nullable = false)
    public TaxTypeEntity getTaxTypeByTaxType() {
        return taxTypeByTaxType;
    }

    public void setTaxTypeByTaxType(TaxTypeEntity taxTypeByTaxType) {
        this.taxTypeByTaxType = taxTypeByTaxType;
    }
}
