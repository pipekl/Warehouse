public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse picked;

    public Picker(int salary, boolean isPayed, Warehouse picked) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.picked = picked;
    }

    @Override
    public void doWork() {
        salary += 80;
        picked.setCountPickedOrders(picked.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (picked.getCountPickedOrders() < 10000)
            System.out.println("Бонус пока не доступен");
        if (picked.getCountPickedOrders() >= 10000) {
            if (!isPayed) {
                System.out.println("Сборщик получает бонус!");
                salary += 70000;
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
