public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;

    }

    public void print(int copies) {
        if (this.paper >= copies) {
            this.paper -= copies;
            this.toner -= 1;
        }
    }

    public int getPaper() {
        return this.paper;
    }

    public int refill() {
        return this.paper = 100;
    }

    public int getToner() {
        return this.toner;
    }


}
