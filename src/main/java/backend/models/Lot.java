package backend.models;

import java.util.ArrayList;

public class Lot {

    private int id;
    private String title;
    private String description;
    private String street_number;
    private String street_name;
    private String username;
    private String email;
    private String appraisal;
    private String sale_price;
    private String city;
    private String state;
    private String gov_org;

//    id            | int           | NO   | PRI | NULL    | auto_increment |
//            | street_number | int           | NO   |     | NULL    |                |
//            | username      | varchar(45)   | NO   | MUL | NULL    |                |
//            | street_name   | varchar(45)   | NO   |     | NULL    |                |
//            | email         | varchar(45)   | NO   |     | NULL    |                |
//            | user          | varchar(45)   | NO   |     | NULL    |                |
//            | appraisal     | decimal(10,2) | YES  |     | NULL    |                |
//            | sale_price    | decimal(10,2) | YES  |     | NULL    |                |
//            | city          | varchar(45)   | NO   |     | NULL    |                |
//            | state         | varchar(45)   | NO   |     | NULL    |                |
//            | gov_org

    public Lot() {
    }

    public Lot(String title, String description, String street_number, String street_name, String username, String email, String appraisal, String sale_price, String city, String state, String gov_org) {
        this.title = title;
        this.description = description;
        this.street_number = street_number;
        this.street_name = street_name;
        this.username = username;
        this.email = email;
        this.appraisal = appraisal;
        this.sale_price = sale_price;
        this.city = city;
        this.state = state;
        this.gov_org = gov_org;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(String appraisal) {
        this.appraisal = appraisal;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGov_org() {
        return gov_org;
    }

    public void setGov_org(String gov_org) {
        this.gov_org = gov_org;
    }
}

