public class DoubleSecondDigit extends Thread {

    public int sum;
    public String digits;

    @Override
    public void run() {
        int temp = 0;
        this.sum = 0;
        for (int i = 0; i < digits.length(); i = i + 2) {
            int changingDigit = Character.getNumericValue(this.digits.toString().charAt(i));
            temp = changingDigit * 2;
            
            if (temp > 9) {
                int firstDigitTemp = temp / 10;
                int secondDigitTemp = temp % 10;
                
                sum += firstDigitTemp;
                sum += secondDigitTemp;
            }
            else {
                sum += temp;
            }
        } 
    }

    public int getSum() {
        return this.sum;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }
}

