// these fuctions will be overided and implemented later other classes depending on how many payment methods we want

public interface PayStrategy {
    // returns true or false if the pyment has gone through - takes in the payment amount
    boolean pay(int paymentAmount);
    // checks the users login detail 
    void collectPaymentDetails();
}
