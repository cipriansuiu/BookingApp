package BookingApp.Booking;


import BookingApp.Services.ServiceDao;

import javax.persistence.*;
//import java.sql.Date;

import java.util.Date;

@Entity
@Table(name="booking")
public class Booking  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="service_id")
    private long service_id;

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

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    public Booking(long serviceId, String name, String email, String phone_number, Date availability) {
        this.service_id= serviceId;
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

    public boolean betweenDates(Date startDate)
    {

        Date afterDate=new Date(startDate.getYear(),startDate.getMonth(),startDate.getDay()+6);

        return this.availability.after(startDate)&&this.availability.before(afterDate);
    }


    @Override
    public String toString() {
        return "Booking{" +
                ", id=" + id +
                ", service_id=" + service_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", availability=" + availability +
                '}';
    }
}
