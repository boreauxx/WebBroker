package webbroker.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import webbroker.exceptions.LoginCredentialsException;

@Controller
public class LoginController {

    @ExceptionHandler(LoginCredentialsException.class)
    public String handleLoginCredentialsError(LoginCredentialsException e,
                                              RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("badCredentials", true);
        System.out.println(e.getMessage());
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("badCredentials", true);
        return "login";
    }
}
