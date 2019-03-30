package Main;

import javax.persistence.*;

@Entity
@Table(name = "Appointment_Customer", schema = "dbo", catalog = "DBdummy2")
public class AppointmentCustomerEntity {
    private int appointmentId;
    private int appCusId;
    private int customerId;

    @Basic
    @Column(name = "Appointment_ID")
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Id
    @Column(name = "App_Cus_ID")
    public int getAppCusId() {
        return appCusId;
    }

    public void setAppCusId(int appCusId) {
        this.appCusId = appCusId;
    }

    @Basic
    @Column(name = "Customer_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentCustomerEntity that = (AppointmentCustomerEntity) o;

        if (appointmentId != that.appointmentId) return false;
        if (appCusId != that.appCusId) return false;
        if (customerId != that.customerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appointmentId;
        result = 31 * result + appCusId;
        result = 31 * result + customerId;
        return result;
    }
}
