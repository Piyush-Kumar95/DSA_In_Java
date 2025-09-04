public class Polymorphim {

    Polymorphim(){
        System.out.println("Hii");

    }
    Polymorphim(int n){
        System.out.println(n);
    }

    void A(String name,int n){
        System.out.println("He I am "+name+"age"+n);

    }
    void A(int n ,String name){
        System.out.println(n +" name "+name);

    }
    int A(int b){
        System.out.println("as "+b);
        return 0;
    }



    public static void main(String[] args) {

        Polymorphim obj = new Polymorphim();
        obj.A("Raju",45);
        obj.A(125,"ankit");
        obj.A(78);

        new Polymorphim(45);
        main();
    }

    public static void main(){
        System.out.println("Hello");
    }
}
