class Palindrome{
    public static void main(String[] args) {
        if(checkNumber(90089)){
            System.out.println("Posiible");
        }else{
            System.out.println("Impossible");

        }
    }
    //Reverse number
    public static int reverse(int number){

        int reverse = 0;

        while(number != 0){
            
            int endDigit = number % 10;
            reverse = reverse * 10 + endDigit;
            number = number / 10;
        }
        return reverse;
    }
    /**
     * Check if number is Palindrome (Compare it with its reverse)
     */
    public static boolean isPalindrome(int first, int second){

        if(first == second) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Check if number can be or is a palindrome
     */
    public static boolean checkNumber(int number){

        while(number < 1000000){
            
            if(isPalindrome(number, reverse(number))){
                return true;
            }else{
                number = number + reverse(number);
            }
        }
        return false;
    }
}