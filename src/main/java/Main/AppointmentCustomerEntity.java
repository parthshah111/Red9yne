package Main;

import javax.persistence.*;

@Entity
@Table(name = "Appointment_Customer", schema = "dbo", catalog = "DBdummy3")
public class AppointmentCustomerEntity {
    private int appCusId;
    public AppointmentEntity appointmentEntity;
    public CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID")
    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }



    @ManyToOne
    @JoinColumn(name = "Appointment_ID", referencedColumnName = "Appointment_ID")
    public AppointmentEntity getAppointmentEntity() {
        return appointmentEntity;
    }

    public void setAppointmentEntity(AppointmentEntity appointmentEntity) {
        this.appointmentEntity = appointmentEntity;
    }

    @Id
    @Column(name = "App_Cus_ID", nullable = false)
    public int getAppCusId() {
        return appCusId;
    }

    public void setAppCusId(int appCusId) {
        this.appCusId = appCusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentCustomerEntity that = (AppointmentCustomerEntity) o;

        if (appCusId != that.appCusId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return appCusId;
    }
}
