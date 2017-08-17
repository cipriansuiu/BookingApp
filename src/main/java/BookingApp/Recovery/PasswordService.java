package BookingApp.Recovery;

import BookingApp.User.User;
import BookingApp.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import java.io.WriteAbortedException;
import java.util.Arrays;
import java.util.Locale;

public class PasswordService {

    private UserRepository userRepository;
    private passwordTokenRepository passwordTokenRepository;
    @Autowired
    private JavaMailSender sender;

    public void createPasswordResetTokenForUser(User user, String token) {
        PasswordRecovery myToken = new PasswordRecovery(token, user);
        passwordTokenRepository.save(myToken);
    }

    public String validatePasswordResetToken(long id, String token) {
        PasswordRecovery passToken =
                passwordTokenRepository.findByToken(token);
        if ((passToken == null) || (passToken.getUser()
                .getId() != id)) {
            return "invalidToken";
        }

        User user = passToken.getUser();
        Authentication auth = new UsernamePasswordAuthenticationToken(
                user, null, Arrays.asList(
                new SimpleGrantedAuthority("CHANGE_PASSWORD_PRIVILEGE")));
        SecurityContextHolder.getContext().setAuthentication(auth);
        return null;
    }

    private SimpleMailMessage constructEmail(String subject, String body,
                                             User user) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setSubject(subject);
        email.setText(body);
        email.setTo(user.getEmail());
        return email;
    }


    public void sendEmail(String email,String body) throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo(email);
        helper.setText(body);
        helper.setSubject("Registration confirmation");

        sender.send(message);
    }

}
