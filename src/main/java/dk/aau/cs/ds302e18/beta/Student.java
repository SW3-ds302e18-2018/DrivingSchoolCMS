package dk.aau.cs.ds302e18.beta;
import java.util.Objects;

public class Student implements Account {
    private int phonenumber;
    private int userID;
    private String birthdate;
    private String email;
    private String address;
    private String name;
    @Override
    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return phonenumber == student.phonenumber &&
                userID == student.userID &&
                Objects.equals(birthdate, student.birthdate) &&
                Objects.equals(email, student.email) &&
                Objects.equals(address, student.address) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonenumber, userID, birthdate, email, address, name);
    }

}
