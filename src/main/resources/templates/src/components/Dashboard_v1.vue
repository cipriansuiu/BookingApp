<template>

<div class="dashboard_v1">
   <navigation/>
<section class="section1">
  <div class="top">
      <br><form class="" action="Add_service">
      <input type="submit" value="+" class="add"><br>
      <h5 class="service">New service</h5>
      </form>
  </div>

  <div class="service_box" v-for="todo in services">
  <div class="title">
      <h1>{{todo.name}}</h1>
      <img class="right_icons" src="../assets/trash.png"> 
      <img v-on:click="removeService" class="right_icons" src="../assets/edit.png">
      </div>
    <section class="section2">
      
      <br>
      <h5>{{todo.description}}
      </h5>
      <br>  
      <div class="sd1">
        <div class="sd11">
          <h2>Mon - Fri, 08:00 - 16:00</h2>
          <h5>Availability</h5>
        </div>

        <div class="sd12">
          <h2>{{todo.free_space + ' available'}}</h2>
          <h5>Spaces</h5>
        </div>
      </div> 

      <div class="sd2">
        <div class="sd21">
          <h2>{{todo.duration + ' hour'}}</h2>
          <h5>Duration</h5>
        </div>

        <div class="sd22">
          <h2>{{todo.price + ' price'}}</h2>
          <h5>Price</h5>
        </div>
      </div>  
      <br>
    </section>
  </div>

</section>
</div>
</template>

<script>
import navigation from '@/components/Navigation'

export default {
  name: 'Dashboard_v1',
  data () {
    return {
      name: '',
      email: '',
      phone: '',
      services: {}
    }
  },
  
  components: {
    navigation
  },
  methods:{
    getBookings() {
      debugger;
      axios.get('http://192.168.150.166:9001/services')
      .then( (response) =>  {
        console.log('response',response);
        this.services = response.data;
      })
      .catch(function (error) {
        console.log('error: ', error);
      })
    },
      removeService: function(service){
            this.list.$remove(service);
        },
    
  },
  mounted:function() {
    this.getBookings();

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.section1{
    width: 42%;
    margin: 0 auto;
}
.section2{
    width: 95%;
    margin: 0 auto;
}
.top{
    margin: 0 auto;
    margin-top: 25px;
    height:150px;
}
.add{
    margin-right: 10px;
    float:right;
    border-radius: 100%;
    border: none;
    height: 80px;
    width: 80px;
    background-color: #c97ce5;
    color:white;
    font-size: 40px ;
    font-family: "Roboto Thin";
}
.service{
    margin-top: 10px;
    color:dimgray;
    font-family: Arial;
    font-size: 17px;
    font-weight: bold;
    display:inline-block ;
    float:right;
    clear: right;
}
.service_box{
    background: #fff;
    width: 100%;
    -webkit-box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    -moz-box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    display: table;
    margin-bottom: 3.5em;
}
.title h1{
    line-height: 60px; 
    font-family: Arial;
    font-size:26px;
    color: #c97ce5;
    margin-left: 2.5%;
    display: inline-block;
}
.title{
    height: 60px;
    clear:right;
    border-radius: 3px;
   }
.right_icons{
    float: right;
    margin-top: 6px;
    margin-right: 10px;
    color: #858585;
}
.sd1{
    float: left;
    width: 50%;
}
.sd11{
    float: left;
    width: 65%; 
}
.sd12{
    float: right;
    width: 30%;
    margin-left: 5%; 
}
.sd1 h2{
    color: dimgray;
    font-family: Arial;
    font-size: 20px;
    height: auto;
    font-weight: bold;
}
.sd1 h5{
    font-size: 15px;
    font-family: Arial;
    color: #b3b3b3;
    height: auto;
}
.sd2{
    float:right;
    width: 50%;
}
.sd21{
    float: left;
    width: 30%; 
    margin-left: 20%;
}
.sd22{
    float: right;
    width: 20%; 
    margin-left: 30%;
}
.sd2 h2{
   color: dimgray;
   font-family: Arial;
   font-size: 20px;
   height: auto;
   font-weight: bold;
}
.sd2 h5{
  font-size: 15px;
  font-family: Arial;
  color: #b3b3b3;
  height: auto;
  margin: 0 auto;
}
h5{
  font-size: 17px;
  font-family: Arial;
  color: #b3b3b3;
  line-height: 22px;

}
</style>
