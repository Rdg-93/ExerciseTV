public class Main {
    public static void main(String[] args){

        Televisao tv = new Televisao();
        tv.setCanal(5);
        ControleRemoto controle = new ControleRemoto(tv);
        controle.defineCanal(7);
        controle.aumentaVolume();
        controle.aumentaVolume();
        System.out.println(controle.mostraSettings());
        controle.abaixaVolume();
        controle.diminuiCanal();
        System.out.println(controle.mostraSettings());


    }
}
