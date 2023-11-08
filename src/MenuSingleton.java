public class MenuSingleton {
    private static Menu menu;

    public static Menu getInstance(Estacionamento estacionamento){
        if(menu == null){
            menu = new Menu(estacionamento);
        }
        return menu;
    }
}
