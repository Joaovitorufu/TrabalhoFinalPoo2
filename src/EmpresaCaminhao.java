import java.util.List;

public class EmpresaCaminhao implements Observer{
    @Override
    public void update(List<Integer> vagasDisponiveis) {
        for (int vaga : vagasDisponiveis) {
            if (vaga == 1 || vaga == 2 || vaga == 3){
                System.out.println("Notificação para empresa de caminhão: Há vagas disponíveis para estacionar veículos de grande porte");
                return;
            }
            else{
                System.out.println("Notificação para empresa de caminhão: Não existem vagas disponíveis para estacionar veículos de grande porte");
                return;
            }
        }
    }
}
