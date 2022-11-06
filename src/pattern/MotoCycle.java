package pattern;

public class MotoCycle implements Vehicle {

  Engine engine;

  public MotoCycle(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void WhoAmI() {
    System.out.println("this is a moto cycle!");
  }
}
