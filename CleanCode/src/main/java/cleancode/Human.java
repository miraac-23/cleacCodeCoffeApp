package cleancode;

import cleancode.weapon.Weapon;

/**
 * Ortak davranışlara sahip soyut insan sınıfı.
 * Silah kullanmak ortak bir davranıştır ancak nasıl kullanılacağı alt sınıflara bırakılmıştır.
 */
public abstract class Human {

    protected String humanName;
    protected Weapon weapon;

    public Human(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanName() {
        return humanName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    // Her alt sınıf silahı farklı şekilde kullanabilir.
    public abstract void useWeapon();
}
