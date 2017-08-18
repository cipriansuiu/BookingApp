
<template>
  <div class="calendar">
    <navigation/>
  <section class="slide">
      <p>&#10092;</p>
      <h3>3 - 7 July</h3>
      <p>&#10093;</p><br>
      <h6>Prev. week</h6>
      <h6>Next week</h6>
    </section>
  <section class="panel">
       

    <services v-bind:list="firstday"/>
    <services v-bind:list="secondday"/>
    <services v-bind:list="thirdday"/>
    
    <!-- <div v-for="item in bigArr">
      <services v-bind:list="item"/>
    </div> -->
    
  </section>
    
    <div>
  
</div>
  
  </div>
</template>

<script>

import Vue from 'vue'
import navigation from '@/components/Navigation'
import services from '@/components/serviceTable'

 
export default {
  name: 'calendar',
    data() {
     
    

    return {
       
       
    

      firstday:{
        day: 'Monday, 3 July',
        bookings: [{
          id : '1',
          name: 'Aiden Brooks',
          email: 'caroll.swaniawky@hunbun.net', 
          phone: '993-354-3654',
          availability: '10:00 - 11:00',
          service: 'service name'
        },{ 
          id : '2',
          day: 'Monday, 3 July',
          name: 'Aiden Brooks',
          email: 'caroll.swaniawky@hunbun.net', 
          phone: '993-354-3654',
          availability: '10:00 - 11:00',
          service: 'service name'
        },{
          id : '3',
          day: 'Monday, 3 July',
          name: 'Aiden Brooks',
          email: 'caroll.swaniawky@hunbun.net', 
          phone: '993-354-3654',
          availability: '10:00 - 11:00',
          service: 'service name'
        }]},

      secondday:{
        day: 'Tuesday, 4 July',
        bookings:[{ 
          id: '1',
          day: 'Tuesday, 4 July',
          name: 'Aiden Brooks',
          email: 'caroll.swaniawky@hunbun.net', 
          phone: '993-354-3654',
          availability: '10:00 - 11:00',
          service: 'service name'
        },{ 
          id : '2',
          name: 'Aiden Brooks',
          email: 'caroll.swaniawky@hunbun.net', 
          phone: '993-354-3654',
          availability: '10:00 - 11:00',
          service: 'service name'
        }]},

      thirdday:{
        day: 'Monday, 3 July',
        bookings: []
      }
     
    }

  },
  components: {
    navigation,services
  }

  
  
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>



.slide{
  text-align: center;
  margin-top:3em;
  line-height:1.2;
  margin-bottom: 3.2em;
}

.slide>p{
  display:inline-block;
  margin:0;
  padding:0 6em 0 6em;
  font-size:2em;
  font-weight: 100; 

}
.slide>h3{
  display:inline-block;
  margin:0;
  color:#d94ee4;
  font-weight:500;
  font-size: 1.8em;

}
.slide>h6{
  color:#8e8e8e;
  font-weight: 100;
  font-size:0.8em;
  display: inline-block;
  padding:0 18em 0 18em;
  margin:0;
}







</style>
