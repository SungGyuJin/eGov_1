package gyu.prj.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gyu.prj.service.TestHelloWorldService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Resource(name = "testHelloWorldService")
	private TestHelloWorldService testService;
	
	@RequestMapping("/hello.do")
	public @ResponseBody String HelloWorldTest() {
		return "Hello World";
	}
	
	@RequestMapping("/testDB.do")
	public @ResponseBody String testDB() throws Exception{
		return testService.testDB();
	}
	
}
