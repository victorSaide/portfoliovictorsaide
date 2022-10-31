import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditeducacionComponent } from './components/education/editeducacion.component';
import { NeweducacionComponent } from './components/education/neweducacion.component';
import { EditExperienciaComponent } from './components/experience/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experience/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
//import { EditSkillComponent } from './components/hard-soft-skills/edit-skill.component';
//import { NewSkillComponent } from './components/hard-soft-skills/new-skill.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'nuevaexp', component: NewExperienciaComponent},
  { path: 'editexp/:id', component: EditExperienciaComponent},
  { path: 'nuevaedu', component: NeweducacionComponent},
  { path: 'editedu/:id', component: EditeducacionComponent},
  //{ path: 'newskill', component: NewSkillComponent},
  //{ path: 'editskill/:id', component: EditSkillComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
