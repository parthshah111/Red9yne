package Main;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Manager", schema = "dbo", catalog = "newDB")
public class ManagerEntity {
    private int managerId;
    private String managerFname;
    private String managerLname;
    private String managerEmail;
    private String managerPhone;
    private Collection<ManagerNoteEntity> managerNotesByManagerId;

    @Id
    @Column(name = "MANAGER_ID", nullable = false)
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "MANAGER_FNAME", nullable = false, length = 24)
    public String getManagerFname() {
        return managerFname;
    }

    public void setManagerFname(String managerFname) {
        this.managerFname = managerFname;
    }

    @Basic
    @Column(name = "MANAGER_LNAME", nullable = false, length = 24)
    public String getManagerLname() {
        return managerLname;
    }

    public void setManagerLname(String managerLname) {
        this.managerLname = managerLname;
    }

    @Basic
    @Column(name = "MANAGER_EMAIL", nullable = false, length = 24)
    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    @Basic
    @Column(name = "MANAGER_PHONE", nullable = false, length = 24)
    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerEntity that = (ManagerEntity) o;

        if (managerId != that.managerId) return false;
        if (managerFname != null ? !managerFname.equals(that.managerFname) : that.managerFname != null) return false;
        if (managerLname != null ? !managerLname.equals(that.managerLname) : that.managerLname != null) return false;
        if (managerEmail != null ? !managerEmail.equals(that.managerEmail) : that.managerEmail != null) return false;
        if (managerPhone != null ? !managerPhone.equals(that.managerPhone) : that.managerPhone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = managerId;
        result = 31 * result + (managerFname != null ? managerFname.hashCode() : 0);
        result = 31 * result + (managerLname != null ? managerLname.hashCode() : 0);
        result = 31 * result + (managerEmail != null ? managerEmail.hashCode() : 0);
        result = 31 * result + (managerPhone != null ? managerPhone.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "managerByManagerId")
    public Collection<ManagerNoteEntity> getManagerNotesByManagerId() {
        return managerNotesByManagerId;
    }

    public void setManagerNotesByManagerId(Collection<ManagerNoteEntity> managerNotesByManagerId) {
        this.managerNotesByManagerId = managerNotesByManagerId;
    }
}
