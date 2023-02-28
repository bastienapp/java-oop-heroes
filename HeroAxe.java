public class HeroAxe extends Hero {

  public HeroAxe(String name, int life) {
    super(name, life);
    super.setWeapon(new Weapon("Axe", 120));
  }
}
