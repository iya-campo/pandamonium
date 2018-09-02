<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="ctx" scope="session" />

<title>Pandamonium | Home</title>

<link rel="stylesheet" href="${ctx}/lib/bootstrap-3.3.7/css/bootstrap.css">
<!-- Index Custom Style -->
<link rel="stylesheet" href="${ctx}/css/indexStyle.css">
<!-- Auction Custom Style -->
<link rel="stylesheet" href="${ctx}/css/auctionStyle.css">

<script src="${ctx}/lib/jquery/jquery-3.3.1.min.js" type="text/javascript"></script>

<script>
	var ctx = '${ctx}';
</script>

</head>
<body>
	<div class="main">
		<div class="wrapper">
			<div class="pandamonium-logo">
				<img src="img/index/pandamonium-logo.png" height="100%"/>
			</div>