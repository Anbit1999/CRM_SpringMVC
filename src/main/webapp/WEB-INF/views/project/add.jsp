<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Thêm mớ<i></i> loại sản phẩm
</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link href="datepicker/css/bootstrap.min.css" rel="stylesheet" />
<link href="datepicker/css/datepicker.css" rel="stylesheet" />
</head>

<script type="text/javascript">
	$('.datepicker').datepicker();
	$(document).off('.datepicker.data-api');
</script>
<body>
	<!-- BEGIN NAVBAR -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="javascript:void(0)">Logo</a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navb">
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
		<div class="row mt-4">
			<div class="col-5 m-auto">
				<h2 class="mb-4">Thêm công việc mới</h2>
				<p class="text-danger">${ message }</p>
				<form action="<%=request.getContextPath()%>/project/add"
					method="POST">
					<div class="form-group">
						<label>Tên công việc</label> <input type="text"
							class="form-control" name="name" />
					</div>
					<div class="form-group">
						<label>Ngày bắt đầu</label> <input type="date"
							class="form-control" name="startDate" />
					</div>
					<div class="form-group">
						<label>Ngày kết thúc</label> <input type="date"
							class="form-control" name="endDate" />
					</div>
					<button class="btn btn-primary">Lưu lại</button>
					<a href="<%=request.getContextPath()%>/project" class="btn btn-secondary">Quay lại</a>
				</form>
			</div>
		</div>
	</div>



	<script src="datepicker/js/jquery.min.js"></script>
	<script src="datepicker/js/bootstrap.min.js"></script>
	<script src="datepicker/js/bootstrap-datepicker.js"></script>
</body>
</html>