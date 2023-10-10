/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan3;
    import java.io.BufferedWriter;
    import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.Scanner;
/**
 *
 * @author user
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Manajemen File");
        System.out.println("1. Buat File");
        System.out.println("2. Ubah Namja File");
        System.out.println("3. Hapus File");
        System.out.println("4. Keluar");
        System.out.println("=======================");
        System.out.println("Masukkan Perintah : ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        try{
        if (pilihan == 1){
            System.out.println("Buat Nama File Baru : ");
            String namafile = sc.nextLine();
            File filenya = new File(namafile + ".txt");
            FileWriter writer = null;
            writer = new FileWriter(filenya);
            BufferedWriter bw = new BufferedWriter(writer);
            System.out.println("Isi File : ");
            bw.write(sc.nextLine());
            bw.close();
            System.out.println("File Berhasil Dibuat");
        }
        else if (pilihan == 2){
            System.out.println("Nama File yang akan diubah : ");
            String renamefile = sc.nextLine();
            File filenyarename = new File(renamefile + ".txt");
            System.out.println("Nama File yang baru : ");
            String renamedone = sc.nextLine();
            File rename = new File(renamedone + ".txt");
            boolean flag = filenyarename.renameTo(rename);
            if (flag == true){
                System.out.println("Nama File berhasil diubah");
            }
            else{
                System.out.println("File tidak ditemukan");
            }
        }
        else if (pilihan == 3){
            System.out.println("Nama File yang akan dihapus : ");
            String deletefile = sc.nextLine();
            File filenyadelete = new File(deletefile + ".txt");
            filenyadelete.delete();
            System.out.println("File berhasil dihapus");
        }
        else if (pilihan == 4){
            System.out.println("Jumpa Sampai!");
        }
    }
        catch (IOException ex){
                ex.printStackTrace();
                }
    }
}