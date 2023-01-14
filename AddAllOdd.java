public class AddAllOdd extends Thread {

    public int oddSum;
    public String digits;

    @Override
    public void run() {
        for (int i = 1; i < digits.length(); i = i + 2) {
            int changingDigit = Character.getNumericValue(digits.toString().charAt(i));
            
            this.oddSum += changingDigit;
        }  
    }

     public int getSum() {
        return this.oddSum;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }
}
