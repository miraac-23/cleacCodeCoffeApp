package cleancode.weapon;

/**
 * Tüfek (Riffle) silah türünü temsil eder.
 * Yeni silah ekleme kolaylığı için her silah kendi sınıfında tanımlanır. ( Single Responsibility presnibi sağlandı )
 * Silahın kullanım şekli bu sınıfta tanımlanır.
 */
public class Riffle extends Weapon {

    public Riffle() {
        super("riffle");
    }

    @Override
    public void use(String username) {
        System.out.println(weaponName + " kullanılıyor -> Kullanıcı: " + username);
    }
}
