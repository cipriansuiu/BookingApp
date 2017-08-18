<template>
<div class="navigation">
  	
	<nav class="navbar">
	 	<div>
	   	  <div class="navbar-header">
	        <img src="../assets/image.png" alt="Booking App">
	        
	      </div>
	      <ul class="nav navbar-right">
		  	<li><router-link to="/Dashboard_v1" exact-active-class="active"> DASHBOARD </router-link></li>
		  	<li><router-link to="/bookings" exact-active-class="active"> BOOKINGS </router-link></li>
		  	<li><router-link to="/calendar" exact-active-class="active"> CALENDAR </router-link></li>
		  	<li><router-link to="/profile" exact-active-class="active"> PROFILE </router-link></li>
		  </ul>
		 
	    </div>
	</nav>
</div>
</template>

<script>
export default {
  name: 'navigation',
  data() {
  	return {
	   
   	}
  }
}

</script>
<style scoped>
/*reset*/
html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed, 
figure, figcaption, footer, header, hgroup, 
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
}
/* HTML5 display-role reset for older browsers */
article, aside, details, figcaption, figure, 
footer, header, hgroup, menu, nav, section {
	display: block;
}
body {
	line-height: 1;
}
ol, ul {
	list-style: none;
}
blockquote, q {
	quotes: none;
}
blockquote:before, blockquote:after,
q:before, q:after {
	content: '';
	content: none;
}
table {
	border-collapse: collapse;
	border-spacing: 0;
}
/*end reset*/
 body{

 	font-family: "Open Sans";
    
    color: #9ca4ab;
 }
 
 .navbar{
 	width:100%;
 	height:6.1em;
 	background-color: rgb(123,144,224);
 	border-radius:0;

}

 
 .navbar img{
 	margin-left:0.9em;
 	margin-top:2.6em;
 	height:2.8em;
 	width:13em;
 	float: left;
}
 .navbar-right{
	float:right;
	
}
li>a{
	display: block;
 	font-size: 20px;
 	color:#fff;
 	margin-top:2.5em;	
 	text-decoration: none;
 	padding:0 15px 0 15px;

 }
 
.active{
	color:#fff;
 	font-weight: bold;
	

}


</style>
