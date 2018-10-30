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
<title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Validation :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!--<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel='stylesheet' type='text/css' />--> 
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.css" rel="stylesheet"> 
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"> </script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"> </script>
  
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
        <!----->
        <jsp:include page="../include/navbar.jsp"/> 
        
        
        <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		   <div class="banner">
		    	<h2>
				<a href="${pageContext.request.contextPath}/resources/index.html">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Add Vendors</span>
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
              <label class="control-label">Name</label>
              <input type="text" placeholder="Itemname" required="">
            </div>
            <div class="col-md-6 form-group1 form-last">
              <label class="control-label">Description</label>
              <input type="text" placeholder="Description" required="">
            </div>
            <div class="clearfix"> </div>
            </div>
            <div class="vali-form">
            <div class="col-md-4 form-group1">
              <label class="control-label">Quantity</label>
              <input type="text" placeholder="Quantity" required="">
            </div>
            
            <div class="col-md-4 form-group2 form-last">
              <label class="control-label">Unit</label>
             <label class="control-label">Language</label>
            <select>
            	<option value="">Kgms</option>
            	<option value="">Liter</option>
            	<option value="">Pieces</option>
            	<option value="">Numbers(NOS)</option>
            </select>
            </div>
           
             
              <div class="col-md-4 form-group2 form-last">
              <label class="control-label">Tax</label>
            <select>
            	<option value="">0%(0%)</option>
            	<option value="">3%(3%)</option>
            	<option value="">5%(5%)</option>
            	<option value="">12%(12%)</option>
            	<option value="">18%(18%)</option>
            	<option value="">28%(28%)</option>
            </select>
            </div>
           <div class="clearfix"> </div>
           </div> 
           
            <div class="col-md-12 form-group1 ">
              <label class="control-label">HSN</label>
               <input type="text" placeholder="HSN Number" required="">
            </div>
             <div class="clearfix"> </div>
            <div class="vali-form">
            <div class="col-md-6 form-group1">
              <label class="control-label">Unit Price</label>
              <input type="text" placeholder="Unit Price" required="">
            </div>
            <div class="col-md-6 form-group2 form-last">
              <label class="control-label">Currency</label>
              <select disabled>
            	<option value="">INR</option>
            </select>
            </div>
            <div class="clearfix"> </div>
            </div>
            <div class="vali-form">
            <div class="col-md-6 form-group1">
              <label class="control-label">CESS %</label>
              <input type="text" placeholder="0" required="">
            </div>
            <div class="col-md-6 form-group1 form-last">
              <label class="control-label">+ CESS</label>
             <input type="text" placeholder="0" required="">
            </div>
            <div class="clearfix"> </div>
            </div>
            
             <div class="clearfix"> </div>
          
            <div class="col-md-12 form-group">
              <button type="submit" class="btn btn-primary">Submit</button>
              <button type="reset" class="btn btn-default">Reset</button>
            </div>
          <div class="clearfix"> </div>
        </form>
    
 	<!---->
 </div>

</div>
 	<!--//grid-->
		<!---->
<div class="copy">
            <p> &copy; 2016 Minimal. All Rights Reserved | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>	    </div>
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