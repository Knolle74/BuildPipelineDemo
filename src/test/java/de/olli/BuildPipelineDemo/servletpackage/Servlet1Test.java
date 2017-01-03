package de.olli.BuildPipelineDemo.servletpackage;

import static org.junit.Assert.*;
import org.springframework.mock.web.*;

import javax.servlet.ServletException;

import org.junit.Before;
import org.junit.Test;

public class Servlet1Test {

	private Servlet1 servlet = new Servlet1();
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;
	
	@Before
	public void before() throws ServletException {
		servlet.init(new MockServletConfig());
		
		this.servlet=new Servlet1();
		this.request=new MockHttpServletRequest();
		this.response=new MockHttpServletResponse();
	}
	
	@Test
	public void doGetTest() throws Exception {
		request.setParameter("zahl1", "2");
		request.setParameter("zahl2", "2");
		servlet.doGet(request, response);
		//assertEquals("Test", response.getContentAsString());
		assertNotNull(response.getContentAsString());
	}

}
