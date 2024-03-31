//受付クラス

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reception {
    boolean zandaka;

    Transfer_paper tp = new Transfer_paper();//振込用紙の作成
    Transfer s = new Transfer(10000); //振込元口座の作成・残高の初期化
    Transfer d = new Transfer(200000); //振込先口座の作成・残高の初期化
    Printer p = new Printer();//印刷の作成
    
    //振込用紙の記入
    public Reception(){
        System.out.println("受付:「いらっしゃいませ」");
        System.out.println("「振込用紙に必要事項をご記入下さい」");

        tp.inputSource();
        tp.inputDestination();         
        tp.inputMoney();
                
        s.setNum(tp.getSource());//振込元口座番号
        d.setNum(tp.getDestination());//振込先口座番号
    }

    //振込金額が残高を超えていないかの確認と引き出し
    public void withdraw(){
        if(s.check(tp.getMoney())==false){
            System.out.println();
            System.out.println("「振込金額が残高を超えています」");
            p.print(false, s.getNum(), d.getNum(), 0);
        }
        else{
            s.show();
            System.out.println("「"+tp.getMoney()+"円引き出します」");
            s.minus(tp.getMoney());
            s.show();
        }
    }   

    //振り込みと印刷
    public void add(){
        d.show();
        System.out.println("「"+tp.getMoney()+"円振り込みます」");
        d.plus(tp.getMoney());
        d.show();

        System.out.println();

        p.print(true, s.getNum(), d.getNum(), tp.getMoney());
    }
}
