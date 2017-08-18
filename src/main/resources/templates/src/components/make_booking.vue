<template>
  <div id="booking">
  <!-- begin of head section -->
  
  <div class="head">
    <table>
  <tr>
    <th class="co_logo">
      <img src="../assets/company_logo.png">
    </th>
    <th class="co_info">
      <h1>Company name</h1>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent erat lorem, dapibus nec venenatis non, maximus id magna. Suspendisse odio augue, varius nec sodales quis, eleifend sit amet orci. Phasellus rutrum nibh et velit varius, a molestie diam lobortis.</p>
    </th>
  </tr>
</table>
  </div>


    <!-- end of head section -->


    <!-- begin of boxes section -->

    <div class="service_box" v-for="todo in services" >
  <div class="title">
      <h1>{{todo.name}}</h1>
      <img class="right_icons" src="../assets/trash.png"> 
      <img class="right_icons" src="../assets/edit.png">
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
        <b-btn v-b-modal.modal1 class="book_btn">BOOK NOW</b-btn>
      </div> 

      <div class="sd2">
        <div class="sd21">
          <h2>{{todo.duration + ' hour'}}</h2>
          <h5>Duration</h5>
        </div>

        <div class="sd22">
          <h2>{{todo.price + ' Lei'}}</h2>
          <h5>Price</h5>
        </div>
      </div>  
    </section>
  </div>

  <!-- end on boxes section -->

  <!-- begin of modal section -->

  <div class="modall">

  <!-- Main UI -->

  <!-- Modal Component -->
  <b-modal id="modal1" ref="my_modal">
  <div class="content_for_modal">
  <!-- BEGIN FIRST MODAL CONTENT -->
    <form>
      <div class="first_content" v-show="modalIncrement==0">
        <h1>Make your booking</h1>
        <h2>PERSONAL DETAILS</h2>
        <div class="form-group">

        <table>
  <tr class="left_row">
    <td><h5>Name</h5><input v-model.trim="name" @input="$v.name.$touch()" type="text" name="your_name" ></td>
            <td><div class="space"></div></td>
    <td><h5>Email</h5><input v-model.trim="email" @input="$v.email.$touch()" type="text" name="your_email"></td>
  </tr>
  <tr class="left_row">
    <td>
    <span class="form-group__message" id="empty_name" v-if="!$v.name.required">Name field is required.</span>
    <span class="form-group__message" v-if="!$v.name.minLength">Name must have at least {{$v.name.$params.minLength.min}} letters.</span>
    </td>
        <td><div class="space"></div></td>
    <td><span class="form-group__message" id="empty_email" v-if="!$v.email.required">Email field is required.</span>
    <span class="form-group__message" v-if="!$v.email.minLength">Email must have at least {{$v.email.$params.minLength.min}} letters.</span>
    <br>
    <span class="form-group__message" v-if="!$v.email.email">Ex.: john@assist.ro</span>
    </td>
  </tr>
  <tr class="right_row">
    <td><h5>Phone number</h5><input v-model.trim="phone" type="text" name="your_phone"></td>
    <td><div class="space"></div></td>
    <td><h5>&nbsp;</h5><b-btn v-on:click="showFormModal" v-b-modal.modal1 class="sp_book_btn">NEXT</b-btn></td>
  </tr>
  <tr>
    <td><span class="form-group__message" id="empty_phone" v-if="!$v.phone.required">Phone field is required.</span>
    <span class="form-group__message" v-if="!$v.phone.minLength">Phone must have at least {{$v.phone.$params.minLength.min}} numbers.</span>
    </td>
  </tr>
</table>

      </div>
      </div>
    </form>
    <!-- END FIRST MODAL CONTENT -->
    <!-- BEGIN SECOND MODAL CONTENT -->
      <div class="second_content" v-show="modalIncrement==1">
      <h1>Make your booking</h1>
      <h2>BOOKING INFORMATION</h2>

      <table>
        <tr>
        <table>
  <tr>
    <th></th>
    <th>MON</th>
    <th>TUE</th>
    <th>WED</th>
    <th>THU</th>
    <th>FRI</th>
    <th>SAT</th>
    <th>SUN</th>
  </tr>
  <tr>
    <td>07:00</td>
    <td><input class="sp_radio" type="radio" name="" value=""></td>
    <td><input type="radio" name="" value=""></td>
    <td><input type="radio" name="" value=""></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>08:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>09:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>10:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>11:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>12:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>13:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>14:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>15:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>16:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>17:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>18:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
        </tr>
        <tr>
        <th><b-btn v-on:click="hideModal" v-b-modal.modal1 class="close_btn">BACK</b-btn></th>
        <th><b-btn v-on:click="showModal" @click="sendBooking($event)" v-b-modal.modal1 class="sp_book_btn">SEND BOOKING</b-btn></th>
        </tr>
    </table>

      </div>

    <!-- END SECOND MODAL CONTENT -->
    <!-- BEGIN THIRD MODAL CONTENT -->

        <div class="third_content" v-show="modalIncrement==2">
        <img class="sent_img" src="../assets/sent.png">
        <br>
        <h1>Your request was sent!</h1>
        <h5>In a couple on seconds a confirmation email will be sent to your email address with all the details for your reservation. Thank you for using our services!</h5>
      <b-btn class="book_btn" @click="hideModal_final">CLOSE</b-btn>

      </div>
    </div>
  </b-modal>

  </div>

  
  


  



 </div>

</template>

<script>
import { required, minLength, between, email, maxLength } from 'vuelidate/lib/validators'

export default {
  data () {
    return {
      
      modalIncrement: 0,
      name: '',
      email: '',
      phone: '',
      duration: '',
      price: '',
      free_space:'',
      services: {}
      
    }
  },
  methods: {
    hideModal_final() {
      this.modalIncrement=0;
        this.$refs.my_modal.hide();
    },
    showModal: function(){
      this.modalIncrement++;
    },
    hideModal: function(){
      this.modalIncrement--;
    },
    showFormModal: function(){
      if (this.name.length>3 && this.email.length>6 && this.phone.length>9) {
        this.modalIncrement++;
      }
      if (this.name.length==0){
        document.getElementById('empty_name').style.display = "block";
      }
      if (this.email.length==0){
        document.getElementById('empty_email').style.display = "block";
      }
      if (this.phone.length==0){
        document.getElementById('empty_phone').style.display = "block";
      }
    },
    sendBooking: function(event) {
        event.preventDefault();
        var self = this;
        debugger;
        axios.post('http://192.168.150.166:9001/bookings', {

            name: self.name,
            email: self.email,
            phone_number: self.phone
        })
        .then(response => {

         
        })
        .catch(e => {
          console.log(e)
        })
      },
      
    getServices() {
      axios.get('http://192.168.150.166:9001/services')
        .then( (response) =>  {
          this.services = response.data;
      })
      .catch(function (error) {
        console.log('error: ', error);
      })
    },
  },
  validations: {
    name: {
      required,
      minLength: minLength(4)
    },
    email: {
      required,
      minLength: minLength(6),
      email
    },
    phone: {
      required,
      minLength: minLength(10)
    }
  },
  mounted:function() {
      this.getServices();
    
  }
  

}


</script>

<style>
  /* begin of head section */

  #booking{
    margin: 0 auto;
    background: #fff;
  }
  
  .head{
    width: 100%;
    background: #fcfcfc;
    color: #fff;
    padding-top: 75px;
    padding-bottom: 75px;
      
  }

  .head table{
    width: 41%;
    margin: 0 auto;
    margin-top: 1%;
    border: 1px solid #fff;
  }

  .co_logo{
    position: absolute;
  }

  .co_info{
    padding-left: 190px;
    color: #AEAEAE;
    font-weight: normal;
  }

  .co_info h1{
    font-size: 26px;
    color: #C97DE5;
    padding-bottom: 15px;
  }

  /* end of head section */

  /* begin of boxes section */

.section2{
    width: 95%;
    margin: 0 auto;
}


.service_box{
    background: #fff;
    width: 41%;
    margin: 0 auto;
    -webkit-box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    -moz-box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    box-shadow: 2px 2px 10px 2px rgba(201,124,229,0.25);
    display: table;
    margin-top: 50px;
    padding-top: 15px;
    padding-bottom: 15px;
}
.title h1{
    line-height: 60px; 
    font-family: Arial;
    font-size:26px;
    color: #c97ce5;
    margin-left: 2.5%;
    display: inline-block;
    font-weight: 500;
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

.book_btn{
   width: 50%;
   height: 50px;
   border-radius: 3px;
   background: #c97ce5 ;
   border: 0px;
   font-size: 20px;
   color: #fff;
   font-family: Arial;
}

.sp_book_btn{
   width: 350px;
   height: 55px;
   border-radius: 3px;
   background: #c97ce5 ;
   border: 0px;
   font-size: 20px;
   color: #fff;
   font-family: Arial;
}

/* end of boxes section */

/* begin of modal section */

.modal-footer{
  display: none;
}

.modal-header{
  border: 0px;
}

#modal1 .modal-dialog{
  max-width: 1050px;
  margin-top: 11%;
  border: none;
}
#modal1 .modal-dialog h1{
  color: #c97ce5;
  font-size: 30px;
  font-family: Arial;
  font-weight: bold;
  text-align: center;
}
#modal1 .modal-dialog h2{
  color: #868686;
  text-align: center;
  font-size: 14px;
  font-family: Arial;
  font-weight: normal;
  margin-bottom: 80px;
}


.close_btn{
    width: 100%;
    height: 55px;
    float: left;
    border-radius: 3px;
    background: #DCDCDC;
    border: 0px;
    font-size: 20px;
    color: #fff;
    font-family: Arial;
}

.content_for_modal{
  margin-top: -20px;

}

/* BEGIN FIRST MODAL CONTENT */

.first_content{

  width: 68%;
  margin: 0 auto;
  padding-bottom: 30px;
}

.first_content input[type="text"]{
  height: 55px;
  border-radius: 5px;
  border: 1px solid #8A8A8A;
  width: 350px;
  max-width: 550px;
  padding-left: 15px;
}

.first_content table{

  width: 100%;
}

.first_content h5{
  color: #484848;
}


.space{
  width: 10px;
}

.spacev2{
  height: 25px;
}

/* END FIRST MODAL CONTENT */
/* BEGIN SECOND MODAL CONTENT */

.second_content{
  width: 68%;
  margin: 0 auto;
  padding-bottom: 30px;
  text-align: center;
}

.second_content table{
  width: 100%;
  margin: 0 auto;
  border: 1px solid #ff0000;
}

.second_content table th{
  width: 49%;
  padding-left: 10px;
  padding-right: 10px;
}

/* END SECOND MODAL CONTENT */
/* BEGIN THIRD MODAL CONTENT */

.third_content{
  width: 68%;
  margin: 0 auto;
  padding-bottom: 30px;
  text-align: center;
}

.third_content h4{
  font-size: 20px;
  color: #484848;
}

.third_content h1{
  font-size: 28px;
  padding-top: 60px;
}

.third_content h5{
  font-size: 20px;
  color: #484848;
  padding-top: 40px;
  padding-bottom: 100px;
}

.sent_img{
  padding-top: 40px;
}

.validation{
  margin-top: 15px;
  padding: 5px;
  color: #e52626;
  font-weight: normal;
}

  #empty_name {
    display: none;
    } 
  #empty_phone {
    display: none;
  }
 #empty_email {
    display: none;
 }

 #letters_phone {
    display: none;
  }


</style>