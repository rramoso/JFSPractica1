package Objects;

/**
 * Created by Djidjelly Siclait on 9/10/2016.
 */

public class User {

    // Attributes
    private String name;
    private String lastName;
    private String address;
    private String telephone;
    private String email;

    public User(){

    }

    public User(String name, String lastName, String telephone, String email, String address){
        this.setName(name);
        this.setLastName(lastName);
        this.setPhone(telephone);
        this.setEmail(email);
        this.setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return telephone;
    }

    public void setPhone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
