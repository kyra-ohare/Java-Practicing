/*
 * Exercise 10, page 237.

Create a CertificateOfDeposit class. The class contains data fields that hold a
certificate number, account holder’s last name, balance, issue date, and maturity
date, using GregorianCalendar objects for each date. Provide get and set
methods for each field. Also provide a constructor that requires parameters
used to set the first four fields, and sets the maturity date to exactly one year
after the issue date. Save the class as CertificateOfDeposit.java.
 */
package javaprogramming.chapter04;

import java.util.*;
import javax.swing.*;

public class CertificateOfDeposit {
    int certificateNumber;
    String lastName;
    double balance;
    GregorianCalendar issueDate;
    GregorianCalendar maturityDate;

    public CertificateOfDeposit(int num, String name, double bal, int yyyy, int mm, int dd) {
        certificateNumber = num;
        lastName = name;
        balance = bal;
        issueDate = new GregorianCalendar(yyyy, mm, dd);
        maturityDate = new GregorianCalendar((yyyy+1), mm, dd);
    }
    public int getCertificateNumber() {
            return certificateNumber;
    }
    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
    public String getLastName() {
            return lastName;
    }
    public void setLastName(String lastName) {
            this.lastName = lastName;
    }
    public double getBalance() {
            return balance;
    }
    public void setBalance(double balance) {
            this.balance = balance;
    }
    public GregorianCalendar getIssueDate() {
            return issueDate;
    }
    public void setIssueDate(GregorianCalendar issueDate) {
        this.issueDate = issueDate;
    }
    public GregorianCalendar getMaturityDate() {
            return maturityDate;
    }
    public void setMaturityDate(GregorianCalendar maturityDate) {
        this.maturityDate = maturityDate;
    }

    public void display() {
            JOptionPane.showMessageDialog(null, "Certificate Number: " + getCertificateNumber() + "\nLast Name: " + getLastName() + "\nBalance: " + getBalance() + "\nIssue Date: " + getIssueDate().get(GregorianCalendar.DATE) + " / " + getIssueDate().get(GregorianCalendar.MONTH) + " / " + getIssueDate().get(GregorianCalendar.YEAR) + "\nMaturity Date: "  + getMaturityDate().get(GregorianCalendar.DATE) + " / " + getMaturityDate().get(GregorianCalendar.MONTH) + " / " + getMaturityDate().get(GregorianCalendar.YEAR));
    }
}
