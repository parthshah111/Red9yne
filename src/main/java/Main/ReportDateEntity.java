package Main;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ReportDate", schema = "dbo", catalog = "newDB")
public class ReportDateEntity {
    private int reportId;
    private Timestamp reportDate;
    private Object grandTotal;

    @Id
    @Column(name = "Report_ID", nullable = false)
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "REPORT_DATE", nullable = false)
    public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }

    @Basic
    @Column(name = "GRAND_TOTAL", nullable = false)
    public Object getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Object grandTotal) {
        this.grandTotal = grandTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportDateEntity that = (ReportDateEntity) o;

        if (reportId != that.reportId) return false;
        if (reportDate != null ? !reportDate.equals(that.reportDate) : that.reportDate != null) return false;
        if (grandTotal != null ? !grandTotal.equals(that.grandTotal) : that.grandTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + (reportDate != null ? reportDate.hashCode() : 0);
        result = 31 * result + (grandTotal != null ? grandTotal.hashCode() : 0);
        return result;
    }
}
