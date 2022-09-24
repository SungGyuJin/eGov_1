package gyu.prj.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import gyu.prj.mapper.TestHelloWorldMapper;
import gyu.prj.service.TestHelloWorldService;

@Service("TestHelloWorldService")
public class TestHelloWorldServiceImpl extends EgovAbstractServiceImpl implements TestHelloWorldService{

	@Resource(name="TestHelloWorldMapper")
	private TestHelloWorldMapper testMapper;
	
	@Override
	public String testDB() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
