public class Store {
    private int product = 0;
    private boolean available = false;

    public synchronized void get(){
        while (product < 1){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        product--;

        System.out.println("Покупатель купил один товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }

    public synchronized void put(){
        while (product > 3){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        product++;
        System.out.println("Производитель добавил один товар");
        System.out.println("Товар на складе: " + product);
        notify();
    }
}
