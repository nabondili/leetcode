import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
//        BufferedReader br =new InputStream(sc.nextLine());
        String s[]=sc.nextLine().toLowerCase().split(",");
        System.out.println(s[0]);
    }
}
