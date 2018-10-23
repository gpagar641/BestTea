<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Minimal an Admin Panel Category Flat Bootstrap Responsive
	Website Template | Validation :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel='stylesheet' type='text/css' />
<!--<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel='stylesheet' type='text/css' />-->
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel='stylesheet' type='text/css' />
<link
	href="${pageContext.request.contextPath}/resources/css/font-awesome.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"> </script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"> </script>

<!-- Mainly scripts -->
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.metisMenu.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.slimscroll.min.js"></script>
<!-- Custom and plugin javascript -->
<link href="${pageContext.request.contextPath}/resources/css/custom.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/screenfull.js"></script>
	
	<link href="${pageContext.request.contextPath}/resources/css/fSelect.css" rel="stylesheet">
 
<script src="${pageContext.request.contextPath}/resources/js/fSelect.js"></script>
<script>
(function($) {
    $(function() {
        $('.test').fSelect();
    });
})(jQuery);
</script>


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

<style type="text/css">
div.itemList {
	/*  background-color: lightblue; */
	height: 200px;
	width: 600px;
	overflow-y: scroll;
}
</style>

<style>
/* The container */
.container {
	display: block;
	position: relative;
	padding-left: 35px;
	margin-bottom: 12px;
	cursor: pointer;
	font-size: 15px;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

/* Hide the browser's default checkbox */
.container input {
	position: absolute;
	opacity: 0;
	cursor: pointer;
	height: 0;
	width: 0;
}

/* Create a custom checkbox */
.checkmark {
	position: absolute;
	top: 0;
	left: 0;
	height: 20px;
	width: 20px;
	background-color: #eee;
}

/* On mouse-over, add a grey background color */
.container:hover input ~ .checkmark {
	background-color: #ccc;
}

/* When the checkbox is checked, add a blue background */
.container input:checked ~ .checkmark {
	background-color: #2196F3;
}

/* Create the checkmark/indicator (hidden when not checked) */
.checkmark:after {
	content: "";
	position: absolute;
	display: none;
}

/* Show the checkmark when checked */
.container input:checked ~ .checkmark:after {
	display: block;
}

/* Style the checkmark/indicator */
.container .checkmark:after {
	left: 7px;
	top: 5px;
	width: 5px;
	height: 8px;
	border: solid white;
	border-width: 0 3px 3px 0;
	-webkit-transform: rotate(45deg);
	-ms-transform: rotate(45deg);
	transform: rotate(45deg);
}
</style>
</head>
<body>
	<div id="wrapper">
		<!----->
		<jsp:include page="../include/navbar.jsp" />


		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="content-main">

				<!--banner-->
				<div class="banner">
					<h2>
						<a href="${pageContext.request.contextPath}/resources/index.html">Home</a>
						<i class="fa fa-angle-right"></i> <span>Offers</span>
					</h2>
				</div>
				<!--//banner-->
				<!--grid-->
				<div class="validation-system">

					<div class="validation-form">
						<!---->

						<form>
						
						
						
						
						
							<div class="vali-form">
							<div class="col-md-6 form-group1">
								 
									 <select class="test" multiple="multiple">
        <optgroup label="Group A">
            <option value="1">Option 1</option>
            <option value="2" selected>Option 2</option>
            <option value="3">Option 3</option>
            <option value="4" disabled>Option 4</option>
            <option value="5">Option 5</option>
        </optgroup>
        <optgroup label="Group B">
            <option value="6" selected>Option 6</option>
            <option value="7">Option 7</option>
            <option value="8">Option 8</option>
        </optgroup>
    </select> 
									 
									 
								 
</div>

<div class="col-md-6 form-group1">
								 
									 
									  <select class="test" multiple="multiple">
        <optgroup label="Group A">
            <option value="1">Option 1</option>
            <option value="2" selected>Option 2</option>
            <option value="3">Option 3</option>
            <option value="4" disabled>Option 4</option>
            <option value="5">Option 5</option>
        </optgroup>
        <optgroup label="Group B">
            <option value="6" selected>Option 6</option>
            <option value="7">Option 7</option>
            <option value="8">Option 8</option>
        </optgroup>
    </select>
									 
								 
</div>
<div class="clearfix"></div>
							</div>

								  
							<div class="clearfix"></div>

							<div class="col-md-12 form-group">
								<button type="submit" class="btn btn-primary">Submit</button>
								<button type="reset" class="btn btn-default">Reset</button>
							</div>
							<div class="clearfix"></div>
						</form>

						<!---->
					</div>

				</div>
				<!--//grid-->
				<!---->
				<div class="copy">
					<p>
						&copy; 2016 Minimal. All Rights Reserved | Design by <a
							href="http://w3layouts.com/" target="_blank">W3layouts</a>
					</p>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>

	<!---->
	<!--scrolling js-->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
	<!--//scrolling js-->

	<script type="text/javascript">
	$(document).ready(function() {
        $("button").click(function(){
            var favorite = [];
            $.each($("input[name='sport']:checked"), function(){            
                favorite.push($(this).val());
            });
            alert("My favourite sports are: " + favorite.join(", "));
        });
    });
	$('.datepicker').datepicker();
	</script>
</body>
</html>