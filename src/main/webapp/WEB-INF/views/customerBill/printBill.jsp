<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sale Bill</title>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>
    </title>
   <!--  <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.12.0/semantic.min.css" /> -->
  </head>
  <body>
    <!-- code goes here -->

    <!-- scripts -->
<%--     <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js">
    </script>
    <script type="text/javascript" src="//cdn.rawgit.com/MrRio/jsPDF/master/dist/jspdf.min.js">
    </script>
    <script type="text/javascript" src="//cdn.rawgit.com/niklasvh/html2canvas/0.5.0-alpha2/dist/html2canvas.min.js">
    </script>
    
<script type="text/javascript" src="<c:url value='/resources/js/app.js'/>"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.min.js"></script> --%>


<script type="text/javascript">
window.print();

/* 
document.body.onload = function()
{
	
	window.print();
	 
} */
</script> 


</head>
<body >
	<div class="ui page grid">
		<div class="wide column">
			<div class="ui segment">
				<%--   <div class="ui button aligned center teal" id="create_pdf">${saleBillHeader.saleBillId}</div>   --%>
				<div class="ui divider"></div>
				<form class="ui form">
				  <table width="250" border="0" cellspacing="0" cellpadding="0" style="padding:5px; font-family:verdana; font-size:12px; border:1px solid #E7E7E7;">
  <tbody>
   
    <%-- <tr>
      <td colspan="2" align="center" style="padding:5px; border-bottom:1px solid #E7E7E7;"><img src="${pageContext.request.contextPath}/resources/img/monginislogo.jpg" alt="logo"></td>
    </tr> --%>
    <tr>
      <td colspan="2" align="center" style="padding:0px; border-bottom:1px solid #E7E7E7; font-size:12px; font-weight:bold; "><p>ORDER MEMO</p></td>
    </tr>
    <tr>
      <td colspan="2">
      <table width="100%" border="0" cellspacing="0" cellpadding="7">
  <tbody>
    <tr>
      <td width="20%" align="left"><strong>Shop:</strong></td>
      <td width="80%" align="left">Aapla Chaha </td>
      <td width="0%" ><strong></td>
    </tr>
    <tr>
      <td><strong>Tel:</strong></td>
      <td>9989898999</td>
      <td><strong></td>
      </tr>
      <tr>
      <td><strong>Date:</strong></td>
      <td>${date} </td>
      <td><strong></td>
    </tr>
     <tr>
      <td ><strong>Bill No:</strong></td>
      <td >${saleBillHeader.saleBillId}</td>
      <td ><strong></td>
    </tr>  
    <tr>
      <td colspan="3"><table width="100%" border="0" cellspacing="0" cellpadding="5" class="tbl-inner">
        <tbody style="padding:0px">
          <tr>
            <th align="left" bgcolor="#ECECEC">Name</th>
            <th bgcolor="#ECECEC">Qty</th>
            <th bgcolor="#ECECEC">Rate</th>
            <th align="center" bgcolor="#ECECEC">Amt</th>
          </tr>
          <c:forEach var="saleBillDetails"
							items="${saleBillHeader.saleBillDetailsList}" varStatus="count">
          <tr>
            <td><p style="font-size:12px">${saleBillDetails.itemName}</p></td>
            <td align="center"><p style="font-size:12px">${saleBillDetails.quantity}</p></td>
            <td align="center"><p style="font-size:12px">${saleBillDetails.itemPrice}</p></td>
            <td align="right"><p style="font-size:12px">${saleBillDetails.totalAmount}</p></td>
          </tr>
           </c:forEach>
          <tr>
            <td rowspan="3">&nbsp;</td>
            <td colspan="2" align="right"><strong>Discount % :</strong></td>
            <td align="right"><strong>${saleBillHeader.discount}</strong></td>
          </tr>
             <tr>
            <td rowspan="3">&nbsp;</td>
            <td colspan="2" align="right"><strong>Total :</strong></td>
            <td align="right"><strong>${saleBillHeader.payableAmount}</strong></td>
          </tr>
           
           
        </tbody>
      </table></td>
      </tr>
  </tbody>
</table>


      </td>
    </tr>
    <tr>
      <td colspan="2">
        <table width="100%" border="0" cellspacing="0" cellpadding="7" >
  
    <tr>
      <td width="200" style="border-top:1px solid #E7E7E7; padding:5px 7px;"><strong>Delivery Date : </strong> Cash</td>
      
    </tr>
  
  
</table>

      </td>
    </tr>
    <tr>
      <td width="200" style="border-top:1px solid #E7E7E7; padding:5px 7px;"><strong>Customer Name : </strong>${saleBillHeader.customerName}</td>
      
    </tr>
    <tr>
      <td width="200" style="border-top:1px solid #E7E7E7; padding:5px 7px;"><strong>Customer Phno : </strong>${saleBillHeader.custMobileNo}</td>
    </tr>
    <tr>
      <td colspan="2" style="border-top:1px solid #E7E7E7; padding:5px 7px;">
      <!-- <p style="font-size:13px; text-align: justify;">While we shall  our control.</p> -->
    <p style="font-size:13px; text-align: center;;"><strong>Thank You...</strong></p>
   </td>
    </tr> 
     
  </tbody>
</table>
				</form>
			</div>
		</div>
	</div>
	<!-- scripts -->
	<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script type="text/javascript" src="//cdn.rawgit.com/niklasvh/html2canvas/0.5.0-alpha2/dist/html2canvas.min.js"></script>
	<script type="text/javascript" src="//cdn.rawgit.com/MrRio/jsPDF/master/dist/jspdf.min.js"></script>
	<script type="text/javascript" src="app.js"></script> -->
</body>
<body onload="cl()">
<script type="text/javascript">
function cl(){
	
	window.close();
	
	}
</script>

</body>
</html>