package dadSiliconaPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greetingController {

	@GetMapping("/greeting")
	public String greeting(Model model) {

		model.addAttribute("name", "Mundo");

		return "greetingTemplate";
	}

}
