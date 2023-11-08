public class PrintVIsitor implements Visitor{


    @Override
    public void visit(Carro c) {
        System.out.println(("Dados do carro"));
        //coloca aqui os dados que quer printar
    }

    @Override
    public void visit(GrandePorte g) {
        System.out.println("Dados do Veiculo de grande porte");
        //coloca aqui os dados que quer printar
        g.getQtdLugares();

    }

    @Override
    public void visit(Motocicleta m) {
        System.out.println("Dados da motocicleta");
        //coloca aqui os dados que quer printar

    }
}
