package Main;

import javax.persistence.*;

@Entity
@Table(name = "BillingAddress", schema = "dbo", catalog = "newDB")
public class BillingAddressEntity {
    private int paymentId;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private Integer billingZip;
    private String billingCountry;

    @Id
    @Column(name = "PAYMENT_ID", nullable = false)
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "BILLING_ADDRESS", nullable = false, length = 50)
    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Basic
    @Column(name = "BILLING_CITY", nullable = false, length = 24)
    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @Basic
    @Column(name = "BILLING_STATE", nullable = false, length = 24)
    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @Basic
    @Column(name = "BILLING_ZIP", nullable = true)
    public Integer getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(Integer billingZip) {
        this.billingZip = billingZip;
    }

    @Basic
    @Column(name = "BILLING COUNTRY", nullable = false, length = 24)
    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillingAddressEntity that = (BillingAddressEntity) o;

        if (paymentId != that.paymentId) return false;
        if (billingAddress != null ? !billingAddress.equals(that.billingAddress) : that.billingAddress != null)
            return false;
        if (billingCity != null ? !billingCity.equals(that.billingCity) : that.billingCity != null) return false;
        if (billingState != null ? !billingState.equals(that.billingState) : that.billingState != null) return false;
        if (billingZip != null ? !billingZip.equals(that.billingZip) : that.billingZip != null) return false;
        if (billingCountry != null ? !billingCountry.equals(that.billingCountry) : that.billingCountry != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentId;
        result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
        result = 31 * result + (billingCity != null ? billingCity.hashCode() : 0);
        result = 31 * result + (billingState != null ? billingState.hashCode() : 0);
        result = 31 * result + (billingZip != null ? billingZip.hashCode() : 0);
        result = 31 * result + (billingCountry != null ? billingCountry.hashCode() : 0);
        return result;
    }
}
