package gyu.prj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gyu.prj.model.TestHelloWorldVO;

@Service
public interface TestHelloWorldService {

	// 목록페이지
		public List<TestHelloWorldVO> boardList() throws Exception;
}
