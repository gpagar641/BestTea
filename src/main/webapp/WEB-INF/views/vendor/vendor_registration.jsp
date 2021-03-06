<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<head>
<title>Aapla Chaha</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath}/resources/css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font.css" type="text/css"/>
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="${pageContext.request.contextPath}/resources/js/jquery2.0.3.min.js"></script>
</head>
<body>
<div class="reg-w3">
<div class="w3layouts-main">
	<h2>Register Now</h2>
		<form action="${pageContext.request.contextPath}/vendorRegistrationProcess" enctype="multipart/form-data" method="post">
			<input type="text" class="ggg" name="name" placeholder="NAME" required="required">
			<input type="email" class="ggg" name="email" placeholder="E-MAIL" required="required">
			<input type="text" class="ggg" name="phone" placeholder="PHONE" required="required">
			<input type="password" class="ggg" name="password" placeholder="PASSWORD" id="password" required="required">
			<!-- <input type="password" class="ggg" name="ConfirmPassword" placeholder="CONFIRM PASSWORD" id="confirm_password" required=""> -->
			<p id='message' class="errormsg"></p>
		  <textarea rows="2" class="ggg" id="address" name="address" form-control" placeholder="ADDRESS" style="background: none; margin: 14px 0px; width: 100%;
    border: 1px solid #fff;" required="required" ></textarea>
    		<input type="text" class="ggg" name="nickname" placeholder="NICK NAME" required="required">
            <label for="exampleInputFile"  style="color:#fff ; margin: 14px 0px;">Upload Driving License</label>
            <input type="file" id="drivingLicense" name="drivingLicense" style="background: none; margin: 14px 0px; width: 100%;
    border: 1px solid #fff;" required="required">                                
                                       
			
			<h4><input type="checkbox" />I agree to the Terms of Service and Privacy Policy</h4>
			
				<div class="clearfix"></div>
				<input type="submit" value="submit" name="register">
		</form>
		<p>Already Registered.<a href="${pageContext.request.contextPath}/showLoginPage">Login</a></p>
</div>
</div>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.slimscroll.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="${pageContext.request.contextPath}/resources/js/jquery.scrollTo.js"></script>


</body>
</html>
