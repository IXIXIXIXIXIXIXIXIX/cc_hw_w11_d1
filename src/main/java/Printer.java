public class Printer {

    private int paperLeft;
    private int tonerVolume;

    public Printer(){
        this.paperLeft = 500;
        this.tonerVolume = 5000;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public boolean print(int pages, int copies){
        int totalPages = pages * copies;

        if(this.paperLeft >= totalPages && this.tonerVolume >= totalPages)
        {
            this.paperLeft -= totalPages;
            this.tonerVolume -= totalPages;
            return true;
        }

        return false;

    }
}
