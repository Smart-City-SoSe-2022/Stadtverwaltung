import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import School from '../views/school/School.vue'
import SchoolArea from '../views/school/SchoolArea.vue'
import SchoolQueue from '../views/school/SchoolQueue.vue'
import OfficeHour from '../views/school/OfficeHour.vue'
import Club from '../views/club/Club.vue'
import Requirement from '../views/club/Requirement.vue'
import ClubArea from '../views/club/ClubArea.vue'
import ClubQueue from '../views/club/ClubQueue.vue'
import Requests from '../views/Requests.vue'


const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/anfragen',
    name: 'anfragen',
    component: Requests
  },
  {
    path: '/verein',
    name: 'verein',
    component: Club
  },
  {
    path: '/voraussetzungen',
    name: 'voraussetzungen',
    component: Requirement
  },
  {
    path: '/verein-umgebung',
    name: 'verein-umgebung',
    component: ClubArea
  },
  {
    path: '/warteliste-verein',
    name: 'warteliste-verein',
    component: ClubQueue
  },
  {
    path: '/schule',
    name: 'schule',
    component: School
  },
  {
    path: '/sprechstunden',
    name: 'sprechstunden',
    component: OfficeHour
  },
  {
    path: '/schule-umgebung',
    name: 'schule-umgebung',
    component: SchoolArea
  },
  {
    path: '/warteliste-schule',
    name: 'warteliste-schule',
    component: SchoolQueue
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
