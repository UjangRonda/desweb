/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Duplicate;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author user
 */
public class Duplikat {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream is = new FileInputStream("gambarasli.jpg");
        FileOutputStream os = new FileOutputStream("gambarduplikat.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        BufferedInputStream bis = new BufferedInputStream(is);
        int buckle = 0;
        while (buckle!= -1){
            buckle = bis.read();
            bos.write(buckle);
        }
        bis.close();
        bos.close();
        // TODO code application logic here
    }
    
}
