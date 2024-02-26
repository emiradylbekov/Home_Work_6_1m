public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700, 90);
        boss.setDamage(90);
        boss.setHealth(700);
        boss.weapon.setWeaponType(WeaponType.FIREARMS);
        boss.weapon.setWeaponName("AK-47");
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton(500,60,20);
        skeleton.weapon.setWeaponType(WeaponType.STEEL_ARMS);
        skeleton.weapon.setWeaponName("Dagger");
        System.out.println(skeleton.printInfo());
    }
}