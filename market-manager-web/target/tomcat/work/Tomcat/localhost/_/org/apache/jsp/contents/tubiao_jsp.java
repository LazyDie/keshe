/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-02 06:58:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.contents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tubiao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <title>大型批发市场管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("    <script src=\"../jquery/jquery.min.js\"></script>\r\n");
      out.write("    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css\"\r\n");
      out.write("          integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../bootstrap/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css\"\r\n");
      out.write("          integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("    <script src=\"../bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js\"\r\n");
      out.write("            integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../layui/css/layui.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body{margin: 10px;}\r\n");
      out.write("        .demo-carousel{height: 200px; line-height: 200px; text-align: center;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"../layui/layui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-tab layui-tab-brief\" lay-filter=\"demo\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"layui-nav\" lay-filter=\"\">\r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">最新活动</a></li>\r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">产品</a></li>\r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">大数据</a></li>\r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("            <a href=\"javascript:;\">解决方案</a>\r\n");
      out.write("            <dl class=\"layui-nav-child\"> <!-- 二级菜单 -->\r\n");
      out.write("                <dd><a href=\"\">移动模块</a></dd>\r\n");
      out.write("                <dd><a href=\"\">后台模版</a></dd>\r\n");
      out.write("                <dd><a href=\"\">电商平台</a></dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">社区</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Brand</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">Link <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("                <li><a href=\"#\">Link</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-left\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><a href=\"#\">Link</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                        <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div><!-- /.navbar-collapse -->\r\n");
      out.write("    </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-row layui-col-space5\">\r\n");
      out.write("    <div class=\"layui-col-md5\">\r\n");
      out.write("        <div class=\"layui-row grid-demo\">\r\n");
      out.write("            <div class=\"layui-col-md3\">\r\n");
      out.write("                内部列\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-col-md9\">\r\n");
      out.write("                内部列\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-col-md12\">\r\n");
      out.write("                内部列\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        layui.config({\r\n");
      out.write("            dir: '../layui/' //layui.js 所在路径（注意，如果是script单独引入layui.js，无需设定该参数。），一般情况下可以无视\r\n");
      out.write("            ,version: false //一般用于更新模块缓存，默认不开启。设为true即让浏览器不缓存。也可以设为一个固定的值，如：201610\r\n");
      out.write("            ,debug: false //用于开启调试模式，默认false，如果设为true，则JS模块的节点会保留在页面\r\n");
      out.write("            ,base: '' //设定扩展的Layui模块的所在目录，一般用于外部模块扩展\r\n");
      out.write("        });\r\n");
      out.write("        //我们强烈推荐你在代码最外层把需要用到的模块先加载\r\n");
      out.write("        layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function(){\r\n");
      out.write("            var laydate = layui.laydate //日期\r\n");
      out.write("                ,laypage = layui.laypage //分页\r\n");
      out.write("            layer = layui.layer //弹层\r\n");
      out.write("                ,table = layui.table //表格\r\n");
      out.write("                ,carousel = layui.carousel //轮播\r\n");
      out.write("                ,upload = layui.upload //上传\r\n");
      out.write("                ,element = layui.element; //元素操作\r\n");
      out.write("\r\n");
      out.write("            //向世界问个好\r\n");
      out.write("            layer.msg('Hello World');\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}