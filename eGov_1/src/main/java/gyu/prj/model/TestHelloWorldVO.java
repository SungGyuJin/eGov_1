package gyu.prj.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestHelloWorldVO {

	private int			bno;
	private String		title;
	private String		content;
	private String		writer;
	private Date		regdate;
	private Date		updatedate;
}
