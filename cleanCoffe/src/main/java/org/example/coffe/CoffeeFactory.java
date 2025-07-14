package org.example.coffe;


/**
 * Kahve üretiminden sorumlu sınıf - Factory Design Pattern
 * Yeni bir kahve türü eklemek için bu sınıfa yalnızca bir case daha eklenir.
 * Bu sınıf, Coffee nesnelerini soyut üretim mantığıyla oluşturur.
 */
public class CoffeeFactory {

    public static Coffee createCoffee(int selection) {
        return switch (selection) {
            case 1 -> new Espresso();
            case 2 -> new DoubleEspresso();
            case 3 -> new Cappuccino();
            case 4 -> new CaffeLatte();
            case 5 -> new Mocha();
            case 6 -> new Americano();
            case 7 -> new HotWater();
            default -> throw new IllegalArgumentException("Geçersiz seçim: " + selection);
        };
    }

    public static void listCoffees() {
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz:\n");
        System.out.println("1. Espresso (7₺)");
        System.out.println("2. Double Espresso (12₺)");
        System.out.println("3. Cappuccino (12₺)");
        System.out.println("4. Caffe Latte (12₺)");
        System.out.println("5. Mocha (13₺)");
        System.out.println("6. Americano (10₺)");
        System.out.println("7. Hot Water (3₺)");
    }
}
