public class Person {
    private int age;

    public Person() {
        int min = 5;
        int max = 80;
        this.age = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Age: " + this.age);
    }

    public String getLifeStage() {
        if (age <= 12) {
            return "Is a child";
        } else if (age >= 13 && age <= 19) {
           return "Is a teen";
        } else if (age >= 20 && age <= 59) {
           return "Is a Adult";
        } else {
            return "Senior adult";
        }
    }
}