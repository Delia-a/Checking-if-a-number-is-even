import java.util.Scanner;
public class Main1
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //Проверка парности числа.
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        
        switch(broj%2){
            case 0:
                System.out.println("Broj je paran");
                break;
            case 1:
                System.out.println("Broj je ne paran");
                break;
        }
    }
}
