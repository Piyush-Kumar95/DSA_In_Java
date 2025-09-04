public class Test {


//    int n;
//
//    Test(int n){
//
//        System.out.println("thcfx = "+n);
//
//    }

    public static void main(String[] args) {
//        Test obj = new Test(45);
//        System.out.println(obj.n);

        Test std = new Test("piyush",90);
        System.out.println(std.name+" : "+std.num);

        Test std1 = new Test("raju",70);
        System.out.println(std1.name+" : "+std1.num);

    }

    String name;
    int num;

    Test(String nam,int nu){
        name = nam;
        num = nu;

    }
}
