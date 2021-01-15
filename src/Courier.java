public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse delivered;

    public Courier(int salary, boolean isPayed, Warehouse delivered) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.delivered = delivered;
    }

    @Override
    public void doWork() {
        salary += 100;
        delivered.setCountDeliveredOrders(delivered.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (delivered.getCountDeliveredOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        if (delivered.getCountDeliveredOrders() >= 10000) {
            if (!isPayed) {
                System.out.println("Курьер получает бонус!");
                salary += 50000;
                isPayed = true;
            }
            else
                System.out.println("Бонус уже был выплачен");
        }
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}