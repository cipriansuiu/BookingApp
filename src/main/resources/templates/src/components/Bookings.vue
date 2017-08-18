<template>
  <div class="bookings">
    <navigation/>
    <select v-model="selected" class="mb-3" placeholder="Service name">
     <option disabled value="">Service name</option>
     <option v-for="todo in bookings">{{todo.name}}</option>
     
   </select>

   <!-- BOOKINGS -->
   <section class="panel">
    <div id="bookings">
      <table class="table" id="table">

        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone No</th>
            <th>Availability</th>
          </tr>
        </thead>

        <tbody>
          <tr v-for="todo in bookings">
            <td>
              {{todo.name}}

            </td>
            <td>
              {{todo.email}}

            </td>
            <td>
              {{todo.phone_number}}

            </td>
            <td>
              {{todo.availability}}

            </td>


          </tr>


        </tbody>

      </table>
    </div>
  </section>
  <!-- /END BOOKINGS -->
</div>
</template>

<script>
import navigation from '@/components/Navigation'
export default {

  name: 'bookings',
  data () {


    return {
      selected:'',
      name: '',
      email: '',
      phone: '',
      bookings: {}
    }
  },
  components: {
    navigation
  },
  methods:{
    getBookings() {
      debugger;
      axios.get('http://192.168.150.166:9001/bookings')
      .then( (response) =>  {
        console.log('response',response);
        this.bookings = response.data;
      })
      .catch(function (error) {
        console.log('error: ', error);
      })
    },
    
  },
  mounted:function() {
    this.getBookings();

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
select{
  background-color: white;  
  padding-left:18px;
  letter-spacing: 0px;

}
.mb-3{
  width:14.375em;
  border-radius: 3%;
  margin:3em 0 0 24em;
  font-size: 1.16em;
  font-weight: 500;
  height:55px !important;
}
select{

  display: block;
  border: solid 1px #efa8f3;
  color:#9d5fa2;
  vertical-align: center;


  
}
.panel {
  margin:0;
  border: 0;

} 

.table {

  margin-top:3.5em;



} 
.table thead {
  color:#d94ee4; 
  font-size: 19px;
  border: none;

}
.table thead tr th:nth-child(1) {
  padding-left: 450px;
}
.table thead tr th:nth-child(2),
.table tbody tr td:nth-child(2),
.table thead tr th:nth-child(3),
.table tbody tr td:nth-child(3) {
  text-align: center;
}

.table tbody td:nth-child(1){
  padding-left: 450px;
  width: 300px;
  white-space: nowrap;
}

.table tbody td:nth-child(4){
  padding-right:200px;

}

.table tbody{
  font-size: 1em;
  line-height: 0.9;

}




.table tbody tr:nth-child(4n+1) {
  background-color:#fbebfb;
}
.table tbody tr:nth-child(2n+0) {
  background-color:#fff;
}
.table tbody tr:nth-child(4n+3) {
  background-color:#e7e8f7;
}

.table  tr>th,.table tr>td {
  border:0;
  text-align:left;
}




.table thead tr th{
  font-weight:400;

  
}
.table tbody tr td{

  font-weight:100;
  

}

</style>
