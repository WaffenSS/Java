
package BankProject;

import java.util.Scanner;
import BankProject.Account;

public class Proje1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("İsminiz?");
        String name=sc.next();
        System.out.println("Hesabınızdaki para miktarı?");
        int balance=sc.nextInt();
        System.out.println("Bir şifre oluşturmak için 4 haneli şifrenizi giriniz:");
        int pass=sc.nextInt();
	Account bank =  new Account(name,balance,pass);
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Merhaba %s %n", bank.getOwnerName());
        System.out.printf("Hesabınızdaki para miktarı:%.2f %n", bank.getBalance());
        System.out.println("Hesabınızdan para çekmek istiyorsanız 1'e,yatırmak istiyorsanız 2'ye basınız.");
        int secim=sc.nextInt();
        if(secim==1){
        System.out.println("Çekmek istediğiniz miktarı giriniz:");
        bank.withdraw(input.nextInt());
        }
	if(secim==2){
        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        bank.add(input.nextInt());
        }
	System.out.printf("Hesabınızdaki yeni para miktarı: %.2f", bank.getBalance());
    }
}

    
    

