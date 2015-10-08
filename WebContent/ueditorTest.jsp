<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script charset="uft-8" src="ueditor/ueditor.config.js"></script>
<script charset="uft-8" src="ueditor/ueditor.all.js"></script>
<script charset="uft-8" src="ueditor/lang/zh-cn/zh-cn.js"></script>
<title>Insert title here</title>
</head>
<body>
 <form action="${pageContext.request.contextPath }/ueditorServlet" method="post">
  类别： <input type="text" name="category" /> <br /> 
  标题： <input type="text" name="title" /> <br />
  <textarea id="editor" style="width: 960px; height: 400px">
  这里写你的初始化内容
  </textarea>
  <script type="text/javascript">
			UE.getEditor("editor")
		</script>
  <input type="submit" value="提交">
 </form>
</body>
</html>