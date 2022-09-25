package gyu.prj.mapper;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import gyu.prj.model.TestHelloWorldVO;

@Mapper("TestHelloWorldMapper")
public interface TestHelloWorldMapper {

	// 목록페이지
	public List<TestHelloWorldVO> boardList() throws Exception;
}
