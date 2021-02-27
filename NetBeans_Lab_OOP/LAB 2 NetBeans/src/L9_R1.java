/**
 * Count and display number of characters, words, lines, and vowels in a String 
 */
import java.util.Scanner;

public class L9_R1 {    
    public static void main(String[] args) {    
        Scanner sc = new Scanner (System.in)   ;
        //Counter variable to store the count of vowels and consonant    
        int vCount=0, cCount=0, miscCount=0, spaceCount=0, charCount=0, lineCount=0; 
        String str = new String();
        String s = new String();
            
        System.out.println("Enter a string: ");
        // Taking string as user input from user
        // Press Enter twice to quit taking input
        while(true){
            str=sc.nextLine();
            if(str.length()==0)
                break;
            s=s.concat("\n");
            s=s.concat(str);
        }  
            
        //Converting entire string to lower case to reduce the comparisons    
        s = s.toLowerCase();    
            
        for(int i = 0; i < s.length(); i++) {    
            //Checks whether character is a vowel    
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;
                //Increments the character counter 
                charCount++;
            }    
            //Checks whether a character is a consonant    
            else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;
                //Increments the character counter 
                charCount++;
            }
            else if (s.charAt(i)==' '){
                spaceCount++;
                // character counter is not initialised when space is encountered
            }
            else if (s.charAt(i) == '\n'){
                //Increments the line counter 
                lineCount++;
            }
            else {
                System.out.println("Character "+str.charAt(i)+" does not fall in the English alphabet");
                miscCount++;
                //Increments the character counter 
                charCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);
        System.out.println("Total number of characters: "+charCount);
        System.out.println("Total number of words: "+(spaceCount+1));
        System.out.println("Total number of lines: "+lineCount);
    }    
}

        
