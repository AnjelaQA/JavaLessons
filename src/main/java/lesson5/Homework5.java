package lesson5;

public class Homework5 {
    public static void main(String[] args) {
        Worker worker1 = new Worker("A.G.G","director","g.nshuchu@gmail.com","894212211", 6000,54);
        worker1.printinfo();

        Worker[] workerarray = new Worker[5];
        workerarray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        workerarray[1] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        workerarray[2] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 55);
        workerarray[3] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 61);
        workerarray[4] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 18);

        for (int i = 0; i < 4; i++) {
            if (workerarray[i].возраст > 40){
                workerarray[i].printinfo();
            }

        }

    }

}
