<template>
  <div class="hello">
     <table class="table" id="table" >

                <thead >
                  <tr>
                  <th>{{list.day}}</th>
                    
                  </tr>

                </thead>

                <tbody>

                  <tr v-for="todo of list.bookings" v-if="list.bookings.length > 0">

                    <td>
                      {{todo.name}}

                    </td>
                    <td>
                      {{todo.email}}
                      
                    </td>
                    <td>
                      {{todo.phone}}
                      
                    </td>
                    <td>
                      {{todo.availability}}
                      
                    </td>
                     <td>
                      {{todo.service}}
                      
                    </td>
                  </tr>
                  <span v-if="list.bookings.length == 0">
                    <td>{{defaultMessage}}</td>
                  </span>
              

                </tbody>

            </table>
    
  </div>
</template>

<script>
export default {
  name: 'table',
  props: ['list'],
  data() {
    return {
      defaultMessage: "No booking on this date"
    }
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
 
.table thead th {
  color:#d94ee4; 
  font-size: 1.28em;
  font-weight: 400;
  padding-left: 345px;
  

 
}






.table tbody tr {
  background-color:#fbebfb;
  border-bottom: solid 3px #fff;
  line-height: 0.9em;
  font-size: 1em;
  
}




.table  tr>th,.table tr>td {
  border:0;
  text-align:left;

}

.table tbody td:nth-child(1){
  padding-left: 345px;
  width: 500px;
  
 
  

}


.table tbody td:nth-child(5){
  padding-right:200px;

}


.table tbody tr td{
  font-weight:100;
  vertical-align:middle;
}
span td{ 
  border-top:none;
  font-size: 14px;
  white-space: nowrap;
  color: #afafaf;
  letter-spacing: 1px;
  padding:0;
  margin:0;
}

</style>
