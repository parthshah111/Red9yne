//package Main;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//
//@Entity
//@Table(name = "ReportDate", schema = "dbo", catalog = "DBdummy3")
//public class ReportDateEntity {
//    private int reportId;
//    private Timestamp reportDate;
//    private double grandTotal;
//
//    @Id
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
//    @Column(name = "REPORT_DATE", nullable = false)
//    public Timestamp getReportDate() {
//        return reportDate;
//    }
//
//    public void setReportDate(Timestamp reportDate) {
//        this.reportDate = reportDate;
//    }
//
//    @Basic
//    @Column(name = "GRAND_TOTAL", nullable = false, precision = 0)
//    public double getGrandTotal() {
//        return grandTotal;
//    }
//
//    public void setGrandTotal(double grandTotal) {
//        this.grandTotal = grandTotal;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ReportDateEntity that = (ReportDateEntity) o;
//
//        if (reportId != that.reportId) return false;
//        if (Double.compare(that.grandTotal, grandTotal) != 0) return false;
//        if (reportDate != null ? !reportDate.equals(that.reportDate) : that.reportDate != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = reportId;
//        result = 31 * result + (reportDate != null ? reportDate.hashCode() : 0);
//        temp = Double.doubleToLongBits(grandTotal);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
//}
