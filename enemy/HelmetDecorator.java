package enemy;

public class HelmetDecorator extends EnemyDecorator {
  public HelmetDecorator(IEnemy enemy) {
    super(enemy);
  }

  @Override
  public float takeDamage() {
    return enemy.takeDamage() / 2;
  }
}