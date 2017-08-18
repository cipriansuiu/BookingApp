<template>
  <div>
    <div style="min-width: 700px;">
      <img src="../assets/booking_logo.png" alt="book" class="book"/>
      <div class="div" >
        <form name="myForm">
          <!-- NAME -->
          <div class="form-group" v-bind:class="{ 'form-group--error': $v.name.$error }">
            <label class="date" >Your name</label>
            <input class="tbox"  v-model.trim="name" @input="$v.name.$touch()">
          </div><span id="empty_name" class="form-group__message" v-if="!$v.name.required">Field is required</span><span class="form-group__message" v-if="!$v.name.minLength">Name must have at least {{$v.name.$params.minLength.min}} letters.</span>          
             <!-- EMAIL -->
          <div class="form-group" v-bind:class="{ 'form-group--error': $v.name.$error }">
            <label class="date"> Email address </label>
            <input class="tbox" type="email" v-model.trim="email" @input="$v.email.$touch()">
          </div>
          <span id="empty_email" class="form-group__message" v-if="!$v.email.required">Field is required</span>
          <span class="form-group__message" v-if="!$v.email.email">Nu e email.</span>     
           <!-- <input type="email" name="emailaddres" class="tbox" v-model="email"/> -->
           <!-- PASS -->
           <div class="form-group" v-bind:class="{ 'form-group--error': $v.name.$error }">
             <label class="date">Password</label>
             <input class="tbox" type="password" v-model.trim="password" @input="$v.password.$touch()">
           </div>
           <span id="empty_password" class="form-group__message" v-if="!$v.password.required">Field is required</span>
           <span class="form-group__message" v-if="!$v.password.minLength">Name must have at least {{$v.password.$params.minLength.min}} letters.</span>
           <!-- BUTTON -->
          <div class="form-group" v-bind:class="{ 'form-group--error': $v.name.$error }">
            <b-btn v-on:submit v-bind:class="{ 'text-danger': $v.$invalid }"  v-on:click="register($event)"  class="book_btn" v-b-modal.modal1>REGISTER</b-btn>
            <a class="text" href="/login2">You already have an account?</a>
          </div>
        </form>
        {{$v.$invalid}}
      </div>
  </div>
  </div>
</template>
<script>
  import { required, minLength, email } from 'vuelidate/lib/validators'
  import axios from 'axios';
  export default {
    name: 'login',
    data () {
      return {
        name: '',
        email: '',
        password: '',
        bookings: []
      }
    },
    validations: {
        name: {
          required,
          minLength: minLength(5)
        },
        email: {
          email,
          required,
          minLength: minLength(6)
        
         },
        password: {
          required,
          minLength: minLength(8)
        }
    },
    methods:{
      // submit: function(event){
      //   var self = this;
      //   event.preventDefault();
      //   axios.get('http://192.168.150.166:9001/users').then( function (response)  {
      //    console.log('response: ', response); 
      //    self.bookings = response.data;
      //   })
      //   .catch(function (error) {
      //     console.log('error: ', error);
      //   })
      // },

      register: function(event) {
        event.preventDefault();
        var self = this;
        debugger;
        axios.post('http://192.168.150.166:9001/users', {

            name: self.name,
            email: self.email,
            password: self.password
        })
        .then(response => {

          window.location.replace('/login2');
        })
        .catch(e => {
          console.log(e)
        })
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
      margin-top: 55px;

  }
  /* nume email si pass*/
  .date{

      font-size:20px;
      margin-top: 10px;
      margin-bottom: 3px;
      height: 30px;
      float: left;



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
      top :60px;



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
  .form-group__message{

    color: #e52626;
    

  }

  #empty_email, #empty_name, #empty_password{
    display: none;
  }

  .text-danger{
    color: #fff !important;
    pointer-events: none;

  }
</style>
