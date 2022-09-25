package gyu.prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gyu.prj.service.TestHelloWorldService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestHelloWorldService testService;
	
	@RequestMapping("/hello.do")
	public @ResponseBody String HelloWorldTest() {
		System.out.println("hello.do 진입");
		return "Hello World";
	}
	
	@RequestMapping("/testDB.do")
	public void testDB(Model model) throws Exception{
		
		model.addAttribute("list", testService.boardList());
		
		System.out.println("testDB 진입");
	}
	
}
