package abstractClases;

public abstract class GameCalculator {
    // abstract classlar asla new lenemez
    public abstract void hesapla();
    // abtract metohd olmak zorunda değil
    public final  void gameOver() {
        System.out.println(" Oyun bitti ");
    }
}
