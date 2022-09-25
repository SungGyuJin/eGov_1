package gyu.prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import gyu.prj.service.TestHelloWorldService;

@Controller
@RequestMapping(value = "test")
public class TestController {

	@Autowired
	private TestHelloWorldService testService;

	@RequestMapping(value = "hello.do")
	public @ResponseBody String HelloWorldTest() {
		System.out.println("hello.do 진입");
		return "Hello World";
	}

	@RequestMapping(value = "testDB.do")
	public void testDB(Model model) throws Exception {

		model.addAttribute("list", testService.boardList());

		System.out.println("testDB 진입");
	}

	@RequestMapping(value = "detailPage.do")
	public ModelAndView detailMoveGET() throws Exception {

		ModelAndView mav = null;
		
		mav = new ModelAndView("test/detailPage");
		
		System.out.println("detailPage 진입");
		
		return mav;
	}
	
	@RequestMapping(value = "enroll.do")
	public @ResponseBody String enrollMove() throws Exception {

		System.out.println("enroll 진입");
		
		return "hi korea";
	}

}
