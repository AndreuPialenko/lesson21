import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


    CashDesk cd1 = new CashDesk(1);
    CashDesk cd2 = new CashDesk(2);
    CashDesk cd3 = new CashDesk(3);

    List<CashDesk> list = new ArrayList<>();
    java.add(cd1);
    java.add(cd2);
    java.add(cd3);

    for (int i = 1; i < 6; i++){
        Buyer b = new Buyer(list);
    }
    }
}
