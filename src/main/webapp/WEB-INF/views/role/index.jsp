<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
    <title>Danh sách loại sản phẩm</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
    <!-- BEGIN NAVBAR -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="javascript:void(0)">Logo</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navb">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navb">
            <ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/project">Công việc</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/role">Quyền</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/status">Trạng thái</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/user">Người dùng</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/task">Đầu việc</a></li>
				<li class="nav-item"><a class="nav-link disabled"
					href="javascript:void(0)">Disabled</a></li>
			</ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                <button class="btn btn-success my-2 my-sm-0" type="button">Search</button>
            </form>
        </div>
    </nav>
    <!-- END NAVBAR -->
    <div class="container">
        <div class="row">
            <div class="col-12 mt-4">
                <div class="row">
                    <div class="col-8">
                        <h2>Danh sách công việc</h2>
                    </div>
                    <div class="col-4 d-flex align-items-center justify-content-end">
                        <a href="<%= request.getContextPath() %>/role/add" class="btn btn-primary">Thêm mới</a>
                    </div>
                </div>
                <table class="table table-bordered mt-3">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Tên</th>
                            <th>Mô tả</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach items="${ listRole }" var="role">
	                    	<tr>
	                            <td>${ role.id }</td>
	                            <td>${ role.name }</td>
	                            <td>${ role.description }</td>
	                            <td class="w-25">
	                                <a href='<c:url value="/role/edit?id=${ role.id }" />' class="btn btn-sm btn-info">Sửa</a>
	                                <a href="<c:url value="/role/delete?id=${ role.id }" />" class="btn btn-sm btn-danger">Xóa</a>
	                            </td>
	                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</body>

</html>