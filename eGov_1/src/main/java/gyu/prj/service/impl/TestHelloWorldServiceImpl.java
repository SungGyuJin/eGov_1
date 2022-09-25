package gyu.prj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gyu.prj.mapper.TestHelloWorldMapper;
import gyu.prj.model.TestHelloWorldVO;
import gyu.prj.service.TestHelloWorldService;

@Service("TestHelloWorldService")
public class TestHelloWorldServiceImpl implements TestHelloWorldService{

	@Autowired
	private TestHelloWorldMapper testMapper;

	@Override
	public List<TestHelloWorldVO> boardList() throws Exception {
		// TODO Auto-generated method stub
		return testMapper.boardList();
	}

	

}
