package a1.a2.a3;

public class Food {

    private String Food;
    private String user;

    public Food() {
    }

    public Food(String food, String user) {
        Food = food;
        this.user = user;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Food{" +
                "Food='" + Food + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
