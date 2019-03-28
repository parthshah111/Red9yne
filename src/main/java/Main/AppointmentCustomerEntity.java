package Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment_Customer", schema = "dbo", catalog = "newDB")
public class AppointmentCustomerEntity {
    private int appointmentId;

    @Id
    @Column(name = "Appointment_ID", nullable = false)
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentCustomerEntity that = (AppointmentCustomerEntity) o;

        if (appointmentId != that.appointmentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return appointmentId;
    }
}
