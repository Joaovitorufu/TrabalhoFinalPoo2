public class PrintVIsitor implements Visitor{


    @Override
    public void visit(Carro c) {
        System.out.println("Dados do carro:\n"+c.getModelo()+" "+c.getCor()+" "+c.getQtdDePortas()+"portas\nPlaca:"+c.getPlaca()+"\nProprietario:"+c.getProprietario()+"\nVaga:"+c.getIdVaga());
    }

    @Override
    public void visit(GrandePorte g) {
        System.out.println("Dados do Veiculo de Grande Porte:\n"+g.getModelo()+" "+g.getCor()+" "+g.getQtdLugares()+"lugares\nPlaca:"+g.getPlaca()+"\nProprietario:"+g.getProprietario()+"\nVaga:"+g.getIdVaga());
        //coloca aqui os dados que quer printar
        g.getQtdLugares();

    }

    @Override
    public void visit(Motocicleta m) {
        System.out.println("Dados do carro:\n"+m.getModelo()+" "+m.getCor()+"com"+m.getQtdCapacetes()+"capacetes\nPlaca:" +m.getPlaca()+"\nProprietario:"+m.getProprietario()+"\nVaga:"+m.getIdVaga());
        //coloca aqui os dados que quer printar

    }
}
