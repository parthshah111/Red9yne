package Main;

import javax.persistence.*;

@Entity
@Table(name = "Billing_ID", schema = "dbo", catalog = "newDB")
public class BillingIdEntity {
    private int billingId;
    private int paymentId;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private int billingZip;
    private int billingCountry;
    private PaymentInformationEntity paymentInformationByPaymentId;

    @Id
    @Column(name = "Billing_ID", nullable = false)
    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

//    @Basic
//    @Column(name = "Payment_ID", nullable = false)
//    public int getPaymentId() {
//        return paymentId;
//    }
//
//    public void setPaymentId(int paymentId) {
//        this.paymentId = paymentId;
//    }

    @Basic
    @Column(name = "Billing_Address", nullable = false, length = 255)
    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Basic
    @Column(name = "Billing_City", nullable = false, length = 255)
    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @Basic
    @Column(name = "Billing_State", nullable = false, length = 2)
    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @Basic
    @Column(name = "Billing_Zip", nullable = false)
    public int getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(int billingZip) {
        this.billingZip = billingZip;
    }

    @Basic
    @Column(name = "Billing_Country", nullable = false)
    public int getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(int billingCountry) {
        this.billingCountry = billingCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillingIdEntity that = (BillingIdEntity) o;

        if (billingId != that.billingId) return false;
        if (paymentId != that.paymentId) return false;
        if (billingZip != that.billingZip) return false;
        if (billingCountry != that.billingCountry) return false;
        if (billingAddress != null ? !billingAddress.equals(that.billingAddress) : that.billingAddress != null)
            return false;
        if (billingCity != null ? !billingCity.equals(that.billingCity) : that.billingCity != null) return false;
        if (billingState != null ? !billingState.equals(that.billingState) : that.billingState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billingId;
        result = 31 * result + paymentId;
        result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
        result = 31 * result + (billingCity != null ? billingCity.hashCode() : 0);
        result = 31 * result + (billingState != null ? billingState.hashCode() : 0);
        result = 31 * result + billingZip;
        result = 31 * result + billingCountry;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Payment_ID", referencedColumnName = "Payment_ID", nullable = false)
    public PaymentInformationEntity getPaymentInformationByPaymentId() {
        return paymentInformationByPaymentId;
    }

    public void setPaymentInformationByPaymentId(PaymentInformationEntity paymentInformationByPaymentId) {
        this.paymentInformationByPaymentId = paymentInformationByPaymentId;
    }
}
