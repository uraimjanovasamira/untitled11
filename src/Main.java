//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal[] animals = new Animal[6];
        animals[0] = new Shark();
        animals[1] = new Eagle();
        animals[2] = new Turtle();
        animal.animal1();

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark) {
                Shark shark = new Shark();
                shark.attack();
            }
        }
        for (int i = 0; i < animals.length; i++){
            if (animals[i]instanceof Eagle){
                Eagle eagle=new Eagle();
                eagle.fly();
            }
        }
        for (int i = 0; i < animals.length ; i++) {
            if (animals[i]instanceof Turtle){
                Turtle turtle=new Turtle();
                turtle.swim();
            }
        }


    }
}