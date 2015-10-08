package com.martian.ueditor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 * ★☆ @author： liangyanjun <br>
 * ★☆ @time：2015年10月8日上午9:31:02 <br>
 * ★☆ @version： <br>
 * ★☆ @lastMotifyTime： <br>
 * ★☆ @ClassAnnotation： <br>
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 * ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★<br>
 */
public class UeditorServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // System.out.println("category:"+category);
      // System.out.println("title"+title);
      // System.out.println("content"+content);
      // String Date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      // String realPath = ServletActionContext.getRequest().getRealPath("/upload")+"/"+Date;
      // System.out.println("路径"+realPath);

      req.setCharacterEncoding("utf-8");
      String category = req.getParameter("category");
      String title = req.getParameter("title");
      String content = req.getParameter("editorValue");
      System.out.println("category:" + category);
      System.out.println("title:" + title);
      System.out.println("content:" + content);
      req.setAttribute("category", category);
      req.setAttribute("title", title);
      req.setAttribute("content", content);
      req.getRequestDispatcher("show.jsp").forward(req, resp);
   }

}
