package br.com.estacionamento.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pagamento {
    Comprovante comprovante;
    double taxaMinima = 10.0;
    double horaAdicional = 2.5;



    public  double calculaTotal(Comprovante comprovante){
        double total;
        LocalDateTime dataEHoraFinal = LocalDateTime.now();
        LocalDateTime dataEHoraInicial = comprovante.getDataEHora();
        long horas = dataEHoraInicial.until(dataEHoraFinal, ChronoUnit.HOURS);
        if (horas < 1){
            total = taxaMinima;
        }else{
            total = taxaMinima + (horas * horaAdicional);
        }

        //System.out.println(total);
        return total;
    }

    public void realizaPagamento(PagamentoStrategy stratregy){
        //LocalDateTime test = LocalDateTime.of(2023,11,6,10,0);
        //Comprovante comprovante = new Comprovante(1,"palio","aisj12",test,1);
        double total = calculaTotal(comprovante);
        stratregy.pagar(total);
    }


    //test
    /*
    public static void main(String[] args) {
        Pagamento pag = new Pagamento();
        LocalDateTime test = LocalDateTime.of(2023,11,6,10,0);
        Comprovante comprovante = new Comprovante(1,"palio","aisj12",test,1);
        pag.calculaTotal(comprovante);

        PagamentoStrategy strategy = new PagamentoCartaoCredito();
        pag.realizaPagamento(strategy);

    }
*/

}
