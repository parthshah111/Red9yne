package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Appointment", schema = "dbo", catalog = "newDB")
public class AppointmentEntity {
    private int appointmentId;
    private int appointmentType;
    private int appointmentDate;
    private AppointmentStatusEntity appointmentStatusByAppointmentType;
    private Collection<AppointmentCustomerEntity> appointmentCustomersByAppointmentId;

    @Id
    @Column(name = "Appointment_ID", nullable = false)
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

//    @Basic
//    @Column(name = "Appointment_Type", nullable = false)
//    public int getAppointmentType() {
//        return appointmentType;
//    }

    public void setAppointmentType(int appointmentType) {
        this.appointmentType = appointmentType;
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
        if (appointmentType != that.appointmentType) return false;
        if (appointmentDate != that.appointmentDate) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appointmentId;
        result = 31 * result + appointmentType;
        result = 31 * result + appointmentDate;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Appointment_Type", referencedColumnName = "Appointment_Type", nullable = false)
    public AppointmentStatusEntity getAppointmentStatusByAppointmentType() {
        return appointmentStatusByAppointmentType;
    }

    public void setAppointmentStatusByAppointmentType(AppointmentStatusEntity appointmentStatusByAppointmentType) {
        this.appointmentStatusByAppointmentType = appointmentStatusByAppointmentType;
    }

    @OneToMany(mappedBy = "appointmentByAppointmentId")
    public Collection<AppointmentCustomerEntity> getAppointmentCustomersByAppointmentId() {
        return appointmentCustomersByAppointmentId;
    }

    public void setAppointmentCustomersByAppointmentId(Collection<AppointmentCustomerEntity> appointmentCustomersByAppointmentId) {
        this.appointmentCustomersByAppointmentId = appointmentCustomersByAppointmentId;
    }
}
