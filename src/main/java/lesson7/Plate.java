package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n){
        int AmountOfFood = food - n;
        if (AmountOfFood < 0) {
            System.out.println("В тарелке не хватает еды");
            return false;
        } food -= n;
        return true;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public void addFood(int food) {
        this.food += food;
    }

}
