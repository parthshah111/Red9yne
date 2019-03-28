package Main;

import javax.persistence.*;

@Entity
@Table(name = "Payment_Information", schema = "dbo", catalog = "newDB")
public class PaymentInformationEntity {
    private int paymentId;
    private String paymentHistory;
    private double orderDeposit;
    private double amountDue;
    private String paymentFName;
    private String paymentLName;

    @Id
    @Column(name = "Payment_ID", nullable = false)
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "Payment_History", nullable = false, length = 255)
    public String getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    @Basic
    @Column(name = "Order_Deposit", nullable = false, precision = 0)
    public double getOrderDeposit() {
        return orderDeposit;
    }

    public void setOrderDeposit(double orderDeposit) {
        this.orderDeposit = orderDeposit;
    }

    @Basic
    @Column(name = "Amount_Due", nullable = false, precision = 0)
    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    @Basic
    @Column(name = "Payment_FName", nullable = false, length = 255)
    public String getPaymentFName() {
        return paymentFName;
    }

    public void setPaymentFName(String paymentFName) {
        this.paymentFName = paymentFName;
    }

    @Basic
    @Column(name = "Payment_LName", nullable = false, length = 255)
    public String getPaymentLName() {
        return paymentLName;
    }

    public void setPaymentLName(String paymentLName) {
        this.paymentLName = paymentLName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentInformationEntity that = (PaymentInformationEntity) o;

        if (paymentId != that.paymentId) return false;
        if (Double.compare(that.orderDeposit, orderDeposit) != 0) return false;
        if (Double.compare(that.amountDue, amountDue) != 0) return false;
        if (paymentHistory != null ? !paymentHistory.equals(that.paymentHistory) : that.paymentHistory != null)
            return false;
        if (paymentFName != null ? !paymentFName.equals(that.paymentFName) : that.paymentFName != null) return false;
        if (paymentLName != null ? !paymentLName.equals(that.paymentLName) : that.paymentLName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = paymentId;
        result = 31 * result + (paymentHistory != null ? paymentHistory.hashCode() : 0);
        temp = Double.doubleToLongBits(orderDeposit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(amountDue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paymentFName != null ? paymentFName.hashCode() : 0);
        result = 31 * result + (paymentLName != null ? paymentLName.hashCode() : 0);
        return result;
    }
}
