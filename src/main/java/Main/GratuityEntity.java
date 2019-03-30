package Main;

import javax.persistence.*;

@Entity
@Table(name = "Gratuity", schema = "dbo", catalog = "DBdummy2")
public class GratuityEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int gratuityOrderId;
    private int gratuityType;
    private double gratuityTotal;

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
    @Column(name = "GratuityOrder_ID")
    public int getGratuityOrderId() {
        return gratuityOrderId;
    }

    public void setGratuityOrderId(int gratuityOrderId) {
        this.gratuityOrderId = gratuityOrderId;
    }

    @Basic
    @Column(name = "Gratuity_Type")
    public int getGratuityType() {
        return gratuityType;
    }

    public void setGratuityType(int gratuityType) {
        this.gratuityType = gratuityType;
    }

    @Basic
    @Column(name = "Gratuity_Total")
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
}
