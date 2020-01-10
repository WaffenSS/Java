
package BankProject;
import java.util.Scanner;

public class Account {
    private int balance;
    private String ownerName;
    private int pass;

    public Account(String name, int balance,int pass){
        this.ownerName =  name;
        this.pass=pass;
        if(balance > 0.0)
            this.balance = balance;
        else
            System.out.println("Negatif bir değer girdiğiniz için, bakiyeniz 0 olarak ayarlandı");
    }
    
    public void add(int amount){
        if(amount > 0.0)
            balance += amount;
    }
    public double getBalance(){
        return balance;
    }
    public void setOwnerName(String name){
        this.ownerName = name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void withdraw(int amount){
        Scanner input = new Scanner(System.in);
        int counter= 0;
        while(counter++ < 3){
            System.out.println("4 Haneli şifrenizi giriniz: ");
            if(input.nextInt() == pass) {
                
                if(balance < amount) {
                    System.out.println("You do not have enough balance in your account!");
                }
                
                else {
                    balance = balance - amount;
                    System.out.printf("İşte paranız! %f %n", amount);
                }
                break;
            }
        }
        if(counter > 3)
            System.out.println("Your account has been blocked, please try again later");
    }
}

