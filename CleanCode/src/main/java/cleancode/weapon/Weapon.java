package cleancode.weapon;

/**
 * Soyut silah sınıfı, tüm silah tiplerinin ortak davranışlarını tanımlar.
 *
 * Bu sınıf, silahların adını tutar ve her silahın kendine özgü kullanım davranışını
 * tanımlamak için abstract {@code use} metodunu içerir.
 *
 * Yeni silah türleri bu sınıftan türetilerek kolayca eklenebilir.
 *
 * @author mirac.guntogar
 * @version 1.0
 */
public abstract class Weapon {
    protected String weaponName;

    /**
     * Silah adını belirten yapıcı metot.
     *
     * @param weaponName Silahın adı
     */
    public Weapon(String weaponName) {
        this.weaponName = weaponName;
    }

    /**
     * Silahın adını döner.
     *
     * @return Silah adı
     */
    public String getWeaponName() {
        return weaponName;
    }

    /**
     * Silahın kullanıcı tarafından kullanılma davranışını tanımlar.
     * Alt sınıflar bu metodu kendi kullanım senaryolarına göre uygular.
     *
     * @param username Silahı kullanan insanın adı
     */
    public abstract void use(String username);
}
