//Nama: Arya Bintang Kusuma Wijaya
//NIM: 13020240263
//Waktu Pengerjaan: 4/5/2026 01:00

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;
import javax.swing.JOptionPane;

public class Program5 {
    public static void main(String[] args) throws IOException {
        char cc; int bil;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");
        cc =dataIn.readLine().charAt(0);

        System.out.print("baca 1 bilangan : ");
        bil =Integer.parseInt(datAIn.readLine());
    
        Scanner input = new Scanner(System.in);

        System.out.print("baca string scanner : ");
        String str = input.nextLine();

        System.out.print("baca int scanner : ");
        int x = input.nextInt();

        Console cons = System.console();

        String con = cons.readLine("baca string console : ");
        int y = Integer.parseInt(cons.readLine("baca int console : "));

        String z = JOptionPane.showInputDialog("baca String JOption : ");
        int v = Integer.parseInt(JOptionPane.showInputDialog("baca int JOption : "));

        System.out.print (cc +"\n" +bil+"\n" +str+"\n" +x+"\n"+con+"\n"+y+"\n"+z+"\n"+v+"\n");
        System.out.print ("bye \n");
    }
}