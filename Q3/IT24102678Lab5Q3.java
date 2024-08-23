import java.util.Scanner;
public class IT24102678Lab5Q3 {
    private static final double ROOMCHARGES=48000.0;
        private static final int MAXDAY=31;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter start date");
        int startDate=scanner.nextInt();

        System.out.print("Enter end date");
        int endDate=scanner.nextInt();

        if(startDate<1||startDate>MAXDAY||endDate<1||endDate>MAXDAY){
            System.out.println("Error:Days must be between 1 and 31");
            return;
        }
        if(startDate>=endDate){

            System.out.println("Start date must be less than the end date");
            return;
        }
        int days=endDate-startDate;
        double discount=0.0;
        if(days>=5){
            discount=20.0;
                  
        }
        else if(days>=3){
            discount=10.0;


        }
        double totalAmount=days*ROOMCHARGES;
        double discountAmount=totalAmount*discount/100;
        double AmountTopay=totalAmount-discountAmount;

        System.out.println("Room charge per day: Rs. "+ ROOMCHARGES);
        System.out.println("Number of days reserved " +days);
        System.out.println("Total amount to be paid " + AmountTopay);





         
    }
    
}
