package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Displays the login page when visiting "/"
    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String showLoginPage() {
        return "login";
    }

    // Displays the login page when visiting "/login"
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    // Handles form submission when the login button is clicked
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(@RequestParam String username, @RequestParam String password, ModelMap model) {
        
        // Dummy credential check (Change "admin" and "password" to whatever you like)
        if (username.equalsIgnoreCase("admin") && password.equals("password")) {
            model.put("name", username);
            return "dashboard"; // Goes to dashboard.jsp
        }
        
        // If wrong, sends an error message back to the login page
        model.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }
}

