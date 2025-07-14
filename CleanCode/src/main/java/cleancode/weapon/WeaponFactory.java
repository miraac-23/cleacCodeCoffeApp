package cleancode.weapon;

/**
 * Bu sınıf, silah üretimini merkezi olarak yapar.
 * SRP ilkesine uygun olarak üretim mantığını Human sınıflarından ayırmış olduk bu class içerisnde.
 */
public class WeaponFactory {

    public static Weapon createWeapon(String type) {

        // if-else yapısı switch ile sadeleştirildi ve sadece burada tutuluyor.
        // Yeni silah eklemek sadece buraya tek satır eklemekle mümkün ( Open-Closed (OCP) Prensibi korunur).
        return switch (type.toLowerCase()) {
            case "knife" -> new Knife();
            case "sword" -> new Sword();
            case "riffle" -> new Riffle();
            default -> throw new IllegalArgumentException("Geçersiz silah tipi: " + type);
        };
    }
}
