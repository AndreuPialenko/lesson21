import java.util.List;

public class Buyer extends Thread{

    int products = 5;
    list<CashDesk> cashDesks;

    public Buyer(List<CashDesk> cashDeskList){
        cashDesks = cashDeskList;
    }

    public void run (){
        while (products > 0){
            for (cashDesk cd: cashDesks){
                if(cd.isfree){
                    products = cd.serve():
                }
            }
        }
    }
}
