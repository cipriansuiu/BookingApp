<template>
	<div>
		<div >
		  <img src="../assets/booking_logo.png" alt="book" class="book"/>
      <div class="div">
        <form >
          <div class="date">Email address</div>
          <input type="email" name="emailaddres" class="tbox" v-model='email'/>

          <b-btn type="submit" class="book_btn" v-b-modal.modal1>RECOVER</b-btn>
        </form>
      </div>
	</div>
	</div>
</template>

<script>
	export default {
	  name: 'login3',
	  data () {
	    return {
	      email:''
	      
	    }
	  }
	}
</script>

<style>
	
	/*intrebarea*/
	p.text{

	    text-align: center;
	    font-size: 20px;
	    margin-top: 20px;

	}
	
	/* nume email si pass*/
	.date{

	    font-size:20px;
	    margin-top: 25px;
	    margin-bottom: 3px;
	    text-align: left;
	    height: 30px;


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
	    top :90px;

	}
	.book{
    height:270px;
    width:500px;
    position: relative;
	top :45px;

	}
	div{
		text-align: center;
	}

	.submit_button {
		cursor: pointer;
	}

	.book_btn{
   		text-decoration:none;
	   	font-size: 20px;
	    width: 405px;
	    height: 50px;
	    vertical-align: middle;
	    background-color:#c97ce5;
	    color: #fff;
	    border: none;
	    border-radius: 3px;
	    margin-top: 53px;
}

</style>
