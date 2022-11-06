package pattern;

public class MotoCycleFactory implements VehicleFactory{

  @Override
  public Vehicle create() {
    return new MotoCycle(new MotoCycleEngine());
  }
}
