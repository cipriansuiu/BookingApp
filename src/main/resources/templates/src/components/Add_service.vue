<template>
<div class="add_service">

<section class="section1">

    <div class="top">
        <form class="" action="Dashboard_v1">
            <br><h3 class="title">Add new service</h3>
            <b-btn v-on:click="addService" v-on:submit  v-b-modal.modal1 class="add">+</b-btn><br>
            <h5 class="service">Add service</h5><br>
            <h5 class="details">SERVICE DETAILS</h5>
        </form>
    </div>

    <div class="left">
        <form id="form1" action="" v-bind:class="{ 'form-group--error': $v.name.$error }">
            <h5 class="text">Service name</h5><br>
            <input name="name" type="text" v-model.trim="name" @input="$v.name.$touch()" class="tbox"><br>
            <span class="form-group__message" v-if="!$v.name.required">Field is required</span>
            <span class="form-group__message" v-if="!$v.name.minLength">Name must have at least {{$v.name.$params.minLength.min}} letters.</span><br>
            <h5 class="text">Service description</h5><br>
            <textarea name="description" class="tbox_mare" v-model.trim="description" @input="$v.description.$touch()"></textarea>
            <span class="form-group__message" v-if="!$v.description.required">Field is required</span>
            <span class="form-group__message" v-if="!$v.description.minLength">Description must have at least {{$v.description.$params.minLength.min}} letters.</span>
        </form>
    </div>

    <div class="right">
      <form id="form2" action="" v-bind:class="{ 'form-group--error': $v.name.$error }">
        <h5 class="text">Service duration</h5><br>
        <input name="duration" type="text" v-model.trim="duration" @input="$v.duration.$touch()" class="tbox"><br>
        <span class="form-group__message" v-if="!$v.duration.required">Field is required</span>
        <span class="form-group__message" v-if="!$v.duration.minLength"></span><br>
        <h5 class="text">Free space</h5><br>
        <input name="free_space" type="text" v-model.trim="free_space" @input="$v.free_space.$touch()" class="tbox"><br>
        <span class="form-group__message" v-if="!$v.free_space.required">Field is required</span>
        <span class="form-group__message" v-if="!$v.free_space.minLength"></span><br>
        <h5 class="text">Price</h5><br>
        <input name="price" type="value" v-model.trim="price" @input="$v.price.$touch()" class="tbox"><br>
        <span class="form-group__message" v-if="!$v.price.required">Field is required</span>
        <span class="form-group__message" v-if="!$v.price.minLength"></span><br>
        </form>
    </div>
</section>

<br><section class="section1">
<h5 class="details">AVAILABILITY</h5>
<table>
  <thead>
    <tr>
      <th></th>
      <th>
        <span class="short">MON</span>
      </th>
      <th>
        <span class="short">TUE</span>
      </th>
      <th>
        <span class="short">WED</span>
      </th>
      <th>
        <span class="short">THU</span>
      </th>
      <th>
        <span class="short">FRI</span>
      </th>
      <th>
        <span class="short">SAT</span>
      </th>
      <th>
        <span class="short">SUN</span>
      </th>
    </tr><br>
  </thead>
  <tbody>
    <tr>
      <td class="hour" rowspan="1"><span>7:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>8:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>9:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>10:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>11:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>12:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>13:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>14:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>15:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>16:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>17:00</span></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
    <tr>
      <td class="hour" rowspan="1"><span>18:00</span></td>
      <td><input type="checkbox" cdsfsflass="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
      <td><input type="checkbox" class="check"></td>
    </tr>
  </tbody>
</table>
</section>


</div>
</template>

<script>
import { required, minLength, between } from 'vuelidate/lib/validators'

export default {
    name: 'Add_service',
  data () {
    return {
      company:'',
      name: 'test',
      description: 'testtesttesttesttesttesttesttest',
      duration: '60',
      free_space: '3',
      price: '50.5',
      schedule: ''
    }
  },
  validations: {
    name: {
      required,
      minLength: minLength(4)
    },
    description: {
      required,
      minLength: minLength(20)
    },
    duration: {
      required,
      minLength: minLength(1)
    },free_space: {
      required,
      minLength: minLength(1)
    },price: {
      required,
      minLength: minLength(1)
    }
  },
  methods:{

      addService: function(event) {
        event.preventDefault();
        var self = this;
        
        axios.post('http://192.168.150.166:9001/services', {

            name: self.name,
            description: self.description,
            duration: self.duration,
            free_space: self.free_space,
            price: self.price
        })
        .then(response => {
          console.log("success");
          
        })
        .catch(e => {
          console.log(e)
        })
      }

  }
  
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

@import url('https://fonts.googleapis.com/css?family=Roboto');

.section1{
    width: 42%;
    margin: 0 auto;
    height: 600px;
}
.top{
    margin: 0 auto;
    margin-top: 25px;
    height:190px;
}
.left{
    width: 49%;
    float: left;
}
.right{
    width: 49%;
    float: right;
}
.title{
    color:#c97ce5   ;
    font-family: Arial;
    font-size: 30px;
    font-weight: bold;
    display:inline-block ;
}
.details{
    color:darkgray;
    font-family: Arial;
    font-size: 14px;
    display:inline-block ;
}
.text{
    margin-top: 30px;
    margin-bottom: 3px;
    color:dimgray;
    font-family: Arial;
    font-weight: bold;
    font-size: 17px;
    display:inline-block ;

}

.tbox{
    font-size: 17px;
    
    height: 55px;
    width:  100%;
    border-radius: 4px;
    border: 3px solid #b3b3b3;

}
.tbox_mare{
    font-size: 17px;
    padding-left: 0;
    height: 186px;
    width:  100%;
    border-radius: 4px;
    border: 3px solid #b3b3b3;
    resize: none;
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
.add:hover{
    background-color:#8779e0;
    height:81px;
    width:81px;
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
table{
    width: 100%;
    margin-top: 20px;
    font-family:sans-serif;
    width: 100%;
    border-spacing: 0;
    border-collapse: separate;
    table-layout: fixed;
    margin-bottom: 50px;
    border: 3px solid #b3b3b3;
}
.hour{
    font-weight: bold;
}
tr{
    color:dimgray;
    font-size: 17px
}

.check{
    margin: 10px 10px;
}

.form-group__message{
    color:red;
    font-size: 16px;
}

</style>