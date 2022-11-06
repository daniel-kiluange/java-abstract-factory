import pattern.CarFactory;
import pattern.VehicleFactory;

public class Main {

  public static void main(String[] args) {
    String os = System.getProperty("os.name");

    VehicleFactory vehicleFactory = switch (os) {
      case "Windows 10":
        yield new CarFactory();
      default:
        throw new RuntimeException();
    };

    client(vehicleFactory);
  }

  public static void client(VehicleFactory vehicleFactory) {
    var vehicle = vehicleFactory.create();
    vehicle.WhoAmI();
  }
}