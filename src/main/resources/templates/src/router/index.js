import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Bookings from '@/components/Bookings'
import Dashboard from '@/components/Dashboard'
import Calendar from '@/components/Calendar'
import Profile from '@/components/Profile'
import Login from '@/components/Login'
import Login2 from '@/components/Login2'
import Login3 from '@/components/Login3'
import Add_service from '@/components/Add_service'
import Dashboard_v1 from '@/components/Dashboard_v1'
import Dashboard_v2 from '@/components/Dashboard_v2'
import make_booking from '@/components/make_booking'
import Vuelidate from 'vuelidate'

Vue.use(Vuelidate)
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },{
      path: '/bookings',
      name: 'Bookings',
      component: Bookings
    },{
    	path:'/dashboard',
    	name: 'Dashboard',
    	component: Dashboard
    },{
    	path:'/calendar',
    	name: 'Calendar',
    	component: Calendar
    },{
    	path:'/profile',
    	name: 'Profile',
    	component: Profile
    },{
      path:'/login',
      name: 'Login',
      component: Login
    },{
      path:'/login2',
      name: 'Login2',
      component: Login2
    },{
      path:'/login3',
      name: 'Login3',
      component: Login3
    },{
      path: '/make_booking',
      name: 'make_booking',
      component: make_booking
    },{
     path: '/add_service',
     name: 'Add_service',
     component: Add_service
   },
   {
     path: '/dashboard_v1',
     name: 'Dashboard_v1',
     component: Dashboard_v1
   },
   {
     path: '/dashboard_v2',
     name: 'Dashboard_v2',
     component: Dashboard_v2
   }
  ],
  mode: 'history'
})
