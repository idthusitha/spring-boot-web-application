package com.example.springbootwebapplication.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	static Logger logger = Logger.getLogger(DataController.class);

	@RequestMapping(value = "/servicecheck", method = RequestMethod.GET)
	public String servicecheck() {
		return "This is the First Message From Remote common-data-service!";
	}

}
