package com.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/rest/getMsg")

public class helloService {
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String getGreetings() throws IOException{
		return "Hello World From Compass";
	}
}
