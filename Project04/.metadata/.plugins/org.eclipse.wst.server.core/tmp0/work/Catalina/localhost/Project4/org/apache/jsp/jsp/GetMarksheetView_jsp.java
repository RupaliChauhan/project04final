/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2022-01-08 10:53:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.rays.pro4.controller.GetMarksheetCtl;
import com.rays.pro4.Util.ServletUtility;
import com.rays.pro4.Util.DataUtility;
import com.rays.pro4.controller.LoginCtl;
import com.rays.pro4.bean.RoleBean;
import com.rays.pro4.bean.UserBean;
import com.rays.pro4.controller.ORSView;

public final class GetMarksheetView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1637751371616L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1641638274631L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.rays.pro4.controller.GetMarksheetCtl");
    _jspx_imports_classes.add("com.rays.pro4.bean.UserBean");
    _jspx_imports_classes.add("com.rays.pro4.controller.LoginCtl");
    _jspx_imports_classes.add("com.rays.pro4.Util.ServletUtility");
    _jspx_imports_classes.add("com.rays.pro4.bean.RoleBean");
    _jspx_imports_classes.add("com.rays.pro4.controller.ORSView");
    _jspx_imports_classes.add("com.rays.pro4.Util.DataUtility");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\r\n");
      out.write("<title> Get marksheet</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      com.rays.pro4.bean.MarksheetBean bean = null;
      bean = (com.rays.pro4.bean.MarksheetBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new com.rays.pro4.bean.MarksheetBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("   <form action=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("\t");

    UserBean userBean = (UserBean)session.getAttribute("user");
    boolean userLoggedIn = userBean != null;
    String welcomeMsg = "Hi, ";
    if (userLoggedIn) {
        String role = (String)session.getAttribute("role");
        welcomeMsg += userBean.getFirstName() + " (" + role + ")";
    } else {
        welcomeMsg += "Guest";
    }
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table >\r\n");
      out.write("    <tr ><th></th>\r\n");
      out.write("       <td width=\"90%\" >\r\n");
      out.write("      \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a> |\r\n");
      out.write("      \r\n");
      out.write("            \t");

            		if (userLoggedIn) {
      		 	 
      out.write(" \r\n");
      out.write("       <a href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("            ");

                } else {
            
      out.write(" \r\n");
      out.write("            <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> \r\n");
      out.write("            ");

  			   }
			 
      out.write("\r\n");
      out.write(" \t\t</td>\r\n");
      out.write("        <td rowspan=\"2\" >\r\n");
      out.write("            <h1 align=\"right\" >\r\n");
      out.write("                <img src= \"");
      out.print(ORSView.APP_CONTEXT );
      out.write("/img/customLogo.jpg\"  width=\"175\" height=\"50\">\r\n");
      out.write("            </h1>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t    <tr><th></th>\r\n");
      out.write("\t\t      <td>\r\n");
      out.write("        <h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    ");

        if (userLoggedIn) {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr><th></th>\r\n");
      out.write("        <td colspan=\"2\" >     \r\n");
      out.write("        <font style=\"font-size: 18px\">\r\n");
      out.write("       \t \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> |       \r\n");
      out.write("         <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> |\r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> |              \r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet MeritList</b></a> |\r\n");
      out.write("        \r\n");
      out.write("        ");

            if (userBean.getRoleId() == RoleBean.ADMIN) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> |         \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_CTL );
      out.write("\" >Add Course</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\" >Subject List</b></a> |          \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_CTL );
      out.write("\" >Add Faculty</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.STUDENT) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t");

            if (userBean.getRoleId() == RoleBean.KIOSK) {
        
      out.write(" \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.FACULTY) {
           // System.out.println("======>><><>"+userBean.getRoleId());	
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |   \r\n");
      out.write("        <br>    \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.COLLEGE) {
       //    System.out.println("======>><><>"+userBean.getRoleId());	
          
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t</font>\r\n");
      out.write(" \t\t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \t");

        	}
   		 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("</body>\t\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("\t        <h1>Get Marksheet</h1>\r\n");
      out.write("\t\r\n");
      out.write("        \t<h3><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h3>\r\n");
      out.write("       \t\t<H3><font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font></H3> \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("            <table>\r\n");
      out.write("          \t<tr><th align=\"left\"> Roll No <span style=\"color:red\">*</span> :</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"rollNo\" placeholder=\"Enter RollNo.\" size=\"25\" value=\"");
      out.print(ServletUtility.getParameter("rollNo", request));
      out.write("\">\r\n");
      out.write("\t\t\t\t</td><td style=\"position: fixed\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("rollNo", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>                \r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                <tr><th style=\"padding: 3px\"></th></tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr><th></th><td> &nbsp;&emsp;<input type=\"submit\" name=\"operation\" value=\"");
      out.print(GetMarksheetCtl.OP_GO);
      out.write("\">\r\n");
      out.write("                \t\t\t&nbsp;&nbsp;<input type=\"submit\" name=\"operation\" value=\"");
      out.print(GetMarksheetCtl.OP_RESET);
      out.write("\">\r\n");
      out.write("                </td></tr>\r\n");
      out.write("                \r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("             ");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                   ");

                    if (bean.getName()!= null  && bean.getName().length() >= 0 ) {
                
      out.write(" \r\n");
      out.write("                \r\n");
      out.write("\t\t\t<table >\r\n");
      out.write("\t\t\t\t<table border=\"1\" width=\"100%\">\r\n");
      out.write("\t\t\t\t  <tr align=\"center\" style=\"background: skyblue\">\r\n");
      out.write("\t\t\t\t  \t<td><h2>Rays Technologies</h2></td>\r\n");
      out.write("\t\t\t\t  </tr></table>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t <table border=\"1\" width=\"100%\">\r\n");
      out.write("\t\t\t\t \t<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t \t\t<th> Name</th>\r\n");
      out.write("\t\t\t\t \t\t<td> ");
      out.print(DataUtility.getStringData(bean.getName()) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t \t\t<th> Roll No</th>\r\n");
      out.write("\t\t\t\t \t\t<td> ");
      out.print(DataUtility.getStringData(bean.getRollNo()) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t \t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t \t<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t \t\t<th> Status</td>\r\n");
      out.write("\t\t\t\t \t\t<td>Regular</th>\r\n");
      out.write("\t\t\t\t \t\t<th> Course</td>\r\n");
      out.write("\t\t\t\t \t\t<td>BE</th>\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\r\n");
      out.write("\t\t\t\t </table> \r\n");
      out.write("\t");

	int phy =DataUtility.getInt(DataUtility.getStringData(bean.getPhysics()));
	int chem =DataUtility.getInt(DataUtility.getStringData(bean.getChemistry()));
	int math =DataUtility.getInt(DataUtility.getStringData(bean.getMaths()));
	int total = (phy+chem+math);
	float perc = total/3;
	
      out.write("\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t<table border=\"1\" width=\"100%\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr align=\"center\" style=\"background: skyblue\" style=\"width: 25%\">\r\n");
      out.write("\t\t\t\t\t<th>Subject</th>\r\n");
      out.write("\t\t\t\t\t<th>Maximum Marks</th>\r\n");
      out.write("\t\t\t\t\t<th>Minimum Marks</th>\r\n");
      out.write("\t\t\t\t\t<th>Marks Obtained</th>\r\n");
      out.write("\t\t\t\t\t<th>Grade</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t<td>Physics</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>33</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(phy );
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if(phy<33){
      out.write("\r\n");
      out.write("\t\t\t\t\t<span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

					if(phy <=100 && phy >85){ 
      out.write(" A+\r\n");
      out.write("\t\t\t\t");
} else if(phy<=85 && phy > 75 ) {
      out.write("B+\r\n");
      out.write("\t\t\t\t");
} else if(phy<=75 && phy > 65 ) {
      out.write("B\r\n");
      out.write("\t\t\t\t");
} else if(phy<=65 && phy > 55 ){ 
      out.write("C+\r\n");
      out.write("\t\t\t\t");
} else if(phy<=55 && phy >=33  ){ 
      out.write("C\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} else if(phy< 33 && phy >= 0 ) {
      out.write("<span style=\"color: red\"> Fail</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t<td>Chemistry</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>33</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(chem );
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if(chem<33){
      out.write("\r\n");
      out.write("\t\t\t\t\t<span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

					if(chem <=100 && chem >85){ 
      out.write(" A+\r\n");
      out.write("\t\t\t\t");
} else if(chem<=85 && chem > 75 ) {
      out.write("B+\r\n");
      out.write("\t\t\t\t");
} else if(chem <=75 && chem > 65 ) {
      out.write("B\r\n");
      out.write("\t\t\t\t");
} else if(chem <=65 && chem > 55 ){ 
      out.write("C+\r\n");
      out.write("\t\t\t\t");
} else if(chem <=55 && chem >=33  ){ 
      out.write("C\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} else if(chem < 33 && chem >= 0 ) {
      out.write("<span style=\"color: red\"> Fail</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t<td> Maths</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>33</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(math );
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if(math<33){
      out.write("\r\n");
      out.write("\t\t\t\t\t<span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

					if(math <=100 && math >85){ 
      out.write(" A+\r\n");
      out.write("\t\t\t\t");
} else if(math <=85 && math > 75 ) {
      out.write("B+\r\n");
      out.write("\t\t\t\t");
} else if( math <=75 && math > 65 ) {
      out.write("B\r\n");
      out.write("\t\t\t\t");
} else if(math <=65 && math > 55 ){ 
      out.write("C+\r\n");
      out.write("\t\t\t\t");
} else if(math <=55 && math >=33  ){ 
      out.write("C\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} else if(math < 33 && math >= 0 ) {
      out.write("<span style=\"color: red\"> Fail</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\t  \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table border=\"1\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr style=\"background: skyblue\">\r\n");
      out.write("\t\t\t\t<th>Total</th>\r\n");
      out.write("\t\t\t\t<th>Percentage</th>\r\n");
      out.write("\t\t\t\t<th>Division</th>\r\n");
      out.write("\t\t\t\t<th>Result</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"background: darkcream\">");
      out.print(total );
      out.write("\r\n");
      out.write("\t\t\t\t");
 if(total<99 || phy<33|| chem<33|| 	math<33){ 
      out.write("\r\n");
      out.write("\t\t\t\t<span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</th>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<th style=\"background: darkcream\">");
      out.print(perc );
      out.write(" %</th>\r\n");
      out.write("\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t");
 if(perc <100 && perc >= 60){ 
      out.write("1<sup>st</sup>\r\n");
      out.write("\t\t\t\t");
} else if(perc <60 && perc >=40){ 
      out.write("2<sup>nd</sup>\r\n");
      out.write("\t\t\t\t");
} else if(perc <40 && perc >=0){ 
      out.write("3<sup>rd</sup>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<th style=\"background: darkcream\">\r\n");
      out.write("\t\t\t\t");

				if(phy >=33 && chem>=33 && math >= 33) { 
      out.write("\r\n");
      out.write("\t\t\t\t<span style=\"color: green\"> Pass</span>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<span style=\"color: red\"> Fail</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t</table>\t\t\r\n");
      out.write(" </form>\r\n");
      out.write("    </center>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("#footer {\r\n");
      out.write("    \r\n");
      out.write("    position: fixed;\r\n");
      out.write("    left:0;\r\n");
      out.write("    width:100%; \r\n");
      out.write("    bottom:0;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("    color:black;\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   text-align:center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id =\"footer\">\r\n");
      out.write("<CENTER><hr>\r\n");
      out.write("    <H3>&copy; Copyrights RAYS Technologies</H3>\r\n");
      out.write("</CENTER>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
