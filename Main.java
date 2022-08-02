import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i, toplam = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            i = inp.nextInt();

            if(i%2 == 0 && i%4 == 0){
                toplam = toplam + i;

            }


        }while(i%2 ==0); 

        System.out.print("Toplam: " + toplam);



    }
}