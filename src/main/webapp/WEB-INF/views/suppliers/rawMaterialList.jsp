<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- bootstrap-css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel='stylesheet' type='text/css' />
<link
	href="${pageContext.request.contextPath}/resources/css/style-responsive.css"
	rel="stylesheet" />
<!-- font CSS -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font.css"
	type="text/css" />
<link
	href="${pageContext.request.contextPath}/resources/css/font-awesome.css"
	rel="stylesheet">
<!-- //font-awesome icons -->
<script
	src="${pageContext.request.contextPath}/resources/js/jquery2.0.3.min.js"></script>

<link
	href="${pageContext.request.contextPath}/resources/css/fSelect.css"
	rel="stylesheet">

<script src="${pageContext.request.contextPath}/resources/js/fSelect.js"></script>
<script>
	(function($) {
		$(function() {
			$('.test').fSelect();
		});
	})(jQuery);
</script>


<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

</head>


<body>


	<!--header start-->

	<jsp:include page="../include/header.jsp" />


	<!--header end-->
	<!--sidebar start-->

	<jsp:include page="../include/navbar.jsp" />


	<!--sidebar end-->
	<!--main content start-->
<section id="main-content">
	<section class="wrapper">
		<div class="table-agile-info">
 <div class="panel panel-default">
    <div class="panel-heading">
     Raw Material Details
     <input type="text" id="tableSearch" class="form-control search" placeholder=" Search" style="
    float: right;
    margin-top: 10px;
">
    </div>
    <div>
      <table id="itemTable" class="table" ui-jq="footable" ui-options='{
        "paging": {
          "enabled": true
        },
        "filtering": {
          "enabled": true
        },
        "sorting": {
          "enabled": true
        }}'>
        <thead>
          <tr>
            <th data-breakpoints="xs">Sr. No</th>
            <th>Raw Material Name</th>
            <th>Unit</th>
              <th>Material Description</th>
            
           
             <th>Action</th> 
          </tr>
        </thead>
        <tbody>
           
           <c:forEach var="getRawMateialDetailsWithUnit" items="${getRawMateialDetailsWithUnitList}" varStatus="count">
           
            <tr>
            <td>${count.index+1}</td>
            <td>${getRawMateialDetailsWithUnit.materialName}</td>
            <td>${getRawMateialDetailsWithUnit.unitName}</td>
            <td>${getRawMateialDetailsWithUnit.materialDesc}</td>
            
            <td><a href="#"><span class="glyphicon glyphicon-align-justify" aria-hidden="true"></span></a>
            <a href="#"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>  
          </tr>
          
           </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>
</section>
 <!-- footer -->
	<!-- <div class="footer">
		<div class="wthree-copyright">
			<p>
				© 2017 Visitors. All rights reserved | Design by <a
					href="http://w3layouts.com">W3layouts</a>
			</p>
		</div>
	</div> -->
	<!-- / footer --> <!--main content end--> </section>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.dcjqaccordion.2.7.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.slimscroll.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
	<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.scrollTo.js"></script>
		
	  
	 <script>
$(document).ready(function(){
  $("#tableSearch").on("keyup", function() {
	 
    var value = $(this).val().toLowerCase();
    $("#itemTable tbody tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>

</body>
</html>
