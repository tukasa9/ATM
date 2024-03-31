//振込用紙クラス

import java.util.Scanner;
import java.util.InputMismatchException;

public class Transfer_paper {
    private int source;//振込元口座番号
    private int destination;//振込先口座番号
    private int money;//振込金額
    Scanner scan = new Scanner(System.in);

    public void inputSource() {
        while(true){
            try{
                System.out.print("振込元口座番号＞ ");
                source = scan.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("「数値を入力してください」");
                System.out.println();
                scan.next();
            }
        } 
        
    }

    public void inputDestination() {
        while(true){
            try{
                System.out.print("振込先口座番号＞ ");
                destination = scan.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("「数値を入力してください」");
                System.out.println();
                scan.next();
            }
        }
    }

    public void inputMoney() {
        while(true){
            try{
                System.out.print("振込金額＞ ");
                money = scan.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("「数値を入力してください」");
                System.out.println();
                scan.next();
            }
        }
    }

    
    public int getSource(){
        return source;
    }

    public int getDestination(){
        return destination;
    }
    
    public int getMoney(){
        return money;
    }
}
