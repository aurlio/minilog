package com.tencent.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	public String index() {
		return "home/home.vm";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexForShort() {
		return "redirect:/index.htm";
	}

	@RequestMapping(value = "/edit.htm", method = RequestMethod.GET)
	public String edit() {
		return "home/edit.vm";
	}

	@RequestMapping(value = "/create.htm", method = RequestMethod.GET)
	public String create() {
		return "home/create.vm";
	}
}
