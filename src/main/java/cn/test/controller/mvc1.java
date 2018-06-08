package cn.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mvc1 {
	
	@GetMapping("/helloWord")
	public String helloWord(){
		
		
		System.out.println("/helloWord");
		
		return "huchao";
	}

}
