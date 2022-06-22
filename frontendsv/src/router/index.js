import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Club from '../views/club/Club.vue'
import School from '../views/school/School.vue'
import Requirement from '../views/club/Requirement.vue'
import ClubArea from '../views/club/ClubArea.vue'
import ClubQueue from '../views/club/ClubQueue.vue'
import SchoolArea from '../views/school/SchoolArea.vue'
import SchoolQueue from '../views/school/SchoolQueue.vue'
import OfficeHour from '../views/school/OfficeHour.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
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
    path: '/club-umgebung',
    name: 'club-umgebung',
    component: ClubArea
  },
  {
    path: '/warteliste-club',
    name: 'warteliste-club',
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
    path: '/warteschlange-schule',
    name: 'warteschlange-schule',
    component: SchoolQueue
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
