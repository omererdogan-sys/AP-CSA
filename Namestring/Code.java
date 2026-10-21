public class MyProgram
{
    public static void main(String[] args)
    {
        String name = "Ömer";
String surname = "Erdoğan";

int lengthName= name.length();
int lengthSurname= surname.length();
int lenAlt=lengthSurname;
int reference=0;
int ref2=0;

while (lengthName!=(reference-1)){
while (ref2!=reference){
System.out.print(name.substring(reference-1,reference));
ref2++;
}

reference++;
ref2=0;
System.out.println("");

}
reference=lengthSurname;

int ref=0;
System.out.println("");



while (lengthSurname!=(reference-1)){
    ref2=0;
while (reference!=ref2){
System.out.print(surname.substring(ref,ref+1));
ref2++;
}
ref++;

reference--;

System.out.println("");

}
int helper=0
int vowelCount=0;
int nonvowel=0;

String changedsurame=""
String changedName=""
while (helper!=lengthName){
    if name.substring(helper,helper+1)=="a" || name.substring(helper,helper+1)=="e" || name.substring(helper,helper+1)=="i" || name.substring(helper,helper+1)=="o" || name.substring(helper,helper+1)=="u"){
        vowelCount++;
        
    }
    else{
        nonvowel++0;
    }
    char takeChar=names.chatAt(helper);
    if (takeChar>="a" && takeChar<="z"){
        smallify=(char)(takeChar-32)
        changedName=+smallify
    }
    else if (takeChar>="A" && takeChar<="Z"){
        largeify=(char)(takeChar+32)
        changedName=+largeify
    }
    char takeChar2=surname.chatAt(helper);
    if (takeChar2>="a" && takeChar2<="z"){
        smallify=(char)(takeChar2-32)
        changedsurname=+smallify
    }
    else if (takeChar2>="A" && takeChar2<="Z"){
        largeify=(char)(takeChar2+32)
        changedsurame=+largeify
    }
}
System.out.println(changedName)
System.out.print(changedsurname)
if (vowelCount==nonvowel){
    System.out.println("WaAW")
}
else if (vowelCount>=nonvowel){
    System.out.println("More vowel")
}
if (vowelCount<=nonvowel){
    System.out.println("More consonant")
}

    }
}

//Upp to low vice versa

//String nameSurname=name+" "+surname;
//int finalLength=nameSurname.length();
//while (finalLength!=0){ 

//Should check all of the ones
//Then check if its not ""
    
//}

//check sesli sessiz

//Sonra 2 sessiz (sessiz daha çok ise)

//Check uppercase lowercase
