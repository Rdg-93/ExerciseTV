public class Televisao {

    private int volume, canal;

    public int getVolume() {
        return volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void trocaCanal(int canal) {
        this.canal = canal;
    }

    public void aumentaVolume(){
        volume++;
    }

    public void diminuiVolume(){
        volume--;
    }

    public void aumentaCanal() {
        canal++;
    }

    public void diminuiCanal() {
        canal--;
    }

    @Override
    public String toString() {
        return "Televisao {" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
