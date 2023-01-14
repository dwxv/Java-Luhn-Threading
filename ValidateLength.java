public class ValidateLength extends Thread {

    public int length;

    @Override
    public void run() {
        while (this.length < 13 || this.length > 19) {
            //invalid input
            System.out.println("Invalid Input");
        }    
    }

    public void setLength(int length) {
        this.length = length;
    }
}

