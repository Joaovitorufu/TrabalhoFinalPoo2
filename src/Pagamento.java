import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pagamento {
    Comprovante comprovante;
    double taxaMinima;
    double horaAdicional;

    public Pagamento(Comprovante comprovante) {
        this.comprovante = comprovante;
        this.taxaMinima = 10.0;
        this.horaAdicional = 2.5;
    }

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

}
