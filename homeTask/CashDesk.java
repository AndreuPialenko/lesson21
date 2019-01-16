public class CashDesk {
    private int id;
    private boolean isFree = true;

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void serve(int products){
        //логика обслуживания клиентов
    }
}
