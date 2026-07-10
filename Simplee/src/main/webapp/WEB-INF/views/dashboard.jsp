<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Foodie's Restaurant</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family:Arial,Helvetica,sans-serif;
}

body{
background:#f8f8f8;
}

/* Navbar */

nav{
background:#d62828;
display:flex;
justify-content:space-between;
align-items:center;
padding:15px 60px;
position:sticky;
top:0;
}

.logo{
font-size:30px;
font-weight:bold;
color:white;
}

nav ul{
display:flex;
list-style:none;
}

nav ul li{
margin-left:30px;
}

nav ul li a{
color:white;
text-decoration:none;
font-size:18px;
font-weight:bold;
transition:.3s;
}

nav ul li a:hover{
color:yellow;
}

/* Hero */

.hero{
height:90vh;
background:url('https://images.unsplash.com/photo-1504674900247-0877df9cc836?auto=format&fit=crop&w=1500&q=80');
background-size:cover;
background-position:center;
display:flex;
justify-content:center;
align-items:center;
text-align:center;
color:white;
}

.hero-content{
background:rgba(0,0,0,.6);
padding:40px;
border-radius:10px;
}

.hero h1{
font-size:55px;
}

.hero p{
font-size:22px;
margin:20px;
}

.btn{
padding:15px 35px;
background:#ffb703;
color:black;
font-size:18px;
text-decoration:none;
border-radius:5px;
font-weight:bold;
}

/* Section */

section{
padding:60px;
}

.title{
text-align:center;
font-size:40px;
margin-bottom:40px;
color:#d62828;
}

/* Menu */

.menu{
display:grid;
grid-template-columns:repeat(auto-fit,minmax(280px,1fr));
gap:30px;
}

.card{
background:white;
border-radius:10px;
box-shadow:0px 0px 15px rgba(0,0,0,.2);
overflow:hidden;
transition:.3s;
}

.card:hover{
transform:translateY(-10px);
}

.card img{
width:100%;
height:220px;
object-fit:cover;
}

.card h2{
padding:15px;
}

.card p{
padding:0 15px;
}

.price{
font-size:22px;
color:red;
font-weight:bold;
padding:15px;
}

.buy{
margin:15px;
display:inline-block;
padding:10px 25px;
background:#d62828;
color:white;
text-decoration:none;
border-radius:5px;
}

/* About */

.about{
display:flex;
flex-wrap:wrap;
align-items:center;
gap:40px;
}

.about img{
width:500px;
max-width:100%;
border-radius:10px;
}

.about-text{
flex:1;
font-size:18px;
line-height:30px;
}

/* Contact */

.contact{
background:#fff3e0;
padding:50px;
border-radius:10px;
}

.contact p{
font-size:20px;
margin:15px 0;
}

/* Footer */

footer{
background:#222;
color:white;
text-align:center;
padding:20px;
margin-top:30px;
}

.logout{
background:white;
color:red;
padding:10px 20px;
border-radius:5px;
text-decoration:none;
font-weight:bold;
}

</style>

</head>

<body>

<nav>

<div class="logo">
🍔 Foodie's Restaurant
</div>

<ul>

<li><a href="#">Home</a></li>
<li><a href="#menu">Menu</a></li>
<li><a href="#about">About</a></li>
<li><a href="#contact">Contact</a></li>

<li>
<a class="logout" href="${pageContext.request.contextPath}/login">
Logout
</a>
</li>

</ul>

</nav>

<!-- Hero -->

<div class="hero">

<div class="hero-content">

<h1>Welcome ${name}</h1>

<p>Fresh Food | Fast Delivery | Best Taste</p>

<a href="#menu" class="btn">Order Now</a>

</div>

</div>

<!-- Menu -->

<section id="menu">

<h1 class="title">Our Delicious Menu</h1>

<div class="menu">

<div class="card">

<img src="https://images.unsplash.com/photo-1568901346375-23c9450c58cd?auto=format&fit=crop&w=800&q=80">

<h2>Cheese Burger</h2>

<p>Loaded with cheese, lettuce and crispy patty.</p>

<div class="price">₹199</div>

<a href="#" class="buy">Buy Now</a>

</div>

<div class="card">

<img src="https://images.unsplash.com/photo-1513104890138-7c749659a591?auto=format&fit=crop&w=800&q=80">

<h2>Italian Pizza</h2>

<p>Fresh mozzarella with delicious toppings.</p>

<div class="price">₹349</div>

<a href="#" class="buy">Buy Now</a>

</div>

<div class="card">

<img src="https://images.unsplash.com/photo-1604908176997-431cccf5f0d3?auto=format&fit=crop&w=800&q=80">

<h2>Fried Chicken</h2>

<p>Crispy chicken served with spicy sauce.</p>

<div class="price">₹299</div>

<a href="#" class="buy">Buy Now</a>

</div>

<div class="card">

<img src="https://images.unsplash.com/photo-1551024601-bec78aea704b?auto=format&fit=crop&w=800&q=80">

<h2>Cold Drink</h2>

<p>Fresh chilled soft drinks.</p>

<div class="price">₹99</div>

<a href="#" class="buy">Buy Now</a>

</div>

<div class="card">

<img src="https://images.unsplash.com/photo-1550547660-d9450f859349?auto=format&fit=crop&w=800&q=80">

<h2>French Fries</h2>

<p>Golden crispy potato fries.</p>

<div class="price">₹149</div>

<a href="#" class="buy">Buy Now</a>

</div>

<div class="card">

<img src="https://images.unsplash.com/photo-1540189549336-e6e99c3679fe?auto=format&fit=crop&w=800&q=80">

<h2>Healthy Salad</h2>

<p>Fresh vegetables with healthy dressing.</p>

<div class="price">₹179</div>

<a href="#" class="buy">Buy Now</a>

</div>

</div>

</section>

<!-- About -->

<section id="about">

<h1 class="title">About Us</h1>

<div class="about">

<img src="https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?auto=format&fit=crop&w=1000&q=80">

<div class="about-text">

<h2>Foodie's Restaurant</h2>

<br>

<p>

Welcome to Foodie's Restaurant.

We prepare fresh, delicious, and hygienic food every day.

Our chefs use premium ingredients to serve the best burgers,

pizza, chicken, salads, desserts, and beverages.

Enjoy dining with your friends and family.

</p>

</div>

</div>

</section>

<!-- Contact -->

<section id="contact">

<h1 class="title">Contact Us</h1>

<div class="contact">

<p><b>📍 Address:</b> Hyderabad, Telangana</p>

<p><b>📞 Phone:</b> +91 9876543210</p>

<p><b>✉ Email:</b> foodies@gmail.com</p>

<p><b>⏰ Timings:</b> 10:00 AM - 11:00 PM</p>

</div>

</section>

<footer>

<h3>© 2026 Foodie's Restaurant | Designed with ❤️</h3>

</footer>

</body>
</html>