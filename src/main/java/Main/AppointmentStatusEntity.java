package Main;

import javax.persistence.*;

@Entity
@Table(name = "Appointment_Status", schema = "dbo", catalog = "DBdummy2")
public class AppointmentStatusEntity {
    private int appointmentType;
    private int appointmentStatus;

    @Id
    @Column(name = "Appointment_Type")
    public int getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(int appointmentType) {
        this.appointmentType = appointmentType;
    }

    @Basic
    @Column(name = "Appointment_Status")
    public int getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(int appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentStatusEntity that = (AppointmentStatusEntity) o;

        if (appointmentType != that.appointmentType) return false;
        if (appointmentStatus != that.appointmentStatus) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appointmentType;
        result = 31 * result + appointmentStatus;
        return result;
    }
}
