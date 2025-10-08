package ikasaidi.backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcustomer;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String email;
    private String phone;
    private String username;
    private String password;
    private Double balance;



    public Customer() {

    }

    public Customer(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Long idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return  "{Customer: " + "\n" +
                "Id: " + idcustomer + "\n" +
                "First Name: " + first_name  + "\n" +
                "Last Name: " + last_name + "\n" +
                "Date of birth: " + date_of_birth + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone +  "\n" +
                "Username: " + username +  "\n" +
                "Password: " + password + "\n" +
                "Balance: " + balance + "}";
    }
}