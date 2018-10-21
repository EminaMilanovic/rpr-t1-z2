package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int x){
        int suma=0;
        int r=x;
        do{
            int cifra=r%10;
            suma+=cifra;
            r=r/10;

        }while(r!=0);
        return suma;
    }
    public static void main(String[] args) {
        // write your code here
        System.out.printf("Unesite broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.printf("Brojevi izmedju 1 i %d koji su djeljivi sa sumom svojih cifara su: \n",n);
        for(int i=1;i<n;i++){
            if(i%sumaCifara(i)==0)  System.out.printf("%d ",i);
        }
    }
}

