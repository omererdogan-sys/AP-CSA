import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        String initial = "ABCDE";
        int index=0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String first = scanner.next(); 
        int length=initial.length();
        long num = scanner.nextLong();
         int runAmount=(int) (num%length);
        if (first.equals("C")){
            for (int i=0;i<=runAmount;i++){
                index++;
            }
            index--;
        }
        else if (first.equals("S")){
            for (int i=0;i<=runAmount;i++){
                index--;
            }
            index++;
        }
        if (index<0){
            while (index<0){
                index+=length;
            }
        }
        else if (index>0){
            index=index%length;
        }
        String printer=initial.substring(index,index+1);
        System.out.println(printer);
    }
}
