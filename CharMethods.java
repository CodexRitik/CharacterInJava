import java.util.Scanner;

/*
The Character class offers a number of useful class (i.e., static) methods
for manipulating characters. You can create a Character object with the
Character constructor:
Character chars = new Character();
------------------------------------
#Character Methods In Java
1.isLetter()
Determines whether the specified char value is a letter.
2.isDigit()
Determines whether the specified char value is a digit.
3.isWhitespace()
Determines whether the specified char value is white space.
4.isUpperCase()
Determines whether the specified char value is uppercase.
5.isLowerCase()
Determines whether the specified char value is lowercase.
6.toUpperCase()
Returns the uppercase form of the specified char value.
7.toLowerCase()
Returns the lowercase form of the specified char value.
8.toString()
Returns a String object representing the specified character value that is, a one-character string.
 */
public class CharMethods {
    public static void main(String[] args) {
        char ch = 'a';//Char variable
        char[] charss = {'s','f',' ','f'};//Character Array
        //Here we will implement all character method using a simple program
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = scan.nextLine();
        char[] chars = str.toCharArray();//it will convert String into Char Array
        for (char i : chars) {
            if(Character.isLetter(i)){
                System.out.println("This is a Letter\s:"+i);
            }
            if(Character.isDigit(i)){
                System.out.println("This is a Digit\s:"+i);
            }
            if(Character.isWhitespace(i)){
                System.out.println("it is a Whitespace\s"+i);
            }
            if(Character.isUpperCase(i)){
                System.out.println("It is in UpperCase\s:"+i);
                System.out.println("Convert into Lowercase\s:"+Character.toLowerCase(i));
            }
            if(Character.isLowerCase(i)){
                System.out.println("It is in LowerCase\s:"+i);
                System.out.println("Convert into UpperCase\s:"+Character.toUpperCase(i));
            }
        }
        //toString() Method:
        System.out.println("toString() :"+Character.toString(ch));
    }
}
