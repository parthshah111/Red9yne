package Main;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Manager_Note", schema = "dbo", catalog = "newDB")
public class ManagerNoteEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int managerId;
    private int noteId;
    private String noteDesc;
    private Date noteDate;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private ManagerEntity managerByManagerId;

//    @Basic
//    @Column(name = "Report_ID", nullable = false)
//    public int getReportId() {
//        return reportId;
//    }
//
//    public void setReportId(int reportId) {
//        this.reportId = reportId;
//    }
//
//    @Basic
//    @Column(name = "Order_No", nullable = false)
//    public int getOrderNo() {
//        return orderNo;
//    }
//
//    public void setOrderNo(int orderNo) {
//        this.orderNo = orderNo;
//    }
//
//    @Basic
//    @Column(name = "Customer_ID", nullable = false)
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    @Basic
//    @Column(name = "Manager_ID", nullable = false)
//    public int getManagerId() {
//        return managerId;
//    }
//
//    public void setManagerId(int managerId) {
//        this.managerId = managerId;
//    }

    @Id
    @Column(name = "Note_ID", nullable = false)
    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "Note_Desc", nullable = false, length = 100)
    public String getNoteDesc() {
        return noteDesc;
    }

    public void setNoteDesc(String noteDesc) {
        this.noteDesc = noteDesc;
    }

    @Basic
    @Column(name = "Note_Date", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "Report_ID", referencedColumnName = "Report_ID", nullable = false)
    public ReportDateEntity getReportDateByReportId() {
        return reportDateByReportId;
    }

    public void setReportDateByReportId(ReportDateEntity reportDateByReportId) {
        this.reportDateByReportId = reportDateByReportId;
    }

    @ManyToOne
    @JoinColumn(name = "Order_No", referencedColumnName = "Order_no", nullable = false)
    public OrderEntity getOrderByOrderNo() {
        return orderByOrderNo;
    }

    public void setOrderByOrderNo(OrderEntity orderByOrderNo) {
        this.orderByOrderNo = orderByOrderNo;
    }

    @ManyToOne
    @JoinColumn(name = "Customer_ID", referencedColumnName = "CUSTOMER_ID", nullable = false)
    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @ManyToOne
    @JoinColumn(name = "Manager_ID", referencedColumnName = "MANAGER_ID", nullable = false)
    public ManagerEntity getManagerByManagerId() {
        return managerByManagerId;
    }

    public void setManagerByManagerId(ManagerEntity managerByManagerId) {
        this.managerByManagerId = managerByManagerId;
    }
}
