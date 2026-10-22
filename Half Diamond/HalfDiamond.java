public class MyProgram
{
    public static void main(String[] args)
    {
        
        int istek=11
        ;
        //First prints 3 of them Midpoint 2
        //then 5 of them Midpoint 3
        //then 7 of them Midpoint 4
        // then 9 of them Midpoint 5
        
        
    
        int count=1;
        int orta=1;
        int zeroer=0;
        int oo=istek-1;
        for (int ab=0;ab<=oo;ab++){
                System.out.print(" ");
                }
        while (istek >=orta){
            count=1;
            while (orta>count){
                int a=istek-orta;
                if (zeroer==0){
                for (int z=0;z<=a;z++){
                System.out.print(" ");
                zeroer++;
                }
                }
                System.out.print(count);
                count++;
                
            }
            if (orta==count){
                    while (count>0){
                        System.out.print(count);
                        count--;
                
            }
                }
            zeroer=0;
            orta++;
            System.out.println();
        }
    }
                
}
