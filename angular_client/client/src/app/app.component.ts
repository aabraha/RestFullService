import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  title = 'client';
  httpData;

  constructor(private httpClient:HttpClient){
    console.log("constructor");
  }

  ngOnInit() {

    //throw new Error("Method not implemented.");
    console.log("OnInit method");
    this.httpClient.get("http://localhost:9090/api/employees")
    .subscribe(data=>this.httpData = data);

  }
}
