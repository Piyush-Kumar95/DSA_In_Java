
// Hierarchical Inheritance

class A{

    void A1(){
        System.out.println("show A1");
    }
}

class B extends A{

    void B1(){
        System.out.println("show B1");
    }

}
class C extends A{

    void C1(){
        System.out.println("show C1");
    }
}







// Multilevel Inheritance

//class A1{
//
//    void showA1(){
//
//        System.out.println("Show A1");
//    }
//}
//
//class A2 extends A1{
//
//    void showA2(){
//        System.out.println("show A2");
//    }
//}
//
//class A3 extends A2{
//
//    void showA3(){
//        System.out.println("Show A3");
//    }
//}



// Single Inheritance

//class Parent{
//    int num;
//   void eyecolor(){
//        System.out.println("Eye color is black");
//    }
//}
//class child extends Parent{
//
//    void age(int n){
//        num = n;
//        System.out.println(num);
//    }
//}



public class InheritanceP {
    public static void main(String[] args) {


        // Single Inheritance

//        child obj = new child();
//        obj.age(44);
//        obj.eyecolor();


        // Multilevel Inheritance

//        A3 show = new A3();
//        show.showA1();
//        show.showA2();
//        show.showA3();
//
//        System.out.println("-----------------------");
//
//        A2 show1 = new A2();
//        show1.showA1();
//        show1.showA2();
//
//        System.out.println("------------------------");
//
//        A1 show2 = new A1();
//        show2.showA1();


        //  Hierarchical Inheritance

        A show1 = new A();
        show1.A1();

        B show2 = new B();
        show2.A1();
        show2.B1();

        C show3 = new C();
        show3.A1();
        show3.C1();
    }
}

