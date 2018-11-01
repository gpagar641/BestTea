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

</head>


<body>

	<c:url var="addItemToCustomerorderList"
		value="/addItemToCustomerorderList" />
		<c:url var="saveOrder"
		value="/saveOrder" />
		

	<!--header start-->

	<jsp:include page="../include/header.jsp" />


	<!--header end-->
	<!--sidebar start-->

	<jsp:include page="../include/navbar.jsp" />


	<!--sidebar end-->
	<!--main content start-->


	<section id="main-content"> <section class="wrapper">
	<div class="mail-w3agile">
		<!-- page start-->
		<div class="row">
			<div class="col-sm-3 com-w3ls">
				<section class="panel">
				<div class="panel-body">
					<!-- <a class="btn btn-compose">
                            Compose Mail
                        </a> -->
					<header class="panel-heading"> Tables </header>


					<div class="modal-body inssurance_buy">
						<div role="tabpanel">
							<!-- Nav tabs -->
							<ul class="nav nav-pills nav-tabs" role="tablist">
								<c:forEach var="customerTableDetails"
									items="${customerTableDetailsList}" varStatus="count">

									<c:choose>
										<c:when test="${count.index==0}">
											<li role="presentation" class="active"><a
												href="#table${customerTableDetails.tableId}"
												aria-controls="uploadTab" role="tab" data-toggle="tab">${customerTableDetails.tableName}</a></li>
										</c:when>
										<c:otherwise>
											<li role="presentation"><a
												href="#table${customerTableDetails.tableId}"
												aria-controls="uploadTab" role="tab" data-toggle="tab">${customerTableDetails.tableName}</a></li>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</ul>




						</div>


					</div>

					<!--  <li class="active"><ahref="mail.html"> <i class="fa fa-inbox"></i> Inbox  <span class="label label-danger pull-right inbox-notification">9</span></a></li>
                            <li><a href="#"> <i class="fa fa-envelope-o"></i> Send Mail</a></li>
                            <li><a href="#"> <i class="fa fa-certificate"></i> Important</a></li>
                            <li><a href="#"> <i class="fa fa-file-text-o"></i> Drafts <span class="label label-info pull-right inbox-notification">123</span></a></a></li>
                            <li><a href="#"> <i class="fa fa-trash-o"></i> Trash</a></li>
                        </ul> -->
				</div>
				</section>

				<section class="panel">
				<div class="panel-body">
					 
					 <img alt="" src="${pageContext.request.contextPath}/resources/images/abc.png" style="width: 261px;height: 396px;">

					<!-- <div class="inbox-body text-center inbox-action">
						<div class="btn-group">
							<a class="btn mini btn-default" href="javascript:;"> <i
								class="fa fa-power-off"></i>
							</a>
						</div>
						<div class="btn-group">
							<a class="btn mini btn-default" href="javascript:;"> <i
								class="fa fa-cog"></i>
							</a>
						</div>
					</div> -->
				</div>
				</section>
			</div>
			<div class="col-sm-9 mail-w3agile">
				<section class="panel">
				<div class="panel-body minimal">

					<!-- Tab panes -->
					<div class="tab-content">
						<c:set var="className" value="" />
						<c:forEach var="customerTableDetails"
							items="${customerTableDetailsList}" varStatus="count">

							<c:choose>
								<c:when test="${count.index==0}">
									<c:set var="className" value="active" />
								</c:when>
								<c:otherwise>
									<c:set var="className" value="" />
								</c:otherwise>
							</c:choose>
							<div role="tabpanel" class="tab-pane ${className}"
								id="table${customerTableDetails.tableId}">

								<div class="row">
									<div class="col-lg-12">
										<section class="panel"> <header
											class="panel-heading">
										${customerTableDetails.tableName} <span
											class="tools pull-right"> </span> </header>
										<div class="panel-body">
											<div class="form">
												<form class="cmxform form-horizontal " id="resetForm${customerTableDetails.tableId}"
													method="get" action="" novalidate="novalidate">


													<div class="form-group ">
														<label for="firstname" class="control-label col-lg-2">Select
															Item</label>
														<div class="col-lg-4">
															<select class="form-control test"
																id="itemId${customerTableDetails.tableId}"
																name="itemId${customerTableDetails.tableId}">
																<option value="" selected disabled="disabled">Select
																	Item</option>

																<c:forEach var="itemDetails" items="${itemDetailsList}">

																	<!-- <optgroup label="Group A"> -->
																	<option value="${itemDetails.itemId}">${itemDetails.itemName}</option>
																</c:forEach>
																<!-- </optgroup> -->

															</select>

														</div>
														<label for="firstname" class="control-label col-lg-1">Quantity</label>
														<div class="col-lg-3">
															<input class=" form-control num-only"
																id="itemQty${customerTableDetails.tableId}"
																name="itemQty${customerTableDetails.tableId}"
																type="text" placeholder="Item Name">

														</div>
														<div class="col-lg-1">
															<button class="btn btn-success" type="button"
																onclick="addItemToOrderList(${customerTableDetails.tableId})">Add</button>

														</div>
													</div>
													<!-- <div class="form-group ">
													<div class="col-lg-5"></div>
													<label for="firstname" class="control-label col-lg-2">OR</label>
													<div class="col-lg-5"></div>
												</div> -->
													<!-- <div class="form-group ">
													<label for="firstname" class="control-label col-lg-2">Select
														Offers</label>
													<div class="col-lg-4">
														<select class="form-control test">
															<optgroup label="Group A">
																<option value="1">Gange 1</option>
																<option value="2" selected>Savlya 2</option>
																<option value="3">Option 3</option>
																<option value="4" disabled>kumbhar 4</option>
																<option value="5">Option 5</option>
															</optgroup>
															<optgroup label="Group B">
																<option value="6" selected>Option 6</option>
																<option value="7">Option 7</option>
																<option value="8">Option 8</option>
															</optgroup>
														</select>

													</div>
													<label for="firstname" class="control-label col-lg-1">Quantity</label>
													<div class="col-lg-3">
														<input class=" form-control  num-only" id="itemName" name="itemName"
															type="text" placeholder="Item Name">

													</div>
													<div class="col-lg-1">
														<button class="btn btn-success" type="button">Add</button>

													</div>
												</div> -->
													<hr>




													<div class="table-responsive" style="border-radius: 12px;">
														<table class="table table-striped b-t b-light"
															id="orderTable${customerTableDetails.tableId}">
															<thead style="background: navy;">
																<tr>

																	<th style="color: aliceblue;">Sr. No</th>
																	<th style="color: aliceblue;">Item Name</th>
																	<th style="color: aliceblue;">Quantity</th>
																	<th style="color: aliceblue;">Rate</th>
																	<th style="color: aliceblue;">Total</th>
																	<th style="width: 30px; color: aliceblue;"></th>
																</tr>
															</thead>
															<tbody>

															</tbody>
															<tfoot style="background: aliceblue;">
																<tr>
																	<td colspan="2">Total :</td>

																	<td><strong><span id="qtyTotal${customerTableDetails.tableId}">00</span></strong></td>
																	<td></td>
																	<td><strong><span id="totalAmt${customerTableDetails.tableId}">0.00</span></strong></td>
																	
																	<td></td>
																</tr>
															</tfoot>
														</table>
														<input type="hidden" name="totAmount${customerTableDetails.tableId}" id="totAmount${customerTableDetails.tableId}">
													</div>
													<div style="border: 1px solid black; border-radius: 10px;">
														<div class="form-group " style="margin-top: 15px;">
															<label for="firstname" class="control-label col-lg-3">Discount
																(%) : </label>
															<div class="col-lg-2">
																<input class=" form-control"  
																	name="discount${customerTableDetails.tableId}" onkeyup="getDiscount(this,${customerTableDetails.tableId})" value="0" type="text" placeholder="Item Name" id="discount${customerTableDetails.tableId}" >

															</div>

															<label for="firstname" class="control-label col-lg-4">Total
																Amount (Rs.) : </label> <label for="totalAmount"
																class="control-label col-lg-2"><span id="payableAmt${customerTableDetails.tableId}">0.00</span></label>
																<input type="hidden" id="payableAmount${customerTableDetails.tableId}" name="payableAmount${customerTableDetails.tableId}">

														</div>	

														<div class="form-group ">
															<label for="firstname" class="control-label col-lg-3">Customer
																Name : </label>
															<div class="col-lg-3">
																<input class=" form-control" id="custName${customerTableDetails.tableId}"
																	name="custName${customerTableDetails.tableId}" type="text" placeholder="Item Name">

															</div>

															<label for="firstname" class="control-label col-lg-3">Customer
																Mobile : </label>
															<div class="col-lg-3">
																<input class=" form-control cust-mobile" id="custMobile${customerTableDetails.tableId}"
																	name="custMobile${customerTableDetails.tableId}" type="text" placeholder="Item Name">

															</div>


														</div>
														<div class="form-group ">

															<div class="col-lg-5"></div>
															<div class="col-lg-4">
																<button class="btn btn-success" type="button" onclick="saveOrder(${customerTableDetails.tableId})">Paid
																	Bill / Print</button>
																<!-- <button class="btn btn-default" type="button">Cancel</button> -->
															</div>
														</div>

													</div>
												</form>
											</div>
										</div>
										</section>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>

						</c:forEach>
						 
						 
						 
					</div>


				</div>
				</section>
			</div>
		</div>

		<!-- page end-->
	</div>
	</section> <!-- footer -->
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

	<script type="text/javascript">
	 
	 jQuery.fn.ForceNumericOnly =
		 function()
		 {
		     return this.each(function()
		     {
		         $(this).keydown(function(e)
		         {
		             var key = e.charCode || e.keyCode || 0;
		             // allow backspace, tab, delete, enter, arrows, numbers and keypad numbers ONLY
		             // home, end, period, and numpad decimal
		             return (
		                 key == 8 || 
		                 key == 9 ||
		                 key == 13 ||
		                 key == 46 ||
		                // key == 110 ||
		                // key == 190 ||
		                 (key >= 35 && key <= 40) ||
		                 (key >= 48 && key <= 57) ||
		                 (key >= 96 && key <= 105));
		         });
		     });
		 };
		 $(".num-only").ForceNumericOnly();
		 $(".cust-mobile").ForceNumericOnly();
	 </script>

	<script type="text/javascript">
	 function addItemToOrderList(tableId) {
		 
		 if($("#itemQty"+tableId).val()=="" || $("#itemQty"+tableId).val()==null)
			 alert("Please Enter Item Quantity");
		 else if($("#itemId"+tableId).val()=="" || $("#itemId"+tableId).val()==null)
			 alert("Select Item first");
		 else
		 $
			.getJSON(
					'${addItemToCustomerorderList}',
					{
						tableId : tableId,
						itemId : $("#itemId"+tableId).val(),
						itemQty : $("#itemQty"+tableId).val(),
						itemName : $("#itemId"+tableId+" :selected").text(),
						ajax : 'true'
					},
					function(data) {
						$('#orderTable'+tableId+' tbody tr').remove();
						var qtyTotal=0;
						var totalAmt=0;
						$.each(
								data,
									function(key, orderList) {
									 
									var tr = $('<tr></tr>');
									
							  		tr.append($('<td></td>').html(key+1));  
									tr.append($('<td></td>').html(orderList.itemName));
								
									tr.append($('<td></td>').html('<input disabled class=" form-control num-only" style="width: 50%" id="itemName" name="itemName" type="text" placeholder="Item Name" value='+orderList.quantity+'>'));
									qtyTotal=qtyTotal+orderList.quantity;
									tr.append($('<td></td>').html(orderList.itemPrice));
									tr.append($('<td></td>').html(orderList.totalAmount));
									totalAmt=totalAmt+orderList.totalAmount;
									tr.append($('<td></td>').html('<a onclick="deleteItemOrder('+key+','+tableId+')" href="#" ui-toggle-class=""><i class="fa fa-times text-danger text" style="font-size: 20px;"></i></a>'));
									
									
									$('#orderTable'+tableId+' tbody').append(tr);
								})	
								$("#totalAmt"+tableId).text(totalAmt);
								$("#qtyTotal"+tableId).text(qtyTotal);
								$("#totAmount"+tableId).val(totalAmt);
								$("#payableAmt"+tableId).text(totalAmt);
								$("#payableAmount"+tableId).val(totalAmt);
								
								
								
					});
		 
		 $("#itemQty"+tableId).val("");
	}
	 
	 
	function getDiscount(id,tableId){
		
		var totAmt=$("#totAmount"+tableId).val();
		totAmt=totAmt-(totAmt*$(id).val()/100);
		$("#payableAmt"+tableId).text(totAmt);
		$("#payableAmount"+tableId).val(totAmt);
		//alert(totAmt);
	}
	 </script>
<script type="text/javascript">
function saveOrder(tableId) {
	
	
	$
	.getJSON(
			'${saveOrder}',
			{
				tableId : tableId,
				payableAmount : $("#payableAmount"+tableId).val(),
				totAmt : $("#totAmount"+tableId).val(),
				discount : $("#discount"+tableId).val(),
				custMobile : $("#custMobile"+tableId).val(),
				custName : $("#custName"+tableId).val(),
				ajax : 'true'
			},
			function(data) {
				printBill();
				$('#orderTable'+tableId+' tbody tr').remove();
				$("#payableAmount"+tableId).val(0);
				$("#totAmount"+tableId).val(0);
				$("#totalAmt"+tableId).text(0);
				$("#qtyTotal"+tableId).text(0);
				$("#payableAmt"+tableId).text(0);
				document.getElementById("resetForm"+tableId).reset();
			 });  
}
</script>


<script type="text/javascript">
function printBill() {
	window.open("${pageContext.request.contextPath}/printBill",'_blank');
	 
}
</script>

</body>
</html>




