/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-02 03:02:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <title>layui在线调试</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//res.layui.com/layui/dist/css/layui.css?t=1512984638033\" media=\"all\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body{margin: 10px;}\r\n");
      out.write("        .demo-carousel{height: 200px; line-height: 200px; text-align: center;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table class=\"layui-hide\" id=\"test\" lay-filter=\"demo\"></table>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/html\" id=\"barDemo\">\r\n");
      out.write("    <a class=\"layui-btn layui-btn-primary layui-btn-xs\" lay-event=\"detail\">查看</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-xs\" lay-event=\"edit\">编辑</a>\r\n");
      out.write("    <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"del\">删除</a>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-tab layui-tab-brief\" lay-filter=\"demo\">\r\n");
      out.write("    <ul class=\"layui-tab-title\">\r\n");
      out.write("        <li class=\"layui-this\">演示说明</li>\r\n");
      out.write("        <li>日期1</li>\r\n");
      out.write("        <li>分页2</li>\r\n");
      out.write("        <li>上传3</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"layui-tab-content\">\r\n");
      out.write("        <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"layui-carousel\" id=\"test1\">\r\n");
      out.write("                <div carousel-item>\r\n");
      out.write("                    <div><p class=\"layui-bg-green demo-carousel\">在这里，你将以最直观的形式体验 layui！</p></div>\r\n");
      out.write("                    <div><p class=\"layui-bg-red demo-carousel\">在编辑器中可以执行 layui 相关的一切代码</p></div>\r\n");
      out.write("                    <div><p class=\"layui-bg-blue demo-carousel\">你也可以点击左侧导航针对性地试验我们提供的示例</p></div>\r\n");
      out.write("                    <div><p class=\"layui-bg-orange demo-carousel\">如果最左侧的导航的高度超出了你的屏幕</p></div>\r\n");
      out.write("                    <div><p class=\"layui-bg-cyan demo-carousel\">你可以将鼠标移入导航区域，然后滑动鼠标滚轮即可</p></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-tab-item\">\r\n");
      out.write("            <div id=\"laydateDemo\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-tab-item\">\r\n");
      out.write("            <div id=\"pageDemo\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-tab-item\">\r\n");
      out.write("            <div class=\"layui-upload-drag\" id=\"uploadDemo\">\r\n");
      out.write("                <i class=\"layui-icon\"></i>\r\n");
      out.write("                <p>点击上传，或将文件拖拽到此处</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<blockquote class=\"layui-elem-quote layui-quote-nm\" id=\"footer\">layui {{ layui.v }} 提供强力驱动</blockquote>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//res.layui.com/layui/dist/layui.js?t=1512984638033\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.config({\r\n");
      out.write("        version: '1512984638033' //为了更新 js 缓存，可忽略\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function(){\r\n");
      out.write("        var laydate = layui.laydate //日期\r\n");
      out.write("            ,laypage = layui.laypage //分页\r\n");
      out.write("                layer = layui.layer //弹层\r\n");
      out.write("            ,table = layui.table //表格\r\n");
      out.write("            ,carousel = layui.carousel //轮播\r\n");
      out.write("            ,upload = layui.upload //上传\r\n");
      out.write("            ,element = layui.element; //元素操作\r\n");
      out.write("\r\n");
      out.write("        //向世界问个好\r\n");
      out.write("        layer.msg('Hello World');\r\n");
      out.write("\r\n");
      out.write("        //监听Tab切换\r\n");
      out.write("        element.on('tab(demo)', function(data){\r\n");
      out.write("            layer.msg('切换了：'+ this.innerHTML);\r\n");
      out.write("            console.log(data);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //执行一个 table 实例\r\n");
      out.write("        table.render({\r\n");
      out.write("            elem: '#test'\r\n");
      out.write("            ,height: 332\r\n");
      out.write("            ,url: '/demo/table/user/' //数据接口\r\n");
      out.write("            ,page: true //开启分页\r\n");
      out.write("            ,cols: [[ //表头\r\n");
      out.write("                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}\r\n");
      out.write("                ,{field: 'username', title: '用户名', width:80}\r\n");
      out.write("                ,{field: 'sex', title: '性别', width:80, sort: true}\r\n");
      out.write("                ,{field: 'city', title: '城市', width:80}\r\n");
      out.write("                ,{field: 'sign', title: '签名', width: 170}\r\n");
      out.write("                ,{field: 'experience', title: '积分', width: 80, sort: true}\r\n");
      out.write("                ,{field: 'score', title: '评分', width: 80, sort: true}\r\n");
      out.write("                ,{field: 'classify', title: '职业', width: 80}\r\n");
      out.write("                ,{field: 'wealth', title: '财富', width: 135, sort: true}\r\n");
      out.write("                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}\r\n");
      out.write("            ]]\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //监听工具条\r\n");
      out.write("        table.on('tool(demo)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter=\"对应的值\"\r\n");
      out.write("            var data = obj.data //获得当前行数据\r\n");
      out.write("                ,layEvent = obj.event; //获得 lay-event 对应的值\r\n");
      out.write("            if(layEvent === 'detail'){\r\n");
      out.write("                layer.msg('查看操作');\r\n");
      out.write("            } else if(layEvent === 'del'){\r\n");
      out.write("                layer.confirm('真的删除行么', function(index){\r\n");
      out.write("                    obj.del(); //删除对应行（tr）的DOM结构\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                    //向服务端发送删除指令\r\n");
      out.write("                });\r\n");
      out.write("            } else if(layEvent === 'edit'){\r\n");
      out.write("                layer.msg('编辑操作');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //执行一个轮播实例\r\n");
      out.write("        carousel.render({\r\n");
      out.write("            elem: '#test1'\r\n");
      out.write("            ,width: '100%' //设置容器宽度\r\n");
      out.write("            ,height: 200\r\n");
      out.write("            ,arrow: 'none' //不显示箭头\r\n");
      out.write("            ,anim: 'fade' //切换动画方式\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //将日期直接嵌套在指定容器中\r\n");
      out.write("        var dateIns = laydate.render({\r\n");
      out.write("            elem: '#laydateDemo'\r\n");
      out.write("            ,position: 'static'\r\n");
      out.write("            ,calendar: true //是否开启公历重要节日\r\n");
      out.write("            ,mark: { //标记重要日子\r\n");
      out.write("                '0-10-14': '生日'\r\n");
      out.write("                ,'2017-11-11': '剁手'\r\n");
      out.write("                ,'2017-11-30': ''\r\n");
      out.write("            }\r\n");
      out.write("            ,done: function(value, date, endDate){\r\n");
      out.write("                if(date.year == 2017 && date.month == 11 && date.date == 30){\r\n");
      out.write("                    dateIns.hint('一不小心就月底了呢');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            ,change: function(value, date, endDate){\r\n");
      out.write("                layer.msg(value)\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //分页\r\n");
      out.write("        laypage.render({\r\n");
      out.write("            elem: 'pageDemo' //分页容器的id\r\n");
      out.write("            ,count: 100 //总页数\r\n");
      out.write("            ,skin: '#1E9FFF' //自定义选中色值\r\n");
      out.write("            //,skip: true //开启跳页\r\n");
      out.write("            ,jump: function(obj, first){\r\n");
      out.write("                if(!first){\r\n");
      out.write("                    layer.msg('第'+ obj.curr +'页');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //上传\r\n");
      out.write("        upload.render({\r\n");
      out.write("            elem: '#uploadDemo'\r\n");
      out.write("            ,url: '' //上传接口\r\n");
      out.write("            ,done: function(res){\r\n");
      out.write("                console.log(res)\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
