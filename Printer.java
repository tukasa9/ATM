//印刷クラス

public class Printer {

    void print(boolean b, int s, int d, int m){
        System.out.println("「印刷します…」");
        System.out.println("=======================");
        System.out.println("振込元口座番号："+s);
        System.out.println("振込先口座番号："+d);

        if(b==false){
            System.out.println("振込エラー");
            System.out.println("=======================");
            System.exit(0);
        }
        else{
            System.out.println("振込金額："+m+"円");
            System.out.println("振込が完了しました");
            System.out.println("=======================");

        }
    }
}
