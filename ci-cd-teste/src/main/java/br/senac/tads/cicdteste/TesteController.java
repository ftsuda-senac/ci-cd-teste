package br.senac.tads.cicdteste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/teste")
public class TesteController {

	@GetMapping
	public ModelAndView teste() {
		ModelAndView mv = new ModelAndView("teste");
		mv.addObject("msg", "Teste CI/CD");
		return mv;
	}

}
