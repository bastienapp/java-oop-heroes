public class Weapon {

  private String name;
  private int damage;

  public Weapon(String nameValue, int damageValue) {
    this.name = nameValue;
    this.damage = damageValue;
  }

  public int getDamage() {
    return this.damage;
  }
}
