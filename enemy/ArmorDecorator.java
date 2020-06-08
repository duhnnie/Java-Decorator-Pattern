package enemy;

public class ArmorDecorator extends EnemyDecorator {
  public ArmorDecorator(IEnemy enemy) {
    super(enemy);
  }

  @Override
  public float takeDamage() {
    return super.takeDamage() / 1.5f;
  }
}