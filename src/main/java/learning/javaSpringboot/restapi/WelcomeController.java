package learning.javaSpringboot.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to spring boot application";
	}
}
