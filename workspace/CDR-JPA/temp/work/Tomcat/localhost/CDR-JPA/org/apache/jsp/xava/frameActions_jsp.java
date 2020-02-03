/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2020-02-03 00:54:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frameActions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

String frameId=request.getParameter("frameId");
boolean closed="true".equals(request.getParameter("closed"));
String frameContentId=frameId + "content";
String frameShowId=frameId + "show";
String frameHideId=frameId + "hide";
String hideStyle=closed?"style='display: none'":"";
String showStyle=closed?"":"style='display: none'";

String minimizeImage = null;
if (style.getMinimizeImage() != null) minimizeImage=!style.getMinimizeImage().startsWith("/")?request.getContextPath() + "/" + style.getMinimizeImage():style.getMinimizeImage();
String restoreImage = null;
if (style.getRestoreImage() != null) restoreImage=!style.getRestoreImage().startsWith("/")?request.getContextPath() + "/" + style.getRestoreImage():style.getRestoreImage();

      out.write(" \t\t\n");
      out.write("\n");
      out.write("<span id=\"");
      out.print(frameHideId);
      out.write('"');
      out.write(' ');
      out.print(hideStyle);
      out.write(">\n");
      out.write("\t<a href=\"javascript:openxava.hideFrame('");
      out.print(frameId);
      out.write("')\">\n");
      out.write("\t\t");
 if (minimizeImage == null) { 
      out.write("\n");
      out.write("\t\t<i class=\"mdi mdi-menu-down\"></i>\n");
      out.write("\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t<img src=\"");
      out.print(minimizeImage);
      out.write("\" border=0 align=\"absmiddle\"/>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("\t</a>\n");
      out.write("</span> \n");
      out.write("<span id=\"");
      out.print(frameShowId);
      out.write('"');
      out.write(' ');
      out.print(showStyle);
      out.write(">\n");
      out.write("\t<a href=\"javascript:openxava.showFrame('");
      out.print(frameId);
      out.write("')\">\n");
      out.write("\t\t");
 if (restoreImage == null) { 
      out.write("\n");
      out.write("\t\t<i class=\"mdi mdi-menu-right\"></i>\n");
      out.write("\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t<img src=\"");
      out.print(restoreImage);
      out.write("\" border=0 align=\"absmiddle\"/>\n");
      out.write("\t\t");
 } 
      out.write("\n");
      out.write("\t</a>\n");
      out.write("</span>\n");
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
