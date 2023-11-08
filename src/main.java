public class main {
    public static void main(String args[]){

        Estacionamento estacionamento = new Estacionamento();
        Menu menu = new Menu(estacionamento);
        menu.menuInicial();
    }
}
