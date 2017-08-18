<template>
<div class="dashboard_v2">
<section class="section1">
  <div class="top">
      <br><div class="new_s"><h1>New service</h1></div>
      </form>
  </div>
  
  <div class="service_box">
  <div class="title">
      <h1>Name of the service</h1>
      <img class="right_icons" src="../assets/trash2.png"> 
      <img class="right_icons" src="../assets/edit2.png">
      </div>
    <section class="section2">
      
      <br>
      <h5>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean nulla nisl, pretium in sagittis finibus, consectetur aliquet dolor. Maecenas non tincidunt urna. Proin eu magna eget purus dapibus convallis. Phasellus rutrum nibh et velit varius, a molestie diam lobortis. Quisque luctus leo quam, a fermentum tellus ullamcorper et. Quisque blandit imperdiet felis at fermentum. Vestibulum sit amet erat augue. Sed sed malesuada nibh. Nunc sollicitudin tristique diam et tempus. Sed sagittis vitae nisl quis vestibulum. 
      </h5>
      <br>  
      <div class="sd1">
        <div class="sd11">
          <h2>Mon - Fri, 08:00 - 16:00</h2>
          <h5>Availability</h5>
        </div>

        <div class="sd12">
          <h2>6 available</h2>
          <h5>Spaces</h5>
        </div>
      </div> 

      <div class="sd2">
        <div class="sd21">
          <h2>1 hour</h2>
          <h5>Duration</h5>
        </div>

        <div class="sd22">
          <h2>210 lei</h2>
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
export default 
{
  name: 'Dashboard_v2',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
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
    height:135px;
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
.new_s{
    margin-top: 20px;
    background-color:#c97ce5; 
    float:right;
    height: 55px;
    width: 190px;
    border-radius: 3px;
}
.new_s h1{
  color: white;
  font-size: 20px; 
  line-height: 55px;
  text-align: center; 
  font-family: Arial;
}
.service_box{
    background: #fff;
    width: 100%;
    -webkit-box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    -moz-box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    display: table;
}
.title h1{
    line-height: 60px; 
    font-family: Arial;
    font-size:26px;
    color: white;
    margin-left: 2.5%;
    display: inline-block;
}
.title{
    height: 60px;
    background-color: #7A8FDF; 
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
