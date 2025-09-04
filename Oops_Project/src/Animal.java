public class Animal {

    void run(String name){
        System.out.println(name+" is Running____");
    }

    void eat(String name){
        System.out.println( name+" is eating ___");
    }

    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.run("Dog");
        obj.eat("Dog");

        Animal obj1 = new Animal();
        obj1.eat("Cat");
        obj1.run("Cat");
    }
}
