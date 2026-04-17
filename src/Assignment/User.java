package Assignment;

import java.io.Serializable;
import java.util.Objects;

public abstract class User implements Serializable {

    protected String emailID;
    protected String password;
    protected String name;

    public User(String emailID, String password, String name) {
        this.emailID = emailID;
        this.password = password;
        this.name = name;
    }

    public String getEmailID() { return emailID; }
    public String getPassword() { return password; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + emailID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return emailID.equals(user.emailID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailID);
    }
}
