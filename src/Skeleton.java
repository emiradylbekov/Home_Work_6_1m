public class Skeleton extends Boss {
    private int numberOfArrows;

    public Skeleton(int health, int damage, int numberOfArrows) {
        super(health, damage);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }


    public String printInfo() {
        return "Skeleton: " + "\nHealth: " + getHealth() + "\nDamage: " + getDamage() + "\nWeapon type: " + weapon.getWeaponType()
                + "\nWeapon name: " + weapon.getWeaponName() + "\nNumber of arrows: " + this.numberOfArrows;
    }
}
