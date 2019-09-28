import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsersComponent } from './users/users.component';
import { TaskComponent } from './task/task.component';
import { HomeComponent } from './home/home.component';
import { PgfComponent } from './pgf/pgf.component';


const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot([
    {path:'h', component:HomeComponent},
    {path:'u', component:UsersComponent},
    {path:'t', component:TaskComponent},
    {path:'**', component:PgfComponent}
  ])],
  exports: [RouterModule]
})
export class AppRoutingModule { }
