public class ControleRemoto {

    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentaVolume(){
        tv.aumentaVolume();
    }

    public void abaixaVolume(){
        tv.diminuiVolume();
    }

    public void aumentaCanal(){
        tv.aumentaCanal();
    }

    public void diminuiCanal(){
        tv.diminuiCanal();
    }

    public void defineCanal(int canal){
        tv.setCanal(canal);
    }

    public String mostraSettings (){
        return tv.toString();
    }


}
