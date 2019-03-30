package Main;

import javax.persistence.*;

@Entity
@Table(name = "Event", schema = "dbo", catalog = "DBdummy2")
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

    @Id
    @Column(name = "Event_ID")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "Event_Type")
    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "Num_Guest")
    public int getNumGuest() {
        return numGuest;
    }

    public void setNumGuest(int numGuest) {
        this.numGuest = numGuest;
    }

    @Basic
    @Column(name = "Venue")
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Basic
    @Column(name = "Food_Arrival")
    public String getFoodArrival() {
        return foodArrival;
    }

    public void setFoodArrival(String foodArrival) {
        this.foodArrival = foodArrival;
    }

    @Basic
    @Column(name = "Cocktail_Starts")
    public String getCocktailStarts() {
        return cocktailStarts;
    }

    public void setCocktailStarts(String cocktailStarts) {
        this.cocktailStarts = cocktailStarts;
    }

    @Basic
    @Column(name = "Dinner_Status")
    public String getDinnerStatus() {
        return dinnerStatus;
    }

    public void setDinnerStatus(String dinnerStatus) {
        this.dinnerStatus = dinnerStatus;
    }

    @Basic
    @Column(name = "Dinner_Ends")
    public String getDinnerEnds() {
        return dinnerEnds;
    }

    public void setDinnerEnds(String dinnerEnds) {
        this.dinnerEnds = dinnerEnds;
    }

    @Basic
    @Column(name = "Clean_Up")
    public String getCleanUp() {
        return cleanUp;
    }

    public void setCleanUp(String cleanUp) {
        this.cleanUp = cleanUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventEntity that = (EventEntity) o;

        if (reportId != that.reportId) return false;
        if (orderNo != that.orderNo) return false;
        if (customerId != that.customerId) return false;
        if (eventId != that.eventId) return false;
        if (eventType != that.eventType) return false;
        if (numGuest != that.numGuest) return false;
        if (venue != null ? !venue.equals(that.venue) : that.venue != null) return false;
        if (foodArrival != null ? !foodArrival.equals(that.foodArrival) : that.foodArrival != null) return false;
        if (cocktailStarts != null ? !cocktailStarts.equals(that.cocktailStarts) : that.cocktailStarts != null)
            return false;
        if (dinnerStatus != null ? !dinnerStatus.equals(that.dinnerStatus) : that.dinnerStatus != null) return false;
        if (dinnerEnds != null ? !dinnerEnds.equals(that.dinnerEnds) : that.dinnerEnds != null) return false;
        if (cleanUp != null ? !cleanUp.equals(that.cleanUp) : that.cleanUp != null) return false;

        return true;
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
}
