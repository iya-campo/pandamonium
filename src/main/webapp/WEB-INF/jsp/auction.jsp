<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />


<div class="container">
	<div class="content">
		<div class="col-md-6 details-section">
			<div class="col-md-12 item-pic">
				<div class="pic"></div>
			</div>
			<div class="col-md-12 item-details" style="overflow:auto;">
				<div class="col-md-6 item-desc">
					<h3 class="clicked-food">Food Name</h3>
					<div class="sub-desc">
						<img src="img/auction/user-solid.png" style="height:100%;float:left;" />
						<h6 style="float:left;">Auctioneer</h6>
						<div class="base-price"></div>
					</div>
					<div class="desc">
						<p>Lemon drops gingerbread icing cupcake macaroon chocolate
							cake powder. Lollipop candy canes wafer caramels pudding danish
							souffl.
							<br>
							
						</p>
					</div>

				</div>
				<div class="col-md-6 item-bids">
					<div class="col-md-12 refresh-icon">
						<img src="img/auction/curved-arrows.png"/>
						</div>
					<div class="col-md-12 current-price">
						Current Price:
						<br>
						<p>$ xxx.xx</p>
					</div>
					<div class="col-md-12 item-bid-details">
						Base Price: $ xxx.xx
						<br>
						Min. Increase: $ xxx.xx
					</div>
					<div class="col-md-12 add-bid">
						<div class="col-md-12 bid-text">Enter Bid:</div>
						<div class="col-md-12 bid-bar">
							<input  type="text" name="input-bid" class="form-control" placeholder="Place a bid" style="float:left;">
							<button class="btn bid-button" style="float:left;">x</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6 items-section">
			<div class="navbar">
				<ul class="list-inline">
					<li id="link1"><a href="auction">Auction</a></li>
					<li id="link2"><a href="#">Profile</a></li>
				</ul>
			</div>
			<div class="col-md-12 items-list-title">Auctioned Items</div>
			<div class="col-md-12 items-list">
				<div class="card-deck filtr-container">
					<c:forEach items="${foodList}" var="food">
						<div class="card col-md-4 food-button" onclick="getFoodData(${food.FOOD_ID})">
							<div class="item-prev" id="item-prev" style="background-image:url('${food.IMG_PATH}');width:100%;background-size:cover;">
							<div class="hidden opaq" id="opaq" style="position:absolute;height:100%;width:100%;background-color:#000;opacity:0.3;"></div>
							<div class="hidden item-name"><p>${food.FOOD_NAME}</p></div>
							</div>
						</div>
					</c:forEach>
				</div> 
			</div>
		</div>
	</div>
</div>


<script src="js/auction.js" type="text/javascript"></script>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />