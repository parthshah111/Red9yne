package Main;

import javax.persistence.*;

@Entity
@Table(name = "Appointment", schema = "dbo", catalog = "newDB")
public class AppointmentEntity {
    private int appointmentId;
    private int appointmentDate;

    @Id
    @Column(name = "Appointment_ID", nullable = false)
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Basic
    @Column(name = "Appointment_Date", nullable = false)
    public int getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(int appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentEntity that = (AppointmentEntity) o;

        if (appointmentId != that.appointmentId) return false;
        if (appointmentDate != that.appointmentDate) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appointmentId;
        result = 31 * result + appointmentDate;
        return result;
    }
}
