package gyu.prj.mapper;

import java.util.List;

import gyu.prj.model.TestHelloWorldVO;

public interface TestHelloWorldMapper {

	List<TestHelloWorldVO> testDB() throws Exception;
}
