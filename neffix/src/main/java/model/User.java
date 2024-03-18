package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer Id;

    @Column(name = "first_name", nullable = false)
    private String First_Name;

    @Column(name = "last_name", nullable = false)
    private String Last_Name;

    @Column(name="date_of_birth", nullable = false)
    private Date Date_Of_Birth;

    @Column(name = "gender", nullable = false)
    private Enum Gender;

    public User() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public Date getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(Date date_Of_Birth) {
        Date_Of_Birth = date_Of_Birth;
    }

    public Enum getGender() {
        return Gender;
    }

    public void setGender(Enum gender) {
        Gender = gender;
    }

    public User(Integer id, String first_Name, String last_Name, Date date_Of_Birth, Enum gender) {
        Id = id;
        First_Name = first_Name;
        Last_Name = last_Name;
        Date_Of_Birth = date_Of_Birth;
        Gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
            "Id=" + Id +
            ", First_Name='" + First_Name + '\'' +
            ", Last_Name='" + Last_Name + '\'' +
            ", Date_Of_Birth=" + Date_Of_Birth +
            ", Gender=" + Gender +
            '}';
    }
}
