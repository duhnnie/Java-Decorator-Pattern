import enemy.ArmorDecorator;
import enemy.Enemy;
import enemy.HelmetDecorator;

public class App {
  public static void main(String... args) {
    Enemy enemy = new Enemy();
    HelmetDecorator enemyWithHelmet = new HelmetDecorator(enemy);
    ArmorDecorator enemyWithHelmetAndArmor = new ArmorDecorator(enemyWithHelmet);

    System.out.println(enemy.takeDamage());
    System.out.println(enemyWithHelmet.takeDamage());
    System.out.println(enemyWithHelmetAndArmor.takeDamage());
  }
}