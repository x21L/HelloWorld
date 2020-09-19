public class Animal {
    public String name;
    public int feet;
    private String color;
    private String race;

    public Animal(String name, int feet, String color, String race) {
        this.name = name;
        this.feet = feet;
        this.color = color;
        this.race = race;
    }

   public void print() {
       System.out.println(name + " " + feet + " " + color + " " + race);
   }
}
