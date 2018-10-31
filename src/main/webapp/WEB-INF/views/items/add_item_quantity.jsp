<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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

<section id="container">
<!--header start-->

<jsp:include page="../include/header.jsp" />


<!--header end-->
<!--sidebar start-->
 
 <jsp:include page="../include/navbar.jsp" />
 
 
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
		<div class="form-w3layouts">
            <!-- page start-->
             
             
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Add Item Price
                            <span class="tools pull-right">
                                <a class="fa fa-chevron-down" href="javascript:;"></a>
                               <!--  <a class="fa fa-cog" href="javascript:;"></a>
                                <a class="fa fa-times" href="javascript:;"></a> -->
                             </span>
                        </header>
                        <div class="panel-body">
                            <div class="form">
                                <form class="cmxform form-horizontal " action="addItemPrice" id="signupForm" method="get" novalidate="novalidate">
                                  
                            
                            <div class="form-group ">
                                        <label for="firstname" class="control-label col-lg-3">Select Item</label>
                                        <div class="col-lg-6">
                                            <select class="form-control m-bot15" id="itemId" name="itemId">
                                <c:forEach var="itemDetailsList" items="${itemDetailsList}">
                                <option value="${itemDetailsList.itemId}">${itemDetailsList.itemName}</option>
                                </c:forEach>
                            </select>
                                        </div>
                                    </div>
                                       
                                    <div class="form-group ">
                                        <label for="firstname" class="control-label col-lg-3">Item Quantity</label>
                                        <div class="col-lg-6">
                                            <input class=" form-control" id="itemQuantity" name="itemQuantity" type="number" placeholder="Item Name"> 
                                           
                                        </div>
                                    </div>
                                    
                                     <%-- <div class="form-group ">
                                        <label for="firstname" class="control-label col-lg-3">Select of Unit Measure</label>
                                        <div class="col-lg-6">
                                            <select class="form-control m-bot15" id="uom" name="uom">
                               <c:forEach var="unitDetailsList" items="${unitDetailsList}">
                                <option value="${unitDetailsList.unitId}">${unitDetailsList.unitName}</option>
                                </c:forEach>
                            </select>
                                        </div>
                                    </div> --%>
                                    
                                    <div class="form-group ">
                                        <label for="lastname" class="control-label col-lg-3">Description</label>
                                        <div class="col-lg-6">
                                            <textarea rows="2" class=" " id="itemQuantityDesc" name="itemQuantityDesc" form-control" placeholder="Item Description"></textarea>
                                            
                                        </div>
                                    </div>
                                     
                                    <div class="form-group">
                                        <div class="col-lg-offset-3 col-lg-6">
                                            <button class="btn btn-primary" type="submit">Save</button>
                                            <button class="btn btn-default" type="button">Cancel</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
            <!-- page end-->
        </div>
</section>
 
</section>

<!--main content end-->
</section>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.slimscroll.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="${pageContext.request.contextPath}/resources/js/jquery.scrollTo.js"></script>
</body>
</html>