package pl.gda.wsb;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("helloworld");

//        Human human1 = new Human();
//        Human human2 = new Human();
//
//
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal();
//
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();

        Human human1 = new Human("Jan", "Nowak", 23 );
        Human human2 = new Human("Janina", "Kowalska", 51 );


        Animal animal1 = new Animal("Mruczek","czarno-bialy","kot", 3);
        Animal animal2 = new Animal("Szczeczek","rudy-przypalany","pies", 25);

        Phone phone1 = new Phone("Samsung","s20",8);
        Phone phone2 = new Phone("Sony","XZY",9);


        System.out.println(human1);
        System.out.println(human1.lastName);

        if (animal1.weight > animal2.weight)
            System.out.println("wiecej wazy "+ animal1.name);
        else
            System.out.println("wiecej wazy "+ animal2.name);
    }
}
