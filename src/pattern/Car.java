package pattern;

public class Car implements Vehicle{

  private Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void WhoAmI() {
    System.out.println("this is a car!");
  }
}
