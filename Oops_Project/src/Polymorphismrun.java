class A4 {

    public void A1(int n ){

        System.out.println("He I am Piyush"+n);

    }
}

class B6 extends A4{

    @Override
  public void A1(int n){

        System.out.println("Hey Iam Raju ");

    }
}


public class Polymorphismrun {
    public static void main(String[] args) {

        A4 obj = new B6();
        obj.A1(10);
    }
}
