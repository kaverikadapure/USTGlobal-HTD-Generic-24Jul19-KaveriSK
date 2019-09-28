import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  smUsers: any[]=[];

  constructor(private http : HttpClient) { }

  getData() {
    this.http.get(`https://jsonplaceholder.typicode.com/users`).pipe(map(resdata =>{
    let usersArray = [];
    for(let key in resdata){
      usersArray.push({...resdata[key], id:key});
        console.log(usersArray);
    }
    return usersArray;
    } )).subscribe(data =>{
      this.smUsers = data;
  }, err => {
    console.log(err);
  });
}
}
