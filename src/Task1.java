public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse(0, 0);
        Picker picker1 = new Picker(0, false, warehouse1);
        Courier courier1 = new Courier(0, false, warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

        Warehouse warehouse2 = new Warehouse(0, 0);
        Picker picker2 = new Picker(0, false, warehouse2);
        Courier courier2 = new Courier(0, false, warehouse2);

        picker2.doWork();
        courier2.doWork();

        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);
    }

    static void businessProcess (Worker worker) {
        for (int i = 0; i < 10000; i++)
            worker.doWork();
        worker.bonus();
    }
}
