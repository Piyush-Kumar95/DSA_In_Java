
interface Payment{

    void pay();
}

class upipayment implements Payment{
   public void pay(){
        System.out.println("pay for upi");
    }
}
class netbanking implements Payment{

   public void pay(){
        System.out.println("pay for netbanking");
    }
}

class checkout{

    void process(Payment payment){

        payment.pay();
    }
}


public class InterfceEx {

    public static void main(String[] args) {

        Payment upi = new upipayment();
        Payment net = new netbanking();

        checkout checkout = new checkout();

        checkout.process(upi);
        checkout.process(net);

    }
}
