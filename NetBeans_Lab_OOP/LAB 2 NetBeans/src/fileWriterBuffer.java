/**
 * test file writer and buffered writer
 * @author tanmay
 */
import java.io.*;
import java.util.Scanner;

public class fileWriterBuffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to be added in text file");
        String s = sc.nextLine();
        try {
            File f = new File("E:\\TANMAY\\Java\\NetBeans_Lab_OOP\\buffWrite.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            //bw.write(s);
            System.out.println("Enter string to be added in text file");
            s = s.concat(" "+sc.nextLine());
            bw.write(s);
            bw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
        
}
