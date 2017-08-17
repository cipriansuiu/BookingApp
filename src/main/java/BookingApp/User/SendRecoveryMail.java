package BookingApp.User;

public class SendRecoveryMail {

    String email;

    public void SendEmail(String email) {
        this.email = email;
    }

    public void SendEmail(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
