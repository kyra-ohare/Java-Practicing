/*
 * Exercise 2, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class PhoneCallTest {
    public static void main(String[] args) {
        IncomingPhoneCall in = new IncomingPhoneCall("83 847 9520");
        OutgoingPhoneCall out = new OutgoingPhoneCall("86 952 3578", 10);
        
        in.displayCallInfo();
        out.displayCallInfo();
    }
}