/**
 * Replace an entered word to all repeating characters. 
 */
import java.util.Scanner;

public class L9_R2 {
    public static void main(String args[]){
        int c;
        String string,word;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a string");
        string=s.next();
        
        System.out.println("Enter a word");
        word=s.next();
        char x[]=new char[string.length()];
          
        string.getChars(0, string.length(), x, 0);

          for(char i='a';i<='z';i++){
            c=0;
            for(char letter:x){
                if(letter==i){
                    c++;
                }
            }

             if(c>1){
              string = string.replaceAll(""+i,word);
          }
      }
      System.out.println(string);
    }
}
