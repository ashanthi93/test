package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Admin Home Page | Mart Runner</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"static/css/martRunner.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"header\"> </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\" >\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"box\" style=\"background-color:#FCFAF8\">\r\n");
      out.write("                    <table class=\"col-lg-12\" >\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div class=\"col-lg-12\" align=\"left\" style=\"width:200px; height:500px;background-color:#DECEBE\"> \r\n");
      out.write("                                    <center> <label style=\"color: #000000; padding-top:35px; font-size:20px;\"> ADMINISTRATOR </label>  <br/><br/> \r\n");
      out.write("\r\n");
      out.write("                                        <span class=\"glyphicon glyphicon-user\" style=\"font-size:100px; color:#000000;\"></span> <br/><br/> \r\n");
      out.write("                                        <button class=\"btn btn-default\" style=\"width:135px;\"> <strong> <center>Edit Profile</center></strong>\r\n");
      out.write("                                        </button>\r\n");
      out.write("\r\n");
      out.write("                                        <br/><br/> <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <span class=\"glyphicon glyphicon-cog\" style=\"font-size:100px; color:#000000;\"></span> <br/><br/> \r\n");
      out.write("                                        <button class=\"btn btn-default\" style=\"width:135px\" > <strong>Update Website</strong></button>\r\n");
      out.write("                                    </center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div  class=\"col-lg-12\" style=\"width:30px; height:500px; \"> </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td align=\"right\">\r\n");
      out.write("                                <div style=\" width:800px; height:500px;\" align=\"left\" >\r\n");
      out.write("                                    <div class=\"col-lg-12\">\r\n");
      out.write("                                        <h3><label style=\"color:#009933; padding-left:130px;\" >Admin Dashboard </label> </h3>\r\n");
      out.write("                                        <label style=\"color:#000000; font-size:15px; padding-left:90px;\">Welcome Amanda Kessells,Love to see you back</label>\r\n");
      out.write("                                        <br/>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-lg-12 \" id=\"iconDiv\">\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;\" align=\"center\">\r\n");
      out.write("                                            <a href=\"#\"><span class=\"glyphicon glyphicon-envelope\" style=\"font-size:60px; color:#FFCC00;padding-top:10px\"></span><br/>\r\n");
      out.write("                                                <label style=\"color:#000000;padding-top: 8px;\">Messages</label></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:15px;height:120px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <a href=\"#\"><span class=\"glyphicon glyphicon-bell\" style=\"font-size:60px; color:#BC2312;\"></span><br/>\r\n");
      out.write("                                                <label style=\"color:#000000;padding-top: 8px;\">Notifications</label></a>\r\n");
      out.write("                                        </div>  \r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:15px;height:120px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <a href=\"#\"><span class=\"glyphicon glyphicon-user\" style=\"font-size:60px; color:#0066CC;\"></span><br/>\r\n");
      out.write("                                                <label style=\"color:#000000;padding-top: 8px;\">Requests</label></a>\r\n");
      out.write("                                        </div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:800px;height:15px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-wrench\" style=\"font-size:60px; color:#99CCCC;\"></span><br/>\r\n");
      out.write("                                            <!--<label style=\"color:#000000\">Vendor Handling</label></a>-->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"btn-group\" align=\"center\" >\r\n");
      out.write("                                                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#000000\">\r\n");
      out.write("                                                    <b> Vendor Handling</b>\r\n");
      out.write("                                                    <span class=\"caret\"></span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                                    <li><a  href=\"#\">Create Vendor</a></li>\r\n");
      out.write("                                                    <li><a  href=\"#\">Update Vendor</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Remove Vendor</a></li>\r\n");
      out.write("\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:15px;height:120px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-ok-sign\" style=\"font-size:60px; color:#CCCC00;\"></span><br/>\r\n");
      out.write("                                            <!--<label style=\"color:#000000\">Vendor Attendance</label></a>-->\r\n");
      out.write("                                            <div class=\"btn-group\" align=\"center\" >\r\n");
      out.write("                                                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#000000\" >\r\n");
      out.write("                                                    <b> Vendor Attendance</b>\r\n");
      out.write("                                                    <span class=\"caret\"></span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Confirm Vendor Attendance</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">View Vendor Attendance</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>  \r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:15px;height:120px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-search\" style=\"font-size:60px; color:#666666;\"></span><br/>\r\n");
      out.write("                                            <!--<label style=\"color:#000000\">Search Vendors</label></a>-->\r\n");
      out.write("                                            <div class=\"btn-group\" align=\"center\" >\r\n");
      out.write("                                                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#000000\" >\r\n");
      out.write("                                                    <b> Search Vendors</b>\r\n");
      out.write("                                                    <span class=\"caret\"></span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Search by Market</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Search by Main Category</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Search by Sub Category</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>  \r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:800px;height:15px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-usd\" style=\"font-size:60px; color:#663366;\"></span><br/>\r\n");
      out.write("                                            <!--<label style=\"color:#000000\">Payment Handling</label></a>-->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"btn-group\" align=\"center\" >\r\n");
      out.write("                                                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#000000\" >\r\n");
      out.write("                                                    <b> Payment Handling</b>\r\n");
      out.write("                                                    <span class=\"caret\"></span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Add Payment</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">View Payment</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Edit Payment</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Remove Payment</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>  \r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:15px;height:120px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-globe\" style=\"font-size:60px; color:#000066;\"></span><br/>\r\n");
      out.write("                                            <!--<label style=\"color:#000000\">Posts</label></a>-->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"btn-group\" align=\"center\" >\r\n");
      out.write("                                                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#000000\" >\r\n");
      out.write("                                                    <b> Posts</b>\r\n");
      out.write("                                                    <span class=\"caret\"></span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Promotional Page</a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Special Post</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>  \r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-lg-12 \" style=\"width:15px;height:120px;\" ></div>\r\n");
      out.write("                                        <div class=\"col-lg-12 rcorners\" style=\"width:200px;height:120px;padding-top:10px;\" align=\"center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-map-marker\" style=\"font-size:60px; color:#009900;\"></span><br/>\r\n");
      out.write("                                            <!-- <label style=\"color:#000000\">Stall Assignments</label></a>-->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"btn-group\" align=\"center\" >\r\n");
      out.write("                                                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" style=\"color:#000000\" >\r\n");
      out.write("                                                    <b> Stall Assignments</b>\r\n");
      out.write("                                                    <span class=\"caret\"></span>\r\n");
      out.write("                                                </a>\r\n");
      out.write("\r\n");
      out.write("                                                <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("                                                    <li><a href=\"#\">Reserve Stalls </a></li>\r\n");
      out.write("                                                    <li><a href=\"#\">Update Stall Assignment</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div> \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\t \r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("        <div id=\"footer\"> </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"static/js/jquery_2.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $(\"#header\").load(\"header.jsp\");\r\n");
      out.write("                $(\"#footer\").load(\"footer_sub.jsp\");\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"static/js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("        <script src=\"static/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}