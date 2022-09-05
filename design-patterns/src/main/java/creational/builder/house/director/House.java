package creational.builder.house.director;

public class House {
  private String foundation;
  private String structure;
  private String roof;
  private boolean furnished;
  private boolean painted;

  void setFoundation(String foundation) {
    this.foundation = foundation;
  }

  void setStructure(String structure) {
    this.structure = structure;
  }

  void setRoof(String roof) {
    this.roof = roof;
  }

  void setFurnished(boolean furnished) {
    this.furnished = furnished;
  }

  void setPainted(boolean painted) {
    this.painted = painted;
  }

  @Override
  public String toString() {
    return "Foundation - " + foundation + " Structure - " + structure + " Roof - " + roof + " Is Furnished? " + furnished + " Is Painted? " + painted;
  }
}
