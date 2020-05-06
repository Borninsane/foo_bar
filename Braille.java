import java.util.*;

class Braille
{
public static void main(String args[])
{

Scanner sc=new Scanner (System.in);

System.out.println("Enter The String");
String s=sc.nextLine();


System.out.println(Braille.solution(s));

}



static String solution(String s)
{

String br[] = {"100000","110000","100100","100110","100010","110100","110110","110010","010100","010110","101000","111000","101100","101110","101010","111100","111110","111010","011100","011110","101001","111001","010111","101101","101111","101011"};

String s1="";

for(int i=0;i<s.length();i++)
{
char x=s.charAt(i);

if(x==' ')
s1+="000000";

else
{
if(Character.isLowerCase(x))
s1+=br[(int)x-97];
else if(Character.isUpperCase(x))
s1+="000001"+br[(int)x-65];
}
}

return s1;
}
}
