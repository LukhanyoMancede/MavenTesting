/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.maventesting;

/**
 * @author Lukhanyo Mancede - 217139205[Group 26]
 */
public class bankAccount {
      private String account_a, account_b;
    
    public bankAccount() {}
    
    public bankAccount(String account_a, String account_b)
    {
        this.account_a = account_a;
        this.account_b = account_b;
    }
    
    public String getAccount_a()
    {
        return account_a;
    }

    public void setAccount_b(String account_b)
    {
        this.account_b = account_b;
    }

    public String getAccount_b()
    {
        return account_b;
    }

    @Override
    public String toString()
    {
        return "bankAcccount{" + "account_a=" + account_a + ", account_b=" + account_b + '}';
    }
}

