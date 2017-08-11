package BookingApp.Booking;


import BookingApp.Services.ServiceDao;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private ServiceDao servicedao;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private String phone_number;

    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "availability", length = 10)
    private Date availability;

    public Booking()
    {

    }

    public Booking(ServiceDao serviceDao, String name, String email, String phone_number, Date availability) {
        this.servicedao = serviceDao;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.availability = availability;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ServiceDao getServiceDao() {
        return servicedao;
    }

    public void setServiceDao(ServiceDao serviceDao) {
        this.servicedao = serviceDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getAvailability() {
        return availability;
    }

    public void setAvailability(Date availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", serviceDao=" + servicedao +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", availability=" + availability +
                '}';
    }
}
