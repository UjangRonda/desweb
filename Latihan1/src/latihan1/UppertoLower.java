/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
/**
 *
 * @author user
 */
public class UppertoLower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File filenya = new File("input.txt");
        FileReader reader = null;
        FileWriter writer = null;
        try {
            String huruf;
            reader = new FileReader(filenya);
            BufferedReader br = new BufferedReader(reader);
            while ((huruf = br.readLine()) != null) {
                if (huruf.equals(huruf.toUpperCase())){
                    System.out.println(huruf.toLowerCase());
                    writer = new FileWriter(filenya);
                    BufferedWriter bw = new BufferedWriter(writer);
                    bw.write(huruf.toLowerCase());
                    bw.close();
                }
                else if (huruf.equals(huruf.toLowerCase())){
                    System.out.println(huruf.toUpperCase());
                    writer = new FileWriter(filenya);
                    BufferedWriter bw = new BufferedWriter(writer);
                    bw.write(huruf.toUpperCase());
                    bw.close();
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
