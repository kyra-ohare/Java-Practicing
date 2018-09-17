/*
 * Exercise 12, page 438.
 */

package javaprogramming.chapter08Arrays;

import javaprogramming.chapter04.CertificateOfDeposit;
import javax.swing.*;

public class TestCertificateOfDepositArray {
    public static void main(String[] args) {
        final int MAX_CERTIFICATES = 5;
        int certificateNumber;
        String lastName;
        double balance;
        int yyyy;
        int mm;
        int dd;
        CertificateOfDeposit[] cert = new CertificateOfDeposit[MAX_CERTIFICATES];
        
        for(int i = 0; i < cert.length; ++i) {
            certificateNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the certificate Number:"));
            lastName = JOptionPane.showInputDialog(null, "Account holder's last name:");
            balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Account holder's balance:"));
            dd = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter day for issue date:"));
            mm = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month for issue date:"));
            yyyy = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year for issue date:"));
            cert[i] = new CertificateOfDeposit(certificateNumber, lastName, balance, yyyy, mm, dd);
        }
        
        for(int i = 0; i < cert.length; ++i) {
            cert[i].display();
        }
    }
}