public class Main {
    public static void main(String[] args){
        System.out.println("10 000 at 2% interest="+calculateIntrest(10000.00,2.0));
        System.out.println("10 000 at 2% interest="+calculateIntrest(10000.00,3.0));
        System.out.println("10 000 at 2% interest="+calculateIntrest(10000.00,4.0));
        for(int i=0; i<5;i++){
            System.out.println("Loop"+i+"Hello");

        }
        for (int i=2; i<9;i++);

    }
    public static double calculateIntrest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

}
