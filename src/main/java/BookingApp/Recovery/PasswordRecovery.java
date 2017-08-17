package BookingApp.Recovery;

import BookingApp.User.User;

import javax.persistence.*;

@Entity
public class PasswordRecovery {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name="token")
        private String token;

        @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
        @JoinColumn(nullable = false, name = "user_id")
        private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PasswordRecovery()
    {

    }

    public PasswordRecovery(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;

    }

    public User getUser() {
        return user;
    }
}

