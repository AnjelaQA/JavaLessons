package lesson6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void run(int distance){
         System.out.printf("%s пробежал %s метров. %n", name, distance );

     };
    public void swim (int distance){
        System.out.printf("%s проплыл %s метров. %n", name, distance );
    };
}
