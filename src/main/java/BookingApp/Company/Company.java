package BookingApp.Company;

import BookingApp.User.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "companies", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Company implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String image_url;


    public Company(User user, String name, String description, String image_url) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.image_url = image_url;
    }

    public Company(long idAdmin, String name, String description, String image_url) {
        this.user = new User(idAdmin,"", "","");
        this.name = name;
        this.description = description;
        this.image_url = image_url;
    }
    public Company(){}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
