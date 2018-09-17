/*
 * Exercise 10, page 237.
 */
package javaprogramming.chapter04;

import javax.swing.*;

public class CertificateOfDepositTest {
    public static void main(String[] args) {
        int certificateNumber, certificateNumber2;
        String lastName, lastName2;
        double balance, balance2;
        int yyyy, yyyy2;
        int mm, mm2;
        int dd, dd2;
        CertificateOfDeposit cert, cert2;
        
        certificateNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the certificate Number:"));
        lastName = JOptionPane.showInputDialog(null, "Account holder's last name:");
        balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Account holder's balance:"));
        dd = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter day for issue date:"));
        mm = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month for issue date:"));
        yyyy = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year for issue date:"));
        cert = new CertificateOfDeposit(certificateNumber, lastName, balance, yyyy, mm, dd);
        
        certificateNumber2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the certificate Number:"));
        lastName2 = JOptionPane.showInputDialog(null, "Account holder's last name:");
        balance2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Account holder's balance:"));
        dd2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter day for issue date:"));
        mm2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month for issue date:"));
        yyyy2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year for issue date:"));
        cert2 = new CertificateOfDeposit(certificateNumber2, lastName2, balance2, yyyy2, mm2, dd2);
        
        cert.display();
        cert2.display();
    }
}