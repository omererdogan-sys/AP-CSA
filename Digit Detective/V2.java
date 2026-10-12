//V3 may be upcoming
import java.util.Scanner;

public class MyProgram 
{
    public static void main(String[] args)
    {
        //3 numbers, min 4 to max 8 digists
        //Sayıların içinde kaç tek kaç çift sayı var
        //Teklerin toplamını hesaplıycak
        //dublelerin hesaplıycak sanki
        //tekler toplamı 10'dan fazlaysa jakpot yazcak 1424
        
        //biggest
        //Which sum more
        //is it palendyrome
        
        //tek haneye indirme
        //soldan sağa artıyorsa increasing
        //remove even numbers from it
        //check if armstrong number(combine each digits cube to see if equaş to it)
        Scanner input = new Scanner(System.in);
        System.out.println("Digits:");
        int digits=input.nextInt();
        String digitsStr=String.valueOf(digits);
        int reverse=0;
        
        int oddSum=0;
        int evenSum=0;
        int oddCount=0;
        int evenCount=0;
        int i=0;
        int maxKnown=0;
        int prev=0;
        int prevNum=0;
        
        while (i<digitArray.length){
            String digitUse=String.parseInt(digitsStr.substring(i,i+1));
            int digitInt= Integer.valueOf(digitUse);
            if (digitArrayInt%2==0){
                evenSum+=digitArrayInt;
                evenCount++;
            }
            else if (digitArrayInt%2==1){
                oddSum+=digitArrayInt;
                oddCount++;
            }
            
            i++;
            if (maxKnown<digitArrayInt){
                maxKnown=digitArrayInt;
            }
            if (prev<digitInt){
            int prevNum++1;
        }
    
        }
        if (prevNum==Integer.valueOf(digits).length()){
            System.out.println("Increasing")
        }
        if (oddSum>10){
            System.out.println("Printed");
        }
        if (oddSum>evenSum){
            System.out.println("Odd Sum bigger");
        }
        else if (oddSum>evenSum){
            System.out.println("Even Sum bigger");
        }
        if (oddCount>evenCount){
            System.out.println("Odd heavy");
        }
        else if (oddCount>evenCount){
            System.out.println("Even heavy");
        }
        
        
        
        System.out.println(oddSum);
        System.out.println(evenSum);
        System.out.println(oddCount);
        System.out.println(evenCount);
        System.out.println(maxKnown);
         //biggest
        //Which sum more
        //is it palendyrome
        
        //tek haneye indirme
        //soldan sağa artıyorsa increasing
        //remove even numbers from it
        //check if armstrong number(combine each digits cube to see if equaş to it)
        
        length=digitsStr.length()
        
        //for 4 members
        if (length==4){
        String member=digitsStr.substring(length)+digitsStr.substring(length-1,length)+digitsStr.substring(length-2,length-1)+digitsStr.substring(length-3,length-4)
        }//5
        if (length==5){
        String member=digitsStr.substring(length)+digitsStr.substring(length-1,length)+digitsStr.substring(length-2,length-1)+digitsStr.substring(length-3,length-4)+digitsStr.substring(length-4,length-5)
        }//6
        if (length==6){
       String member=digitsStr.substring(length)+digitsStr.substring(length-1,length)+digitsStr.substring(length-2,length-1)+digitsStr.substring(length-3,length-4)+digitsStr.substring(length-4,length-5)+digitsStr.substring(length-5,length-6)
    }//7
        if (length==7){
        String member=digitsStr.substring(length)+digitsStr.substring(length-1,length)+digitsStr.substring(length-2,length-1)+digitsStr.substring(length-3,length-4)+digitsStr.substring(length-4,length-5)+digitsStr.substring(length-5,length-6)+digitsStr.substring(length-6,length-7)
        }//8
        if (length==8){
        String member=digitsStr.substring(length)+digitsStr.substring(length-1,length)+digitsStr.substring(length-2,length-1)+digitsStr.substring(length-3,length-4)+digitsStr.substring(length-4,length-5)+digitsStr.substring(length-5,length-6)+digitsStr.substring(length-6,length-7)+digitsStr.substring(length-7,length-8)
}
        System.out.println(member)
        int memberInt=Integer.valueOf(member)
        if (memberInt==digits){
            System.out.println("palindrome")
        }
}
}



//Add 5. digitalRoot – Add digits until one digit is left
 //  482917 → 4   1350 → 9   2468 → 2

//6. isIncreasing – Each digit bigger than the one before?
//   2468 → true   1350 → false   1123 → false

//7. removeEvens – Remove even digits, keep order
//  482917 → 917   1350 → 135   12321 → 131

//8. isArmstrong – Sum of digit^(digit count) == num?
//   153 → true   9474 → true   482917 → false
