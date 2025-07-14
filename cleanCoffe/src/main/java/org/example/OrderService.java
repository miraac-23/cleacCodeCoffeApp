package org.example;



import org.example.coffe.Coffee;
import org.example.coffe.CoffeeFactory;

import java.util.Scanner;

/**
 * Sipariş işleme servisi.
 * Kullanıcı etkileşimlerini yönetir ve kahve üretimini tetikler.
 * SRP'ye uygun şekilde yalnızca sipariş akışından sorumludur.
 */
public class OrderService {

    private final Scanner scanner = new Scanner(System.in);

    public void processOrder() {
        CoffeeFactory.listCoffees();

        int choice = getUserInput();
        Coffee coffee = CoffeeFactory.createCoffee(choice);

        System.out.println("\nTeşekkürler, kahveniz hazırlanıyor...\n");
        System.out.println(coffee.getName() + " seçtiniz.");
        System.out.println("Tarif:");
        System.out.println(coffee.getRecipe());
        System.out.println("\nToplam Tutar: " + coffee.getPrice() + "₺");
        System.out.println("Afiyet olsun!");
    }

    private int getUserInput() {
        int choice = -1;
        while (true) {
            try {
                System.out.print("Seçiminiz: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 7) break;
                else System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
            } catch (NumberFormatException e) {
                System.out.println("Geçerli bir sayı giriniz.");
            }
        }
        return choice;
    }
}
