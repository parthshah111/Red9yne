package Main;

import javax.persistence.*;

@Entity
@Table(name = "Event_Status", schema = "dbo", catalog = "DBdummy3")
public class EventStatusEntity {
    private int eventType;
    private String eventDesc;

    @Id
    @Column(name = "Event_Type", nullable = false)
    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "Event_Desc", nullable = false, length = 100)
    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventStatusEntity that = (EventStatusEntity) o;

        if (eventType != that.eventType) return false;
        if (eventDesc != null ? !eventDesc.equals(that.eventDesc) : that.eventDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventType;
        result = 31 * result + (eventDesc != null ? eventDesc.hashCode() : 0);
        return result;
    }
}
