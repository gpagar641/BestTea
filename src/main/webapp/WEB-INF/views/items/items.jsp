<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>	
<!DOCTYPE HTML>
<html>
<head>

<title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Validation :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

 
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' />
<%-- <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' /> --%>
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="stylesheet"> 
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"> </script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"> </script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel='stylesheet' type='text/css' />  
<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/resources/js/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.slimscroll.min.js"></script>
<!-- Custom and plugin javascript -->
<link href="${pageContext.request.contextPath}/resources/css/custom.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/screenfull.js"></script>
		<script>
		$(function () {
			$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

			if (!screenfull.enabled) {
				return false;
			}

			

			$('#toggle').click(function () {
				screenfull.toggle($('#container')[0]);
			});
			

			
		});
		</script>

<!----->

</head>
<body>
<div id="wrapper"> 

	<jsp:include page="../include/navbar.jsp"/> 
	
	 <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		   <div class="banner">
		    	<h2>
				<a href="${pageContext.request.contextPath}/resources/index.html">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Product</span>
				</h2>
		    </div>
		<!--//banner-->
 	<!--grid-->
 	 
 	<div class="validation-system">
 	<div class="right-button" style="float: right;">
  	   <a  href="${pageContext.request.contextPath}/resources/add_new_items.html"> <button type="button" class="btn btn-success warning_2">New</button></a>
  	    <button type="button" class="btn btn-default">Import</button>
  	    <button type="button" class="btn btn-default">Export</button>
        </div> 
 
 <h3 class="box-title">Items List</h3>
	<table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info" style="background: white">
						<thead>
							<tr role="row">
								<th class="sorting_asc" tabindex="0" aria-controls="example2"
									rowspan="1" colspan="1" aria-sort="ascending"
									aria-label="Rendering engine: activate to sort column descending">Name</th>
								<th class="sorting" tabindex="0" aria-controls="example2"
									rowspan="1" colspan="1"
									aria-label="Browser: activate to sort column ascending">Description</th>
								<th class="sorting" tabindex="0" aria-controls="example2"
									rowspan="1" colspan="1"
									aria-label="Platform(s): activate to sort column ascending">Type</th>
									<th class="sorting" tabindex="0" aria-controls="example2"
									rowspan="1" colspan="1"
									aria-label="Platform(s): activate to sort column ascending">Price</th>
								<th class="sorting" tabindex="0" aria-controls="example2"
									rowspan="1" colspan="1"
									aria-label="Engine version: activate to sort column ascending">Unit</th>
								<th class="sorting" tabindex="0" aria-controls="example2"
									rowspan="1" colspan="1"
									aria-label="CSS grade: activate to sort column ascending">Quantity</th>
							</tr>
						</thead>
						<tbody>
							<tr role="row" class="odd">
								<td class="sorting_1">Hot Tea</td>
								<td>This is hot tea help to reduce talap</td>
								<td>Liquid</td>
								<td>10</td>
								<td>Numbers(NOS)</td>
								<td>100</td>
							</tr>
							<tr role="row" class="odd">
								<td class="sorting_1">Hot Coffee</td>
								<td>This is hot Coffee help to reduce talap</td>
								<td>Liquid</td>
								<td>10</td>
								<td>Numbers(NOS)</td>
								<td>100</td>
							</tr>
							<tr role="row" class="odd">
								<td class="sorting_1">Hot Tea</td>
								<td>This is hot tea help to reduce talap</td>
								<td>Liquid</td>
								<td>10</td>
								<td>Numbers(NOS)</td>
								<td>100</td>
							</tr>
							<tr role="row" class="odd">
								<td class="sorting_1">Hot Coffee</td>
								<td>This is hot Coffee help to reduce talap</td>
								<td>Liquid</td>
								<td>10</td>
								<td>Numbers(NOS)</td>
								<td>100</td>
							</tr>
							<tr role="row" class="odd">
								<td class="sorting_1">Hot Tea</td>
								<td>This is hot tea help to reduce talap</td>
								<td>Liquid</td>
								<td>10</td>
								<td>Numbers(NOS)</td>
								<td>100</td>
							</tr>
							<tr role="row" class="odd">
								<td class="sorting_1">Hot Coffee</td>
								<td>This is hot Coffee help to reduce talap</td>
								<td>Liquid</td>
								<td>10</td>
								<td>Numbers(NOS)</td>
								<td>100</td>
							</tr>
							
						</tbody>
						<!-- <tfoot>
							<tr>
								<th rowspan="1" colspan="1">Rendering engine</th>
								<th rowspan="1" colspan="1">Browser</th>
								<th rowspan="1" colspan="1">Platform(s)</th>
								<th rowspan="1" colspan="1">Engine version</th>
								<th rowspan="1" colspan="1">CSS grade</th>
							</tr>
						</tfoot> -->
					</table>

</div>
 	<!--//grid-->
		<!---->
<div class="copy">
            <p> &copy; 2016 Minimal. All Rights Reserved | Design by <a href="${pageContext.request.contextPath}/resources/http://w3layouts.com/" target="_blank">W3layouts</a> </p>	    </div>
		</div>
		</div>
		<div class="clearfix"> </div>
       </div>
     
<!---->
<!--scrolling js-->
	<script src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
	<!--//scrolling js-->
</body>
</html>