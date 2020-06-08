package enemy;

abstract public class EnemyDecorator implements IEnemy {
  protected IEnemy enemy;

  public EnemyDecorator(IEnemy enemy) {
    this.enemy = enemy;
  }

  @Override
  public float takeDamage() {
    return enemy.takeDamage();
  }
}
