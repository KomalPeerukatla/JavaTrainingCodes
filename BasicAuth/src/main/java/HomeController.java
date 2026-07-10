
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "hello";
    }
}
