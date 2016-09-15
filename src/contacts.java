/**
 * Created by Djidjelly Siclait on 9/10/2016.
 */

import Objects.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean (name = "user")
@SessionScoped
public class contacts implements Serializable{

    // Attribute
    private List<User> users = new ArrayList<>();

    // Auxiliary Variables
    @Size(max = 50)
    private String name;
    @Size(max = 50)
    private String lastName;
    private String phone;
    private String address;
    private String email;

    private User selecteduser;

    @PostConstruct
    public void init(){
       
    }

    public void addUser(){


        getUsers().add(new User(name, lastName, phone, email, address));
        name = lastName = address = phone = email = "";
    }

    public void deleteUser(String name, String lastName, String phone){

        int count = 0;

        for (User contact: getUsers()) {
            if(contact.getName().equals(name) && contact.getLastName().equals(lastName) && contact.getPhone().equals(phone))
                break;

            count++;
        }

        getUsers().remove(count);
        this.name = this.lastName = address = this.phone = email = "";
    }

    public void editUser(String name, String lastName, String phone){
        for (User contact: getUsers()) {
                    if(contact.getName().equals(name) && contact.getLastName().equals(lastName) && contact.getPhone().equals(phone)){
                        if(!name.equals(""))
                            contact.setName(name);
                        if(!lastName.equals(""))
                            contact.setLastName(lastName);
                        if(!phone.equals(""))
                            contact.setPhone(phone);
                        if(!email.equals(""))
                            contact.setEmail(email);
                        if(!address.equals(""))
                            contact.setAddress(address);

                break;
            }
        }
        this.name = this.lastName = address = this.phone = email = "";
    }

    // Getters and Setters
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
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getSelecteduser() {
        return selecteduser;
    }

    public void setSelecteduser(User selectedContact) {
        this.selecteduser = selectedContact;
    }
}
