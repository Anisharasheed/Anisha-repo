import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FoodListComponent } from './components/food-list/food-list.component';
import { ReviewFormComponent } from './components/review-form/review-form.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  { path: '', component: LoginComponent }, 
  { path: 'home', component: FoodListComponent },  
  { path: 'add-review', component: ReviewFormComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


