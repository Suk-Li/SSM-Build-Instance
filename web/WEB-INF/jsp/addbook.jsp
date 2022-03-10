<%--
  Created by IntelliJ IDEA.
  User: Sukle
  Date: 2022/3/10
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加书籍</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12">
            <div class="page-header">
                <h1>
                    <small>书籍列表  ——  新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" required class="form-control" id="bookName" name="bookName" placeholder="书籍名称">
        </div>

        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="number" required class="form-control" id="bookCounts" name="bookCounts" placeholder="书籍数量">
        </div>

        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" required class="form-control" id="detail" name="detail" placeholder="书籍描述">
        </div>
        <input type="submit" class="btn btn-default" value="提交"/>
    </form>
</div>
</body>
</html>
