abstract class vichel{

    int no_of_trey;

    void trey(){

        System.out.println("No of trey " +no_of_trey);
    }

    abstract void start();
}

class car extends vichel{

    void start(){

        no_of_trey = 4;
        System.out.println("car start with key");
    }
}

class bike extends vichel{

    void start(){

        no_of_trey = 2;
        System.out.println("Bike start with kick");
    }
}



public class Abstract {
    public static void main(String[] args) {

        vichel car = new car();
        car.start();
        car.trey();

        vichel bike = new bike();
        bike.start();
        bike.trey();
    }
}
