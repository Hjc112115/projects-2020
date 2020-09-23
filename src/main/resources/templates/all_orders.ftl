<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>MyShop</title>
	<link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">MyShop</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="/product/">商城首页</a></li>
				<li class="layui-nav-item layui-this"><a href="javascript:void(0);">订单管理</a></li>
			</ul>
			<#--登录后-->
            <ul id="user-nav" class='layui-nav layui-layout-right'>
                <li class="layui-nav-item">
                    <a href="">购物车<span id="cart-num" class="layui-badge"><#if user??>${user.cartNum}</#if></span></a>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:void(0);">
                        <img src="/images/ico-01.jpg" class="layui-nav-img">
                        <span id="user-name"><#if user??>${user.name}</#if></span>
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:void(0)" onclick="openModify()">基本资料</a></dd>
                        <dd><a href="javascript:void(0)" onclick="openPassword()">安全设置</a></dd>
                    </dl>
                </li>
            </ul>
		</div>
		
		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree"  lay-filter="test">
					<li class="layui-nav-item layui-this" style="text-align:center"><a href="">用户订单</a></li>
					<li class="layui-nav-item" style="text-align:center"><a href="">历史订单</a></li>
				</ul>
			</div>
		</div>
  
		<!-- 内容主体区域 -->
		<div class="layui-body">
			<div class="layui-container">
				<#list orders as o>
				<table class="layui-table" style="margin-bottom:30px">
                    <colgroup>
                        <col>
                        <col width="200">
                        <col>
                        <col>
                        <col>
                        <col>
                    </colgroup>
					<thead>
						<tr>
						  <th>编号</th>
						  <th>名称</th>
						  <th>价格</th>
						  <th>数量</th>
						  <th>总价</th>
						  <th>操作</th>
						</tr> 
					</thead>
					<tbody>
						<#list o.orderItems as t>
						<tr>
						  <td>${t.id}</td>
						  <td>${t.product.name}</td>
						  <td>${t.product.price}</td>
						  <td>${t.number}</td>
						  <td>${t.number * t.product.price}</td>
						  <td>
							<button type="button" class="layui-btn layui-btn-primary layui-btn-sm">商品详情</button>
						  </td>
						</tr>
						</#list>
						<tr>
						  <td>订单号</td>
						  <td>${o.orderNumber}</td>
						  <td>${o.createDate?string("yyyy-MM-dd")}</td>
						  <td>总　计</td>
						  <td>${o.totalPrice}</td>
						  <td>
						    <button type="button" class="layui-btn layui-btn-primary layui-btn-sm">取消订单</button>
						  </td>
						</tr>
					</tbody>
				</table>
				</#list>
			</div>
		</div>
		
		<!-- 底部固定区域 -->
		<div class="layui-footer" style="text-align:center">
			©www.jwkt.net 版权所有
		</div>
	</div>
	
	<script src="/layui/js/jquery.min.js"></script>
	<script src="/layui/layui.js"></script>
	<script>
	//JavaScript代码区域
	layui.use(['element', 'form', 'laypage'], function(){
		var element = layui.element,
			laypage = layui.laypage,
			form = layui.form;
			
		laypage.render({
			elem: 'pagination',
			count: 50,
			limit: 12,
			curr: 2
		});
	});
	</script>
</body>
</html>