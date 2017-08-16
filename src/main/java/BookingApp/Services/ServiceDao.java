package BookingApp.Services;

import BookingApp.Company.Company;

import javax.persistence.Entity;
import javax.persistence.*;
@Entity
    @Table(name="services")
    public class ServiceDao {

        private static final long serialVersionUID = -3009157732242241606L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @ManyToOne(fetch = FetchType.EAGER)
        private Company company;

        @Column(name = "name")
        private String name;

        @Column(name = "description")
        private String description;

        @Column(name = "duration")
        private String duration;

        @Column(name = "free_space")
        private int free_space;

        @Column(name = "price")
        private double price;

        @Column(name = "date")
        private String date;

        public ServiceDao() {}

        public ServiceDao(String name, String description, String duration, int free_space, double price, String date) {
            this.name = name;
            this.description = description;
            this.duration = duration;
            this.free_space = free_space;
            this.price = price;
            this.date = date;
        }

        public ServiceDao(long id_company, String name, String description, String duration, int free_space, double price, String date) {
            this.company = new Company(id_company, "","","");
            this.name = name;
            this.description = description;
            this.duration = duration;
            this.free_space = free_space;
            this.price = price;
            this.date = date;
        }

        public long getId() {
            return id;
        }

        public Company getCompany() {
            return company;
        }

        public void setCompany(Company company) {
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public int getFree_space() {
            return free_space;
        }

        public void setFree_space(int free_space) {
            this.free_space = free_space;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSchedule() {
            return date;
        }

        public void setSchedule(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Service{" +
                    "id=" + id +
                    ", company=" + company +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", duration='" + duration + '\'' +
                    ", free_space=" + free_space +
                    ", price=" + price +
                    ", date='" + date + '\'' +
                    '}';
        }
    }

