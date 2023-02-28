public class Arena {

  public static void main(String[] args) {
    // polymorphisme
    Hero michel = new HeroSword("Michel", 1000);
    Hero gertrude = new HeroAxe("Gertrude", 650);
    michel.attack(gertrude);

    System.out.println(gertrude.getLife());
  }
}
