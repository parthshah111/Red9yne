package Main;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Manager_Note", schema = "dbo", catalog = "DBdummy3")
public class ManagerNoteEntity {
    private int noteId;
    private String noteDesc;
    private Date noteDate;

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

        if (noteId != that.noteId) return false;
        if (noteDesc != null ? !noteDesc.equals(that.noteDesc) : that.noteDesc != null) return false;
        if (noteDate != null ? !noteDate.equals(that.noteDate) : that.noteDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId;
        result = 31 * result + (noteDesc != null ? noteDesc.hashCode() : 0);
        result = 31 * result + (noteDate != null ? noteDate.hashCode() : 0);
        return result;
    }
}
