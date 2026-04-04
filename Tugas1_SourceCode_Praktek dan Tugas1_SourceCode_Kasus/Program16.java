//Nama: Arya Bintang Kusuma Wijaya
//NIM: 13020240263
//Waktu Pengerjaan: 4/5/2026 01:00

public class Program16 {
    public static void main(String[] args) {
        boolean Bool1, Bool2, TF ;  
        int i,j, hsl ; 
        float x,y,res;
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program"); 
        
        Bool1 = true;
        Bool2 = false;

        TF = Bool1 && Bool2;
        System.out.println("AND  : " + TF);
        TF = Bool1 || Bool2;
        System.out.println("OR   : " + TF);
        TF = !Bool1;
        System.out.println("NOT  : " + TF);
        TF = Bool1 ^ Bool2;
        System.out.println("XOR  : " + TF + "\n");

        i = 5;
        j = 2;

        hsl = i + j;
        System.out.println("i + j = " + hsl);
        hsl = i - j;
        System.out.println("i - j = " + hsl);
        hsl = i / j;
        System.out.println("i / j = " + hsl);
        hsl = i * j;
        System.out.println("i * j = " + hsl);
        hsl = i % j;
        System.out.println("i % j = " + hsl + "\n");

        x = 5;
        y = 5;

        res = x + y;
        System.out.println("x + y = " + res);
        res = x - y;
        System.out.println("x - y = " + res);
        res = x / y;
        System.out.println("x / y = " + res);
        res = x * y;
        System.out.println("x * y = " + res + "\n");

        System.out.println("i == j : " + (i == j));
        System.out.println("i != j : " + (i != j));
        System.out.println("i < j  : " + (i < j));
        System.out.println("i > j  : " + (i > j));
        System.out.println("i <= j : " + (i <= j));
        System.out.println("i >= j : " + (i >= j) + "\n");

        System.out.println("x != y : " + (x != y));
        System.out.println("x < y  : " + (x < y));
        System.out.println("x > y  : " + (x > y));
        System.out.println("x <= y : " + (x <= y)); 
        System.out.println("x >= y : " + (x >= y)); 
    } 
} 