public class Project {
    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();  
        String digits = "4388576018410707";

        int length = digits.length();
        int[] creditCard = new int[length];

        for (int i = 0; i < length; i++) {
            creditCard[i] = Integer.parseInt(digits.substring(i, i + 1));
        }
        
        int firstDigit = creditCard[0];
        
        
        //I. check between 13 and 19
        ValidateLength check = new ValidateLength();
        check.setLength(length);
        check.start();
        
        
        //II. major industry identifier
        ValiateFirstDigit check2 = new ValiateFirstDigit();
        check2.setFirstDigit(firstDigit);
        check2.start();
        
       
        
        //III. double every second digit
        DoubleSecondDigit doublesd = new DoubleSecondDigit();
        doublesd.setDigits(digits);
        int sum = doublesd.getSum();
        doublesd.start();

        
        //IV. add all odd        
        AddAllOdd addodd = new AddAllOdd();
        addodd.setDigits(digits);
        int oddSum = addodd.getSum();
        addodd.start();
        
        
        //V. Sum parts 3 and 4
        int totalSum = oddSum + sum;
        
        //VI. valid or not
        if (totalSum % 10 == 0) {
            System.out.println("The number " + digits.toString() + " is valid.");
        }
        else {
            System.out.println("The number " + digits.toString() + " is invalid.");
        }

        final long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime));

        // Main thread = new Main();
        // thread.start();
      
    }

}

