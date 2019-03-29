package Main;

import javax.persistence.*;

@Entity
@Table(name = "Event", schema = "dbo", catalog = "newDB")
public class EventEntity {
    private int reportId;
    private int orderNo;
    private int customerId;
    private int eventId;
    private int eventType;
    private int numGuest;
    private String venue;
    private String foodArrival;
    private String cocktailStarts;
    private String dinnerStatus;
    private String dinnerEnds;
    private String cleanUp;
    private ReportDateEntity reportDateByReportId;
    private OrderEntity orderByOrderNo;
    private CustomerEntity customerByCustomerId;
    private EventStatusEntity eventStatusByEventType;

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

    @Id
    @Column(name = "Event_ID", nullable = false)
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

//    @Basic
//    @Column(name = "Event_Type", nullable = false)
//    public int getEventType() {
//        return eventType;
//    }
//
//    public void setEventType(int eventType) {
//        this.eventType = eventType;
//    }

    @Basic
    @Column(name = "Num_Guest", nullable = false)
    public int getNumGuest() {
        return numGuest;
    }

    public void setNumGuest(int numGuest) {
        this.numGuest = numGuest;
    }

    @Basic
    @Column(name = "Venue", nullable = false, length = 255)
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Basic
    @Column(name = "Food_Arrival", nullable = false)
    public String getFoodArrival() {
        return foodArrival;
    }

    public void setFoodArrival(String foodArrival) {
        this.foodArrival = foodArrival;
    }

    @Basic
    @Column(name = "Cocktail_Starts", nullable = false)
    public String getCocktailStarts() {
        return cocktailStarts;
    }

    public void setCocktailStarts(String cocktailStarts) {
        this.cocktailStarts = cocktailStarts;
    }

    @Basic
    @Column(name = "Dinner_Status", nullable = false, length = 255)
    public String getDinnerStatus() {
        return dinnerStatus;
    }

    public void setDinnerStatus(String dinnerStatus) {
        this.dinnerStatus = dinnerStatus;
    }

    @Basic
    @Column(name = "Dinner_Ends", nullable = false)
    public String getDinnerEnds() {
        return dinnerEnds;
    }

    public void setDinnerEnds(String dinnerEnds) {
        this.dinnerEnds = dinnerEnds;
    }

    @Basic
    @Column(name = "Clean_Up", nullable = false, length = 255)
    public String getCleanUp() {
        return cleanUp;
    }

    public void setCleanUp(String cleanUp) {
        this.cleanUp = cleanUp;
    }

    @Override
    public int hashCode() {
        int result = reportId;
        result = 31 * result + orderNo;
        result = 31 * result + customerId;
        result = 31 * result + eventId;
        result = 31 * result + eventType;
        result = 31 * result + numGuest;
        result = 31 * result + (venue != null ? venue.hashCode() : 0);
        result = 31 * result + (foodArrival != null ? foodArrival.hashCode() : 0);
        result = 31 * result + (cocktailStarts != null ? cocktailStarts.hashCode() : 0);
        result = 31 * result + (dinnerStatus != null ? dinnerStatus.hashCode() : 0);
        result = 31 * result + (dinnerEnds != null ? dinnerEnds.hashCode() : 0);
        result = 31 * result + (cleanUp != null ? cleanUp.hashCode() : 0);
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
    @JoinColumn(name = "Event_Type", referencedColumnName = "Event_Type", nullable = false)
    public EventStatusEntity getEventStatusByEventType() {
        return eventStatusByEventType;
    }

    public void setEventStatusByEventType(EventStatusEntity eventStatusByEventType) {
        this.eventStatusByEventType = eventStatusByEventType;
    }
}

