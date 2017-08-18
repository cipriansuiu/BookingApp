<template>
  <div>
    <navigation/>
     <section class="section">
       <form >
          <div class="logo">
            <img src="../assets/company_logo.png"/><br><br><br>
            <input type="file" class="choosefile"/>
          </div>

          <div class="profile"> 
                 <label class="date">Company name</label>
                 <input type="text" class="tbox" v-model='company'/>
                 <label class="date">Company description</label>
                 <textarea  v-model='description'> </textarea >
                  <div class="buttons">
                    <b-btn class="book_btn btn btn-secondary" style="float:left">Sing out</b-btn>
                    <b-btn class="book_btn" v-on:click="register($event)" style="float: right;" >Save</b-btn>
            </div>
          </div>
          
      </form>
    </section>
  </div>
</template>

<script>
import navigation from '@/components/Navigation'
import axios from 'axios';
  export default {
    name: 'profile',
    data () {
      return {
        company:'',
        description:''
      }
    },
  components: {
    navigation
  },
  methods:{
   register: function(event) {
        event.preventDefault();
        
        debugger;
        axios.post('http://192.168.150.166:9001/services', {

            company: this.company,
            description: this.description,
        })
        .then(response => {
        })
        .catch(e => {
          console.log(e)
        })
      }
  }
}

</script>
<style >
  
  
  /*logo */
.logo{
  float: left;
  width: 50%;
}
  
  /*introducere date*/
.profile{
  float:right;
  width: 50%;
}
  /*Company date*/
.date{

  font-size:20px;
  margin-bottom: 3px;
  text-align: left;
  height: 30px;
  display: block;
}
  /*box*/
.tbox{

    font-family: Open Sans, sans-serif;
      width: 100%;
      height: 45px;
      border-radius: 3px;
      border: 1px solid #B3B3B3;
      font-size: 25px;


}
.book_btn
{
      font-size: 20px;
      width: 45%;
      height: 55px;
      background-color: #c97ce5;
      color: white;
      border: none;
      border-radius: 3px;
      margin-top: 20px;
}

.logo img {
      width: 230px;
      height:230px;
      border-radius: 50%;
}

.choosefile
{

  margin: 0 auto;
  height: 55px;

}

.choosefile input[type="file"]{
  background: #ff0000;
}

.section{

  width: 42%;
  margin: 0 auto;
  margin-top: 50px;
}
textarea{

  width: 100%;
  height: 115px;
}

</style>