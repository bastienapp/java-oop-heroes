public class HeroSword extends Hero {

  public HeroSword(String name, int life) {
    super(name, life);
    super.setWeapon(new Weapon("Sword", 100));
  }
}
