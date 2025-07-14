package cleancode;

import cleancode.weapon.Weapon;

/**
 * Bu sınıf savaşçı rolündeki insanı temsil eder.
 * SRP prensibine uygun olarak sadece silah kullanımı ile ilgilenir.
 */
public class WarriorHuman extends Human {

    public WarriorHuman(String humanName, Weapon weapon) {
        super(humanName);
        this.weapon = weapon;
    }

    @Override
    public void useWeapon() {
        if (weapon == null) {
            System.out.println(humanName + " savaşacak bir silahı yok.");
        } else {
            // Polimorfizm sayesinde silahın türüne göre özel kullanım davranışı çalışır.
            weapon.use(humanName);
        }
    }
}
