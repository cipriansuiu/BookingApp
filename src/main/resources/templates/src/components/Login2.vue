<template>
	<div >
		<div >
			<img src="../assets/booking_logo.png" alt="book" class="book"/>
			<div class="div">
				<form >
					<div class="date">Email address</div>
					<input type="text" name="name" class="tbox" v-model="name" />
					<div class="date">Password</div>
					<input type="password" name="password" class="tbox" v-model="password"/>
					<b-btn v-on:submit v-on:click="register($event)" value="login" class="book_btn" v-b-modal.modal1>LOGARE</b-btn>
					<a class="text" href="/login3"> Recover password</a>
				</form>
			</div>
		</div>
	</div>
</template>	

<script>
import axios from 'axios';
export default {
	name: 'login2',
	data () {
		return {
			name: 'test@test.com',
			email: '',
			password: 'testtest'
		}
	},
	methods: {

		register: function(event) {

        //event.preventDefault();
        var bodyObject = {
        	name: this.name,
        	email: this.email,
        	password: this.password
        }

        axios.post('http://192.168.150.166:9001/login', {
        	name: 'nume de scos de pe back',
        	email: this.email,
        	password: this.password
        })
        .then(function (response) {
        	console.log(response);
        })
        .catch(function (error) {
        	console.log(error);
        });
        
        
    	}
	}
}


</script>

<style>

/*intrebarea*/
a.text{

	text-align: center;
	font-size: 20px;
	margin-top: 20px;

}
.book_btn{
	text-decoration:none;
	font-size: 20px;
	width: 405px;
	height: 50px;
	vertical-align: middle;
	background-color: #c97ce5;
	color: white;
	border: none;
	border-radius: 3px;
	margin-top: 53px;

}
/* nume email si pass*/
.date{

	font-size:20px;
	margin-top: 25px;
	margin-bottom: 3px;
	text-align: left;
	height: 30px;


}
/*box*/
.tbox{

	font-family: Open Sans, sans-serif;
	width: 400px;
	height: 50px;
	border-radius: 3px;
	border: 1px solid #B3B3B3;
	font-size: 25px;



}
/*divul mare*/
.div{

	font-family: 'Open Sans', sans-serif;
	width: 405px;
	margin: 0 auto;
	position: relative;
	top :90px;

}
.book{
	height:270px;
	width:500px;
	margin: 0 auto;
	margin-top: 60px;

}
div{
	text-align: center;
}

.submit_button {
	cursor: pointer;
}

</style>