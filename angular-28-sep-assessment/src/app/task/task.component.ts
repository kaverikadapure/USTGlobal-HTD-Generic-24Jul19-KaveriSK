import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  array : any[]=[];

  constructor() { }

  print(form : NgForm) {
    console.log(form.value);
    this.array.push(form.value);
    form.reset(form);
    console.log(this.array);
  }

  deleteData(ar){
    this.array.splice(ar,1);
  }

  ngOnInit() {
  }

}
