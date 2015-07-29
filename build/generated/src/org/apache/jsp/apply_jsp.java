package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class apply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title> Apply | MartRunner </title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"static/css/headerStyles.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"static/css/footerStyles.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"static/css/applyStyles.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"static/font-awesome-4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("    \t<header id=\"header\">    \r\n");
      out.write("            <nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#martrunner-navbar-collapse\">\r\n");
      out.write("                    \t<span class=\"sr-only\"> Toggle Naviagtion </span>\r\n");
      out.write("                        <span class=\"icon-bar\"> </span>\r\n");
      out.write("                        <span class=\"icon-bar\"> </span>\r\n");
      out.write("                        <span class=\"icon-bar\"> </span>\r\n");
      out.write("                \t</button>\r\n");
      out.write("                    \r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\"> MartRunner <small> Good Market Event Assist System </small> </a>\r\n");
      out.write("                </div> <!-- end of navbar-header -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"martrunner-navbar-collapse\">\r\n");
      out.write("                \t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    \t<li> <a href=\"index.jsp\"> Home </a> </li>\r\n");
      out.write("                        <li> <a href=\"about.jsp\"> About </a> </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"dropdown\"> \r\n");
      out.write("                        \t<a href=\"standards.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Standards <b class=\"caret\"> </b> </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-left\" role=\"menu\">\r\n");
      out.write("                            \t<li> <a href=\"organicStandards.jsp\"> Organic Products </a> </li>\r\n");
      out.write("                                <li> <a href=\"farmStandards.jsp\"> Animal Based Farm Products </a> </li>\r\n");
      out.write("                                <li> <a href=\"foodStandards.jsp\"> Prepared Foods </a> </li>\r\n");
      out.write("                                <li> <a href=\"bodyStandards.jsp\"> Natural Body & Home </a> </li>\r\n");
      out.write("                                <li> <a href=\"artStandards.jsp\"> Art & Handicrafts  </a> </li>\r\n");
      out.write("                                <li> <a href=\"pkgStandards.jsp\"> Packaging  </a> </li>\r\n");
      out.write("                                <li> <a href=\"otherStandards.jsp\"> Other Standards </a> </li>\r\n");
      out.write("                        \t</ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"dropdown\"> \r\n");
      out.write("                        \t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Vendors <b class=\"caret\"> </b> </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-left\" role=\"menu\">\r\n");
      out.write("                            \t<li> <a href=\"#\"> Organic Products </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Animal Based Farm Products </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Prepared Foods </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Natural Body & Home </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Art & Handicarfts  </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Other </a> </li>\r\n");
      out.write("                        \t</ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"dropdown\"> \r\n");
      out.write("                        \t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-target=\"#\"> Products <b class=\"caret\"> </b> </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-left\" role=\"menu\">\r\n");
      out.write("                            \t<li> <a href=\"#\"> Organic Products </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Animal Based Farm Products </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Prepared Foods </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Natural Body & Home </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Art & Handicarfts  </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Other </a> </li>\r\n");
      out.write("                        \t</ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"dropdown\"> \r\n");
      out.write("                        \t<a href=\"visit.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-target=\"#\"> Visit <b class=\"caret\"> </b> </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-menu-left\" role=\"menu\">\r\n");
      out.write("                            \t<li> <a href=\"visitThursday.jsp\"> Thursday Good Market </a> </li>\r\n");
      out.write("                                <li> <a href=\"visitSaturday.jsp\"> Saturday Good Market </a> </li>\r\n");
      out.write("                                <li> <a href=\"#\"> Good Market Shop </a> </li>\r\n");
      out.write("                        \t</ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"active\"> <a href=\"apply.jsp\"> Apply </a> </li>\r\n");
      out.write("                        <li> <a href=\"contactUs.jsp\"> Contact Us </a> </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Sign In <b class=\"caret\"> </b> </a>\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-left\" style=\"padding: 15px; padding-bottom: 5px;\">\r\n");
      out.write("                                <form method=\"post\" action=\"login\" accept-charset=\"UTF-8\">\r\n");
      out.write("                                    <input style=\"margin-bottom: 15px\" type=\"text\" placeholder=\"Username\" id=\"username\" name=\"username\">\r\n");
      out.write("                                    <input style=\"margin-bottom: 15px\" type=\"password\" placeholder=\"Password\" id=\"password\" name=\"password\">\r\n");
      out.write("                                    <input style=\"background-color:#5B29C8;\" class=\"btn btn-primary btn-block\" type=\"submit\" id=\"sign-in\" value=\"Sign In\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li>\r\n");
      out.write("                        \t<form class=\"navbar-form\" role=\"search\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\" id=\"search-term\" name=\"search-term\">\r\n");
      out.write("                                        <div class=\"input-group-btn\">\r\n");
      out.write("                                            <button class=\"btn btn-default\" type=\"submit\"> <i class=\"glyphicon glyphicon-search\"> </i> </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form> <!-- end of navbar-form search -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul> <!-- end of navbar-nav list-->\r\n");
      out.write("                    \r\n");
      out.write("            \t</div> <!-- end of navbar-collapse -->\r\n");
      out.write("            </nav> <!-- end of navbar -->\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <section>\r\n");
      out.write("        <center><div class=\"subpagediv\">\r\n");
      out.write("        <p class=\"contenttext\"> \r\n");
      out.write("        <p class=\"contentheader\">Procedure </p>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <p class=\"content5\">The Good Market is Curated event.All vendors go through an application and review process to ensure they meet Good Market Standards.</p>\r\n");
      out.write("        \r\n");
      out.write("        <p class=\"content5\">\r\n");
      out.write("        \tThe Good Market Commitee meets every Saturday evening to review new Applications by email or online Applications shouldbe filled and submitted before 3PM on Friday.paper Applicationshould be submitted at the Good Market Information Stall before 3PM on Saturday feedback from the commitee is should by the following Monday. \r\n");
      out.write("        </p >\r\n");
      out.write("        <p class=\"content5\">The Committee prioritizes application that are at a higher level Good Market standards and have a clear social or environmental impact.please make sure you read the standards before completing an application form.including as much detailas possible on the application form makes the review process faster and easier.If you need help or have any question,contact Melani by e-mail or at 0770 208 642.\r\n");
      out.write("        \r\n");
      out.write("        </p>\r\n");
      out.write("        \r\n");
      out.write("        <p class=\"contentheader2\">Stall Reservation </p>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <p class=\"content6\">\r\n");
      out.write("        \tGood Market events are set up to be sustainable, but not profit-making.  Stall fees are kept as low as possible to reduce the entry barrier for rural producers, small enterprises, and new businesses that are socially and environmentally responsible.  Stall payments are used to cover canopy rental, set-up, and take-down, electrical wiring, entertainment, promotional materials, bookkeeping, common facilities, metered electricity and water, and transport and communication expenses. </p>\r\n");
      out.write("            \r\n");
      out.write("            <p class=\"content6\">Good Market approved vendors can reserve stalls by pre-paying for either 4 consecutive weeks or 12 consecutive weeks. A full stall is 10 feet by 20 feet.  A half stall is 5 feet by 20 feet.  Rates include stall electricity, but do not include table and chair rental.  There is no vehicle access during market hours.  A refundable Rs. 1,000 security deposit is required for each venue.  Pre-payments can be made by cash, check or bank deposit.   </p><br>\r\n");
      out.write("\t\t<div class=\"row\"> \r\n");
      out.write("        \t<div class=\"col-sm-6\">         \r\n");
      out.write("            <p class=\"content7\" id=\"thus\">Thursday Good Market </p>\r\n");
      out.write("            <p class=\"content7\">Venue:Diyatha Uyana market stall,Waters Edge,Battaramull</p>\r\n");
      out.write("            <p class=\"content7\">Open: 1PM to 9PM every ThursDay(Rain Or Shine)</p>\r\n");
      out.write("            <p class=\"content7\">Half Stall for 4 Thursday: Payment Due Rs 3,600(Rs. 900 per Thursday)</p>\r\n");
      out.write("            <p class=\"content7\">Full Stall for 4 Thursday:Payment Due Rs 7,200(Rs. 1,800 per Thursday)</p>\r\n");
      out.write("            <p class=\"content7\">Full Stall for 12 Thursday:Payment Due Rs 18,000(Rs. 1,500 per Thursday)</p>\r\n");
      out.write("            </div>\r\n");
      out.write("       <div class=\"col-sm-6\">\r\n");
      out.write("        <p class=\"content8\" id=\"satu\">Saturday Good Market </p>\r\n");
      out.write("            <p class=\"content8\">Venue:Nuga Tree car park,Colombo RaceCourse ,Colombo 7</p>\r\n");
      out.write("            <p class=\"content8\">Open: 10AM to 6PM every Saturday(Rain Or Shine)</p>\r\n");
      out.write("            <p class=\"content8\">Half Stall for 4 Saturday: Payment Due Rs 6,000(Rs. 1,500 per Saturday)</p>\r\n");
      out.write("            <p class=\"content8\">Full Stall for 4 Saturday:Payment Due Rs 11,200(Rs. 2,800 per Saturday)</p>\r\n");
      out.write("            <p class=\"content8\">Full Stall for 12 Saturday:Payment Due Rs 30,000(Rs. 2,500 per Saturday)</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("     \t<p class=\"contentheader3\">Application Form </p>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        \t<div class=\"col-sm-6\"> \r\n");
      out.write("        <h1 class=\"organic\">Organic Products</h1>\r\n");
      out.write("        \t<p class=\"content9\">If you have tea, spices, coconut, rice, legumes, vegetables, fruit, plants, other farm products, or other organic products, please use the form for Organic Products.   </p>\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("                <p> <a href=\"static/pdf/s_good_market_application_organic_products.pdf\"> <img src=\"static/images/download.jpg\" height=\"10\" width=\"10\"></a></p>\r\n");
      out.write("        \r\n");
      out.write("        <h1 class=\"organic\">Natural Food</h1>\r\n");
      out.write("        \t<p class=\"content9\">If you have packaged or ready-to-eat food and drink that is not made from 100% organic certified ingredients, please use the form for Natural Foods. </p>\r\n");
      out.write("            \r\n");
      out.write("                <p> <a href=\"static/pdf/s_good_market_application_natural_foods.pdf\"><img src=\"static/images/download.jpg\" height=\"10\" width=\"10\"></a></p>\r\n");
      out.write("            \r\n");
      out.write("         <h1 class=\"organic\">Natural Body & Home</h1>\r\n");
      out.write("         \t<p class=\"content9\">If you have personal care products or household cleaners, please use the form for Natural Body & Home. </p>\r\n");
      out.write("            \r\n");
      out.write("                <p> <a href=\"static/pdf/s_good_market_application_natural_body_and_home.pdf\"><img src=\"static/images/download.jpg\" height=\"10\" width=\"10\"></a></p>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("            <h1 class=\"organic\">Arts & HandyCrafts</h1>\r\n");
      out.write("            \t<p class=\"content9\">If you have artwork, clothing, accessories, housewares, or other handicrafts, please use the form for Arts & Handicrafts.</p>\r\n");
      out.write("                \r\n");
      out.write("                <p> <a href=\"static/pdf/s_good_market_application_arts_and_handicrafts.pdf\"><img src=\"static/images/download.jpg\" height=\"10\" width=\"10\"></a></p>\r\n");
      out.write("       \r\n");
      out.write("\t\t\t<h1 class=\"organic\">Travel</h1>\r\n");
      out.write("            \t<p class=\"content9\">If you provide tourism related services, please use the form for Travel.</p>\r\n");
      out.write("                \r\n");
      out.write("                <p> <a href=\"static/pdf/s_good_market_application_travel.pdf\"><img src=\"static/images/download.jpg\" height=\"10\" width=\"10\"></a></p>\r\n");
      out.write("                \r\n");
      out.write("            <h1 class=\"organic\">General</h1>\r\n");
      out.write("            \t<p class=\"content9\">If you have products or services that are good for environment, for communities, or for health, but do not fit in one of the above product categories, please use the General application form.</p>  \r\n");
      out.write("                \r\n");
      out.write("                <p> <a href=\"static/pdf/s_good_market_application_general.pdf\"><img src=\"static/images/download.jpg\" height=\"10\" width=\"10\"></a></p>\r\n");
      out.write("                \r\n");
      out.write("             </div>             \r\n");
      out.write("                \r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("        </center>\r\n");
      out.write("            \r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <footer id=\"footer\">\r\n");
      out.write("        \t<div class=\"container\" id=\"footer-top\">\r\n");
      out.write("            \t<div class=\"row\">\r\n");
      out.write("                \t<div class=\"col-sm-6\">\r\n");
      out.write("                    \t<ul id=\"footer-menu\">\r\n");
      out.write("                            <li> <a href=\"index.jsp\"> Home </a> </li>\r\n");
      out.write("                            <li> <a href=\"about.jsp\"> About </a> </li>\r\n");
      out.write("                            <li> <a href=\"standards.jsp\"> Standards </a> </li>\r\n");
      out.write("                            <li> <a href=\"#\"> Vendors </a> </li>\r\n");
      out.write("                            <li> <a href=\"#\"> Products </a> </li>\r\n");
      out.write("                            <li> <a href=\"visit.jsp\"> Visit </a> </li>\r\n");
      out.write("                            <li> <a href=\"apply.jsp\"> Apply </a> </li>\r\n");
      out.write("                            <li> <a href=\"contactUs.jsp\"> Contact Us</a> </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-sm-6\" id=\"subscribe\">                    \t\r\n");
      out.write("                    \t<form class=\"navbar-form\">\r\n");
      out.write("                        \t<div class=\"input-group\">\r\n");
      out.write("                            \t<input type=\"email\" class=\"form-control\" placeholder=\"Enter your email here\" id=\"email-subscribe\">\r\n");
      out.write("                                \t<div class=\"input-group-btn\">\r\n");
      out.write("                                    \t<button class=\"btn btn-default\" type=\"submit\" id=\"subscribe-btn\"> Subscribe </button>\r\n");
      out.write("                                \t</div>\r\n");
      out.write("                    \t\t</div>\r\n");
      out.write("                    \t</form> <!-- end of navbar-form search -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        \t<hr style=\"border:none; height:0.8px; color:#D1D1D1; background-color:#D1D1D1;\">  \r\n");
      out.write("            <div class=\"container\" id=\"footer-middle\">\r\n");
      out.write("            \t<div class=\"row\">\r\n");
      out.write("                \t<div class=\"col-sm-4\">\r\n");
      out.write("                    \t<h4> Address </h4>\r\n");
      out.write("                    \t<address> Lakpahana Grounds, <br> No.14, Reid Avenue, <br> Colombo - 07, <br> Sri Lanka </address>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \t<div class=\"col-sm-2\">\r\n");
      out.write("                    \t<ul>\r\n");
      out.write("                            <li> <h4> Telephone </h4> </li>\r\n");
      out.write("                            <li> +94 77 377 2122 </li>\r\n");
      out.write("                            <li> <h4> Email </h4> </li>\r\n");
      out.write("                            <li id=\"email-id\"> <a href=\"#\"> info@goodmarket.lk </a> </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div> \r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                    \t<ul class=\"social-icons\">\r\n");
      out.write("                        \t<li> <a href=\"#\"> <i class=\"fa fa-facebook-square\"> </i> </a> </li>\r\n");
      out.write("                            <li> <a href=\"#\"> <i class=\"fa fa-twitter-square\"> </i> </a> </li>\r\n");
      out.write("                            <li> <a href=\"#\"> <i class=\"fa fa-google-plus-square\"> </i> </a> </li>\r\n");
      out.write("                        </ul> \r\n");
      out.write("                    </div>                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <hr>\r\n");
      out.write("        \t<div class=\"container\" id=\"footer-bottom\">\r\n");
      out.write("            \t<div class=\"row\">\r\n");
      out.write("                \t<div class=\"col-sm-6\">\r\n");
      out.write("                    \tAll Copyrights Reserved by The Good Market Ltd - &copy; 2015\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6\" style=\"text-align:right;\">\r\n");
      out.write("                    \tWebsite Designed & Developed by UCSC\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery.js\"> </script>\r\n");
      out.write("        <script src=\"static/js/bootstrap.min.js\"> </script>\r\n");
      out.write("        <script src=\"static/js/main.js\"> </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
