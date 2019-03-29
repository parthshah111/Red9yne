package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Appointment_Status", schema = "dbo", catalog = "newDB")
public class AppointmentStatusEntity {
    private int appointmentType;
    private int appointmentStatus;
    private Collection<AppointmentEntity> appointmentsByAppointmentType;

    @Id
    @Column(name = "Appointment_Type", nullable = false)
    public int getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(int appointmentType) {
        this.appointmentType = appointmentType;
    }

    @Basic
    @Column(name = "Appointment_Status", nullable = false)
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

    @OneToMany(mappedBy = "appointmentStatusByAppointmentType")
    public Collection<AppointmentEntity> getAppointmentsByAppointmentType() {
        return appointmentsByAppointmentType;
    }

    public void setAppointmentsByAppointmentType(Collection<AppointmentEntity> appointmentsByAppointmentType) {
        this.appointmentsByAppointmentType = appointmentsByAppointmentType;
    }
}
