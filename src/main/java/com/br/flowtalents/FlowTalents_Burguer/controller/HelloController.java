package com.br.flowtalents.FlowTalents_Burguer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/exibeHello")
	@ResponseBody
	public String exibeHello() {
		return "Hello, World!";
	}
}
