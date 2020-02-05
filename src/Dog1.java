public class Dog1 {
    String name;
    public static void main(String[] args) {

        Dog1 dog1 = new Dog1();
        dog1.bark();
        dog1.name = " Bart";


        Dog1[] myDogs = new Dog1[3];

        myDogs[0] = new Dog1();
        myDogs[1] = new Dog1();
        myDogs[2] = dog1;

        myDogs[0].name = " Fred";
        myDogs[1].name = " Marge";

        System.out.print("last dog's name is");
        System.out.print(myDogs[2].name);

        int x = 0;

        while (x < myDogs.length) {
            myDogs[x].eats();
            myDogs[x].chaseCat();
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.print(name + " Says Ruff Ruff!");

    }

    public void eats(){


        System.out.print(name + " eats steak");
    }

    public void chaseCat(){

        System.out.print(name + " catches cat ");

    }
}
