
class Calculte{

    void add (int num1, int num2){

        int sum = num1 + num2;
        System.out.println("Add = "+sum);
    }

    void sub (int num1, int num2){

        int sub = num1 - num2;
        System.out.println("Sub = "+sub);
    }

    void multi (int num1, int num2){

        int mul = num1 * num2;
        System.out.println("Multiply = "+mul);
    }
    void div (int num1, int num2){
        int div = num1 / num2;
        System.out.println("Div = "+div);
    }
}


public class Calculater {

    public static void main(String[] args) {

        Calculte obj = new Calculte();
        obj.add(45,56);
        obj.sub(15,4);
        obj.multi(45,0);
        obj.div(45,9);
        System.out.println("__________________");
        Calculte obj1 = new Calculte();
        obj1.add(45,5);
        obj1.sub(15,45);
        obj1.multi(45,5);
        obj1.div(45,6);
    }
}
