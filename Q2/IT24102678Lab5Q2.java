import java.util.Scanner;
public class IT24102678Lab5Q2
{
    
    public static void main(String[]args)
    {
     Scanner scanner=new Scanner(System.in);
     String price="";
     System.out.println("Enter the number of new members");
     int membersNo=scanner.nextInt();

     if(membersNo<0){

     
     System.out.print("Input must bea no zero or greater");


     }
     else{
     
     switch(membersNo){

        case 0:
            System.out.println("No Price");
            break;
        case 1:
            price="Pen";
            break;
        case 2:
            price="Umbrella";
            break;
        case 3:
            price="Bag";
            break;
        case 4:
            price="Travelling Chair";
            break;
        default:
            price="Head set";
            break;
        
    
        
     }
    if (membersNo!=0){
        System.out.print("The price is "+ price);
    }
     
     }
    }
}
