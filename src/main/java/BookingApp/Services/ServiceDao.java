package BookingApp.Services;

import BookingApp.User.User;

import javax.persistence.*;

    @Entity
    @Table(name="services")
    public class ServiceDao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "description")
        private String description;

        @Column(name = "duration")
        private String durationn;

        @Column(name = "spaces")
        private String space;

        @Column(name = "price")
        private double price;

        @Column(name = "availability")
        private String availability;

        @ManyToOne
        private User user;

        public ServiceDao()
        {

        }

        public ServiceDao(String name, String description, String durationn, String space, double price, String availability) {
            this.name = name;
            this.description = description;
            this.durationn = durationn;
            this.space = space;
            this.price = price;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDurationn() {
            return durationn;
        }

        public void setDurationn(String durationn) {
            this.durationn = durationn;
        }

        public String getSpace() {
            return space;
        }

        public void setSpace(String space) {
            this.space = space;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }

        @Override
        public String toString() {
            return "ServiceDao{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", durationn='" + durationn + '\'' +
                    ", space='" + space + '\'' +
                    ", price=" + price +
                    ", availability='" + availability + '\'' +
                    ", user=" + user +
                    '}';
        }
    }

