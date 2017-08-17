package BookingApp.Recovery;

import BookingApp.User.SimpleEmailController;
import BookingApp.User.User;
import BookingApp.User.UserService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Locale;
import java.util.UUID;

public class PasswordController {

    private UserService userService;
    private PasswordService passwordService;

    @RequestMapping(value = "/user/resetPassword")
    @ResponseBody
    public String resetPassword(
    @RequestParam("email") String userEmail) throws Exception {
        User user = userService.findUserByEmail(userEmail);
        if (user == null) {
            throw new Exception("User not found!");
        }
        String token = UUID.randomUUID().toString();
        passwordService.createPasswordResetTokenForUser(user, token);
        passwordService.sendEmail(userEmail, "Please click this link: http://127.0.0.1:9001/"+token);
        return "Email has been sent!";
    }

    @RequestMapping(value = "/user/changePassword", method = RequestMethod.GET)
    public String showChangePasswordPage(Locale locale, @RequestParam("token") String token,
    @RequestParam("id") long id)
    {
        String result = passwordService.validatePasswordResetToken(id, token);
        if (result != null) {
            return "redirect:/login?lang=" + locale.getLanguage();
        }
        return "redirect:/updatePassword.html?lang=" + locale.getLanguage();
    }



    @RequestMapping(value = "/user/savePassword", method = RequestMethod.POST)
    @ResponseBody
    public void savePassword(@RequestBody User user, @RequestParam String newPassword) {
//        user =
//                (User) SecurityContextHolder.getContext()
//                        .getAuthentication().getPrincipal();

        userService.changeUserPassword(user, newPassword);
    }

}
