public class ValiateFirstDigit extends Thread {

    public int firstDigit;

    @Override
    public void run() {
        switch (this.firstDigit) {
            case 3:
                //American Express
                //..
                break;
            case 6:
                //Discover
                //..
                break;
            case 5:
                //Master
                //..
                break;
            case 4:
                //Visa
                //..
            default:
                //invalid
        }
    }

    public void setFirstDigit(int firstDigit) {
        this.firstDigit = firstDigit;
    }
}

