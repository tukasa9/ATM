//口座クラス

public class Transfer {
    private int money;//残高
    private int num;//口座番号

    public Transfer(int z){
        money = z;
    }

    public void setNum(int n){
        num = n;
    }

    public int getMoney(){
        return money;
    }
    
    public int getNum(){
        return num;
    }

    public void show(){
        System.out.println("口座番号："+num+"   残高："+ money+"円");
    }

    public boolean check(int num){
        if(num>money) return false;
        else return true;
    }

    public void minus(int m){
        money -= m;
    }

    public void plus(int m){
        money += m;
    }

    
}
