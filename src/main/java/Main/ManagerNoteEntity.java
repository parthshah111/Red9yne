package Main;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Manager_Note", schema = "dbo", catalog = "DBdummy2")
public class ManagerNoteEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int managerId;
    private int noteId;
    private String noteDesc;
    private Date noteDate;

    @Basic
    @Column(name = "Report_ID")
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "Order_No")
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "Customer_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "Manager_ID")
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Id
    @Column(name = "Note_ID")
    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "Note_Desc")
    public String getNoteDesc() {
        return noteDesc;
    }

    public void setNoteDesc(String noteDesc) {
        this.noteDesc = noteDesc;
    }

    @Basic
    @Column(name = "Note_Date")
    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerNoteEntity that = (ManagerNoteEntity) o;

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (managerId != that.managerId) return false;
        if (noteId != that.noteId) return false;
        if (noteDesc != null ? !noteDesc.equals(that.noteDesc) : that.noteDesc != null) return false;
        if (noteDate != null ? !noteDate.equals(that.noteDate) : that.noteDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + managerId;
        result = 31 * result + noteId;
        result = 31 * result + (noteDesc != null ? noteDesc.hashCode() : 0);
        result = 31 * result + (noteDate != null ? noteDate.hashCode() : 0);
        return result;
    }
}
