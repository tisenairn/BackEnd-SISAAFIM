import { HttpClient } from '@angular/common/http';
// import { HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
// rever a importação para o observable
import { } from 'rxjs/add/operator/toPromise';

@Injectable({
  providedIn: 'root'
})

@Injectable()
export class BicService {

    constructor(private http: HttpClient) { }

    consultar(): Promise<any> {
      return this.http.get('http://localhost:3000/bic')
        .toPromise()
        .then(response => console.log(response));
    }

    adicionar(bic: any): Promise<any> {
      return this.http.post('http://localhost:3000/bic', bic)
        .toPromise()
        .then(response => console.log(response));
    }

    excluir(id: number): Promise<void> {
      return this.http.delete(`http://localhost:3000/bic/${id}`)
        .toPromise()
        .then(() => null);
    }

    atualizar(bic: any): Promise<any> {
      return this.http.put(`http://localhost:3000/bic/${bic.id}`, bic)
        .toPromise()
        .then(response => console.log(response))
        .catch(erro => {
          return Promise.reject(`Erro ao alterar bic ${bic.id}.`);
        });
    }

  }
