package Main;

import javax.persistence.*;

@Entity
@Table(name = "Tax", schema = "dbo", catalog = "DBdummy2")
public class TaxEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int taxId;
    private int taxType;
    private double taxTotal;

    @Basic
    @Column(name = "Report_ID")
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "Order_No")
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "Customer_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "Tax_ID")
    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Basic
    @Column(name = "Tax_Type")
    public int getTaxType() {
        return taxType;
    }

    public void setTaxType(int taxType) {
        this.taxType = taxType;
    }

    @Basic
    @Column(name = "Tax_Total")
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
}
