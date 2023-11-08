public class PagamentoCartaoCredito implements PagamentoStrategy{
    @Override
    public void pagar(double total) {
        System.out.println("logica para pagar com cartao de credito");
    }
}
