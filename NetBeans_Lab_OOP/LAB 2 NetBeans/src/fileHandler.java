/**
 * File handling program
 */
import java.io.*;
import java.util.Scanner;

public class fileHandler {
    public static void main(String[] args){
        try{
            File f = new File("E:\\TANMAY\\Java\\NetBeans_Lab_OOP\\test.txt");
            FileInputStream fIn =  new FileInputStream(f);
            FileOutputStream fOut = new FileOutputStream(f);
            System.out.println("Enter string to write in file: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            boolean eoi = false;
            for(int i=0; i<s.length(); i++){
                if (s.charAt(i)=='\n')
                    break;
                else{
                    fOut.write(s.charAt(i));
                }
                
            }
            boolean eof = false;
            int count = 0;
            while (!eof){
                int i = fIn.read();
                System.out.print((char)i);
                if (i==-1)
                    eof = true;
                else count++;
            }
            fIn.close();
            System.out.println("\nTotal number of files read from file test.txt are "+count);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
