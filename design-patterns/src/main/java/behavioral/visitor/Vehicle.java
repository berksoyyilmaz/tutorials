package behavioral.visitor;

public interface Vehicle {
  int accept(VehicleInspector vehicleInspector);
}  