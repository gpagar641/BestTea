<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a href="index.html">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Material</span>
                    </a>
                    <ul class="sub">
						<li><a href="${pageContext.request.contextPath}/insertRawMaterial">Add Material</a></li>
						<li><a href="${pageContext.request.contextPath}/insertSupplier">Add Suppliers</a></li>
                        <li><a href="${pageContext.request.contextPath}/showRawMaterialList">Material Details</a></li>
                        <li><a href="${pageContext.request.contextPath}/showSupplierList">Supplier Details</a></li>
                    </ul>
                </li>
                
                  <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Items</span>
                    </a>
                    <ul class="sub">
						<li><a href="${pageContext.request.contextPath}/showItems">Item Details</a></li>
                    	<li><a href="${pageContext.request.contextPath}/getUnits">Unit Details</a></li>
						<li><a href="${pageContext.request.contextPath}/showAddItems">Add Item</a></li>
						<li><a href="${pageContext.request.contextPath}/insertUnit">Add Unit</a></li>
                    </ul>
                </li>
               
              
              
                <li class="sub-menu">
                    <a class="active" href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span>Vendors</span>
                    </a>
                    <ul class="sub">
                        <li><a href="form_component.html">Vendor Details</a></li>
                        <li><a class="active" href="form_validation.html">Add Vendor</a></li>
						
                    </ul>
                </li>
              <!--   <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-envelope"></i>
                        <span>Mail </span>
                    </a>
                    <ul class="sub">
                        <li><a href="mail.html">Inbox</a></li>
                        <li><a href="mail_compose.html">Compose Mail</a></li>
                    </ul>
                </li> -->
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>Bill</span>
                    </a>
                    <ul class="sub">
                        <li><a href="chartjs.html">Make Bill</a></li>
                        
                    </ul>
                </li>
               
               <!--  <li>
                    <a href="login.html">
                        <i class="fa fa-user"></i>
                        <span>Login Page</span>
                    </a>
                </li> -->
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>