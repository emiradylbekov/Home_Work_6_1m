public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700, 90);
        boss.setDamage(90);
        boss.setHealth(700);
        boss.weapon.setWeaponType(WeaponType.STEEL_ARMS);
        boss.weapon.setWeaponName("DAGGER");
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton(500,20,30);
        skeleton.weapon.setWeaponType(WeaponType.FIREARMS);
        skeleton.weapon.setWeaponName("AK-47");
        System.out.println(skeleton.printInfo());
        Skeleton skeleton2 = new Skeleton(400,50,2);
        skeleton2.weapon.setWeaponType(WeaponType.CHEMICAL);
        skeleton2.weapon.setWeaponName("BZ");
        System.out.println(skeleton2.printInfo());
    }
}