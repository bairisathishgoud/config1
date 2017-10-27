package com.slokam.sample.springbootsample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ourcontroller {

	@RequestMapping("getdata")
	@ResponseBody
	public String getdata()
	{
		return "iam from warangal";
		
	}

}
