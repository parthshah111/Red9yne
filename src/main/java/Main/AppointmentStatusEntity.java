package Main;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Appointment_Status", schema = "dbo", catalog = "DBdummy3")
public class AppointmentStatusEntity {
    private int appointmentTypeId;
    private String appointmentStatus;

    private List<AppointmentEntity> appointmentEntities;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "appointmentStatusEntity", cascade = CascadeType.ALL)
    public List<AppointmentEntity> getAppointmentEntities() {
        return appointmentEntities;
    }

    public void setAppointmentEntities(List<AppointmentEntity> appointmentEntities) {
        this.appointmentEntities = appointmentEntities;
    }


    @Id
    @Column(name = "Appointment_TypeID", nullable = false)
    public int getAppointmentTypeId() {
        return appointmentTypeId;
    }

    public void setAppointmentTypeId(int appointmentTypeId) {
        this.appointmentTypeId = appointmentTypeId;
    }

    @Basic
    @Column(name = "Appointment_Status", nullable = false, length = 24)
    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentStatusEntity that = (AppointmentStatusEntity) o;

        if (appointmentTypeId != that.appointmentTypeId) return false;
        if (appointmentStatus != null ? !appointmentStatus.equals(that.appointmentStatus) : that.appointmentStatus != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appointmentTypeId;
        result = 31 * result + (appointmentStatus != null ? appointmentStatus.hashCode() : 0);
        return result;
    }
}
