import java.util.Scanner;

public class Mainclass
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        
        
        System.out.print("Month : ");
        int month = scan.nextInt();
        
        System.out.print("Date  : ");
        int date = scan.nextInt();
        
        System.out.print("Year  : ");
        int year = scan.nextInt();
        
        String monthname = " ";
        
        switch (month) {
            
        case 1: 
        monthname = "January";
        break;
        
        case 2: 
        monthname = "February";
        break;
        
        case 3: 
        monthname = "March";
        break;
        
        case 4: 
        monthname = "April";
        break;
        
        case 5: 
        monthname = "May";
        break;
        
        case 6: 
        monthname = "June";
        break;
        
        case 7: 
        monthname = "July";
        break;
        
        case 8: 
        monthname = "August";
        break;
        
        case 9: 
        monthname = "September";
        break;
        
        case 10: 
        monthname = "October";
        break;
        
        case 11: 
        monthname = "November";
        break;
        
        case 12: 
        monthname = "December";
        break;
        
        default :
        
        System.out.println("Month is invalid ");
        
        
        
        }
        System.out.println (monthname + " " + date + ", " + year );
        
        }
        }
