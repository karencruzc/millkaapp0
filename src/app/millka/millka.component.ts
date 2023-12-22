import { Component } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-millka',
  templateUrl: './millka.component.html',
  styleUrls: ['./millka.component.css']
})
export class MillkaComponent {
  alumno: any= {
    id: '',
    nombre: '',
    curso1:'',
    curso2:'',
    edad:''
 } 
  constructor(private http: HttpClient){
  
  }
  ngOnInit(): void {
    this.getAlumno();
    
  }
  getAlumno(){
    this.http.get('http://localhost:9560/alumno/get-alumno').subscribe(
      data=>{
        this.alumno=data;
        console.log(this.alumno)
      }
    )

  }

}
