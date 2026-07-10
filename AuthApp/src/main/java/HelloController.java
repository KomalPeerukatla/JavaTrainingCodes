
public class HelloController {
	@RequestMapping("/")
    public String home() {

        return "home";

    }
}
