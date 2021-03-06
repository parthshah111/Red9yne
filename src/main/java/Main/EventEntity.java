package Main;

import javax.persistence.*;

@Entity
@Table(name = "Event", schema = "dbo", catalog = "DBdummy3")
public class EventEntity {
    private int eventId;
    private int numGuest;
    private String venue;
    private String foodArrival;
    private String cocktailStarts;
    private String dinnerStatus;
    private String dinnerEnds;
    private String cleanUp;

    @Id
    @Column(name = "Event_ID", nullable = false)
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

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
    @Column(name = "Food_Arrival", nullable = false, length = 24)
    public String getFoodArrival() {
        return foodArrival;
    }

    public void setFoodArrival(String foodArrival) {
        this.foodArrival = foodArrival;
    }

    @Basic
    @Column(name = "Cocktail_Starts", nullable = false, length = 24)
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
    @Column(name = "Dinner_Ends", nullable = false, length = 24)
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventEntity that = (EventEntity) o;

        if (eventId != that.eventId) return false;
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
        int result = eventId;
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
