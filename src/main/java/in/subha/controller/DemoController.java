package in.subha.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/msg")
	public ModelAndView getMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Welcome To Odisha...");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/date")
	public ModelAndView getDate() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("date",new Date());
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/name")
	public String getName(Model model) {
		model.addAttribute("name","Subhshree...");
		return "index";
		
	}
	
	@GetMapping("/")
	@ResponseBody
	public String getDirectMsg() {
		return "Good Evening...";
	}

}
