public class WaterBottle {

    private int volume;
    private int gulp;

    public WaterBottle(int volume){
        this.volume = volume;
        this.gulp = 10;
    }

    public void drink() {
        this.volume -= this.gulp;
    }

    public int getVolume() {
        return this.volume;
    }

    public int empty() {
        return this.volume = 0;
    }

    public int fill() {
        return this.volume = 100;
    }
}
