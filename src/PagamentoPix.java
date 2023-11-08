public class PagamentoPix implements PagamentoStrategy{
    public PagamentoPix() {
    }

    @Override
    public void pagar(double total) {
        System.out.println("Lógica para pagar com Pix");
    }
}
