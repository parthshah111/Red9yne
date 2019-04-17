package Main;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Appointment", schema = "dbo", catalog = "DBdummy3")
public class AppointmentEntity {
    private int appointmentId;
    private Date appointmentDate;
    public List<AppointmentCustomerEntity> appointmentCustomerEntities;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "appointmentEntity", cascade = CascadeType.ALL)
    public List<AppointmentCustomerEntity> getAppointmentCustomerEntities() {
        return appointmentCustomerEntities;
    }

    public void setAppointmentCustomerEntities(List<AppointmentCustomerEntity> appointmentCustomerEntities) {
        this.appointmentCustomerEntities = appointmentCustomerEntities;
    }

    //---------------------------------------------------
    public AppointmentStatusEntity appointmentStatusEntity;

    @ManyToOne
    @JoinColumn(name = "Appointment_TypeID", referencedColumnName = "Appointment_TypeID")
    public AppointmentStatusEntity getAppointmentStatusEntity() {
        return appointmentStatusEntity;
    }

    public void setAppointmentStatusEntity(AppointmentStatusEntity appointmentStatusEntity) {
        this.appointmentStatusEntity = appointmentStatusEntity;
    }
    //======================================================================================
//    public List<AppointmentCustomerEntity> appointmentCustomerEntities;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "AppointmentEntity", cascade = CascadeType.ALL)
//    public List<AppointmentCustomerEntity> getAppointmentCustomerEntity() {
//        return appointmentCustomerEntities;
//    }

//    public void setAppointmentCustomerEntities(List<AppointmentCustomerEntity> appointmentCustomerEntities) {
//        this.appointmentCustomerEntities = appointmentCustomerEntities;
//    }
//    //============================================================================================


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
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppointmentEntity that = (AppointmentEntity) o;

        if (appointmentId != that.appointmentId) return false;
        if (appointmentDate != null ? !appointmentDate.equals(that.appointmentDate) : that.appointmentDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appointmentId;
        result = 31 * result + (appointmentDate != null ? appointmentDate.hashCode() : 0);
        return result;
    }
}
