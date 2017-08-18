<template>
	<div>
		
		<p class="title">Booking <span class="app">App</span></p>
		<div class="container">

		<div id = "hidden">
		<p style="font-size:20px">This user already exists!</p>
		</div>

			<b-form class="form-horizontal">
				<br>
				<div class="form-group" v-bind:class="{ 'form-group--error': $v.name.$error }">
					<label><b>Your name</b></label>
					<b-form fieldset>
						<b-form-input v-model="name"
						type="text"
						placeholder="Enter your name"
						:state="name.length?'success':'warning'"
						:formatter="format"
						></b-form-input>
						<p v-if="!$v.name.required">This field is required!</p>
					</b-form fieldset>
				</div>
				<div class="form-group" v-bind:class="{ 'form-group--error': $v.email.$error }">
					<label><b>Email address</b></label>
					<b-form-input v-model="email"
					type="text"
					placeholder="Enter email"
					:state="email.length?'success':'warning'"
					:formatter="format"
					></b-form-input>
					<p v-if="!$v.email.email">This field must be an email!</p>
				</div>
				<div class="form-group" v-bind:class="{ 'form-group--error': $v.password.$error }">
					<label><b>Password</b></label>
					<b-form-input v-model="password"
					type="password"
					placeholder="Password"
					:state="password.length?'success':'warning'"
					:formatter="format"
					></b-form-input>
					<p v-if="!$v.password.minLength">The password must be 6 characters or longer!</p>
					<p v-if="!$v.password.maxLength">The password must be less than 16 characters!</p>
				</div>
				<div class="form-group" v-bind:class="{ 'form-group--error': $v.pass_confirm.$error }">
					<label><b>Confirm password</b></label>
					<b-form-input v-model="pass_confirm"
					type="password"
					placeholder="Confirm password"
					:state="pass_confirm.length?'success':'warning'"
					:formatter="format"
					:required="true"
					></b-form-input>
					<p v-if="!$v.pass_confirm.sameAs">This field must be the same as password!</p>
				</div>
				<br>
				<button @click="submit" class="btn btn-success">REGISTER</button>
				<br>
				<a href="/Login">You already have an account?</a>
			</b-form>
		</div>
	</div>
</template>

<script>

import Router from 'vue-router'
var router = new Router();
	import { required, email, minLength,maxLength, between, sameAs } from 'vuelidate/lib/validators'
	export default {
		data()  {
			return {
				name: '',
				email: '',
				password: '',
				pass_confirm:''
			}

		},
		methods: {
			format(value) {
				return value.toLowerCase();
			},
			submit() {
				if (this.$v.email.email) {
					this.$http.get("http://192.168.150.166:9001/users", {
						
						"email": this.email,
						
					},
					{
						headers:{
							'Access-Control-Allow-Origin': '*',
							'Content-Type': 'application/json',
						}

					}).then(response => {
						if(response.status === 200){
							location.href= '/login';
							// console.log('response: ', response);
						}else{
							document.getElementById("hidden").style.visibility = "visible";
						}
						
					}, response => {
						console.log(response);
					})

				}
			}
		},
		validations: {
			name: {
				required
			},
			email: {
				email
			},
			password: {
				minLength: minLength(6),
				maxLength: maxLength(16)
			},
			pass_confirm:{
				sameAs: sameAs('password')

			}
		}
	}
</script>

<style>
	.container{
		width: 500px;
		min-height: 400px;
		text-align: center;
		background-color: #ccccff;
		margin: 0 auto;
		border-radius: 0 auto;
		margin-top: 20px;
	}
	.container img{
		width: 120px;
		height: 120px;
		margin-top: 0px;
		margin-bottom: 0px;
	}
	.form-input{
		text-align: left;
		font-size: 20px;
	}
	input{
		height: 45px;
		width: 200px;
		font-size: 18px;
		border: none;
		margin-bottom: 10px;
		border-radius: 4px;
		background-color: #fff;
		padding-left: 30px;
	}
	.btn-login{
		height: 45px;
		padding: 15px 30px;
		cursor: pointer;
		border-radius: 4px;
		border: none;
		background-color: blue;
		border-bottom: 4px solid blue;
		margin-bottom: 20px;

	} 

	.title{
		font-size:80px;
		font-family: Arial;
		color:blue;
	}
	.app{
		color:skyblue;
	}

	p{
		font-size:10px;
	}
	.form-group .form_fieldset .input{
		color: black;
	}
	.form-group{
		outline: 0;
	}
	.form-group--error .form_fieldset .input{
		color: red;
	}
	#hidden{
		color:red;
		visibility: hidden;
		font-size:20px;
	}
</style>