package cleancode;

/**
 * Ana uygulama sınıfı.
 * Bu sınıfta kullanıcı rollerine ve davranışlarına göre kod akışı örneği gösterilir.
 */
public class CleanCode {

    public static void main(String[] args) {
        // Silah üreten zanaatkar oluşturuluyor
        CraftsmanHuman craftsman = new CraftsmanHuman("Zanaatkar");
        craftsman.craftWeapon("riffle");

        // Savaşçı oluşturulup, üretilen silah ona veriliyor
        WarriorHuman warrior = new WarriorHuman("Savaşçı", craftsman.getWeapon());
        warrior.useWeapon();
    }
}
