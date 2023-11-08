import java.util.List;

public class Gerente implements Observer{
    @Override
    public void update(List<Integer> vagasDisponiveis)
    {
        if (vagasDisponiveis.isEmpty()){
            System.out.println("Não há mais vagas disponíveis no estacionamento");
        }
    }
}
