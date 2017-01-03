package de.olli.BuildPipelineDemo.servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  /**
   * @see HttpServlet#HttpServlet()
   */
  
  public Servlet1() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    PrintWriter out = response.getWriter();
    int zahl1 = Integer.parseInt(request.getParameter("int1"));
    int zahl2 = Integer.parseInt(request.getParameter("int2"));
    out.println("<html>");
    out.println("<h3> Hallo mein erstes Servlet meldet sich </h3>");
    out.println("Paramater 1 = " + request.getParameter("String1"));
    out.println("Paramater 2 = " + request.getParameter("String2"));
    out.println(Calculator.calculate(zahl1, zahl2));
    out.println("<a href='/BuildPipelineDemo/'>zurück</a>");
    out.println("</html>");
    out.close();
    response.setContentType("text/html");
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }

  /** 
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }
}
