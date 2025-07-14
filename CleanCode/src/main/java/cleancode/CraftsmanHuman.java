package cleancode;

import cleancode.weapon.WeaponFactory;

/**
 * Silah üreticisi insanı temsil eden sınıf.
 *
 * Bu sınıf, verilen silah tipine göre {@code WeaponFactory} kullanarak silah üretir
 * ve ürettiği silahı kullanabilir.
 *
 * Üretim sorumluluğu factory'ye devredildiği için SRP'ye uygundur.
 * Yeni silah tipleri factory'den yönetilir, böylece OCP prensibine uyulur.
 *
 * @author mirac.guntogar
 * @version 1.0
 */
public class CraftsmanHuman extends Human {

    public CraftsmanHuman(String humanName) {
        super(humanName);
    }

    /**
     * Verilen silah tipine göre silah üretir.
     *
     * @param weaponType Üretilecek silah tipi (örn: "knife", "sword", "riffle")
     */
    public void craftWeapon(String weaponType) {
        this.weapon = WeaponFactory.createWeapon(weaponType);
        System.out.println(weapon.getWeaponName() + " üretildi. Üreten: " + humanName);
    }

    @Override
    public void useWeapon() {
        if (weapon == null) {
            System.out.println(humanName + " henüz silah üretmedi.");
        } else {
            weapon.use(humanName);
        }
    }
}
