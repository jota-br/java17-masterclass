public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonnerAmount) {
        int tempAmount = tonnerAmount + this.tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        this.tonerLevel += tonnerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int sheetsOfPaperRequired = (this.duplex) ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += sheetsOfPaperRequired;
        System.out.format("Duplex printer: %b%n", this.duplex);
        return sheetsOfPaperRequired;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
