package lesson5;

public class Worker {
    String ФИО;
    String должность;
    String email;
    String телефон;
    int зарплата;
    int возраст;

    public Worker(String ФИО, String должность, String email, String телефон, int зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    void printinfo(){
        System.out.printf("Worker %s,должность %s,email %s,телефон %s,зарплата %s,возраст %s",ФИО,должность,email,телефон,зарплата,возраст );
        System.out.println();
    }
}



