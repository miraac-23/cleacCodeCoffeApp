package cleancode.weapon;

/**
 * Bıçak (Knife) silah türünü temsil eder.
 * Yeni silah ekleme kolaylığı için her silah kendi sınıfında tanımlanır.
 * Bu sayede WeaponType enum'una ve if-else bloklarına ihtiyaç kalmayacaktır ( Open-Closed Prensibi sağlandı).
 */
public class Knife extends Weapon {

    public Knife() {
        super("knife");
    }

    @Override
    public void use(String username) {
        // Silahın kullanım şekli burada tanımlanır.
        System.out.println(weaponName + " kullanılıyor -> Kullanıcı: " + username);
    }
}
