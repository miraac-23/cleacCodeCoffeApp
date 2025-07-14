package cleancode.weapon;

/**
 * Kılıç (Sword) silah türünü temsil eder.
 * Yeni silah ekleme kolaylığı için her silah kendi sınıfında tanımlanır. ( Single Responsibility presnibi sağlandı )
 */
public class Sword extends Weapon {

    public Sword() {
        super("sword");
    }

    @Override
    public void use(String username) {
        System.out.println(weaponName + " kullanılıyor -> Kullanıcı: " + username);
    }
}
