/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanma
 */
import java.io.*;
public class fileReaderBuffer {
    public static void main(String[] args){
        try{
            File f = new File("E:\\TANMAY\\Java\\NetBeans_Lab_OOP\\test.txt");
            FileReader fr  = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine())!= null) {
                System.out.println(s);
            }
            fr.close(); br.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
