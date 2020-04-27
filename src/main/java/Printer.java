public class Printer {

    private int numberOfSheets = 100;

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public void printCopies(int pages, int copies) {
        int pagesToPrint = pages * copies;
        this.setNumberOfSheets(this.getNumberOfSheets() - pagesToPrint);
    }
}
