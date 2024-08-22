import java.util.Scanner;

public class nogame {
    public static void main(String[] args) {
        int randomno = (int)(Math.random()*100);

        Scanner sc = new Scanner(System.in);
        int userno;
        do{
            System.out.println("Enter the no:");
            userno = sc.nextInt();
            if (userno == randomno){
                System.out.println("Woooooh!! You won");
                break;
            }else if (userno <= randomno ){
                    System.out.println("Enter big no");
            }else{
                System.out.println("Enter small no");
            }
        }while(userno >= 0);
    }
}
