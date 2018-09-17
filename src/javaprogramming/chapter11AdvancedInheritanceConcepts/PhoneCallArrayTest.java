/*
 * Exercise 2, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class PhoneCallArrayTest {
    public static void main(String[] args) {
        PhoneCall[] calls = new PhoneCall[10];
        
        calls[0] = new IncomingPhoneCall("83 847 9520");
        calls[1] = new OutgoingPhoneCall("86 952 3578", 10);
        calls[2] = new IncomingPhoneCall("78 354 6521");
        calls[3] = new OutgoingPhoneCall("15 630 6987", 5);
        calls[4] = new IncomingPhoneCall("89 654 1256");
        calls[5] = new OutgoingPhoneCall("09 351 1265", 30);
        calls[6] = new IncomingPhoneCall("34 657 9832");
        calls[7] = new OutgoingPhoneCall("52 452 6543", 7);
        calls[8] = new IncomingPhoneCall("39 348 6321");
        calls[9] = new OutgoingPhoneCall("96 369 8520", 2);

        for(PhoneCall temp : calls) {
            temp.displayCallInfo();
        }
    }
}