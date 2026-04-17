package Assignment;

import java.io.Serializable;
import java.util.Objects;

public class Complaint implements Serializable {
    String description;
    String status;

    public Complaint(String description) {
        this.description = description;
        this.status = "Pending";
    }

    @Override
    public String toString() {
        return "Complaint: " + description +
                "\nStatus: " + status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complaint)) return false;
        Complaint c = (Complaint) o;
        return description.equals(c.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
