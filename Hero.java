class Hero {

  private String name;
  private Weapon weapon;
  private int life;

  public Hero(String nameValue, int lifeValue) {
    this.name = nameValue;
    this.life = lifeValue;
  }

  // methods
  public String getName() {
    return "My name is " + this.name;
  }

  public int getLife() {
    return this.life;
  }

  public void setLife(int newLifePoints) {
    this.life = newLifePoints;
  }

  public boolean isAlive() {
    return this.life > 0;
  }

  public void setWeapon(Weapon newWeapon) {
    this.weapon = newWeapon;
  }

  public void attack(Hero opponent) {
    opponent.setLife(opponent.getLife() - this.weapon.getDamage());
  }
}