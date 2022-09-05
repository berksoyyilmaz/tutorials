package creational.builder.house.withoutdirector;

class House {
  private final String foundation;
  private final String structure;
  private final String roof;
  private final boolean furnished;
  private final boolean painted;

  private House(HouseBuilder builder) {
    foundation = builder.foundation;
    structure = builder.structure;
    roof = builder.roof;
    furnished = builder.furnished;
    painted = builder.painted;
  }

  public String getFoundation() {
    return foundation;
  }

  public String getStructure() {
    return structure;
  }

  public String getRoof() {
    return roof;
  }

  public boolean isFurnished() {
    return furnished;
  }

  public boolean isPainted() {
    return painted;
  }

  @Override
  public String toString() {
    return "House{" +
        "foundation='" + foundation + '\'' +
        ", structure='" + structure + '\'' +
        ", roof='" + roof + '\'' +
        ", furnished=" + furnished +
        ", painted=" + painted +
        '}';
  }

  static class HouseBuilder {
    private final String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    HouseBuilder(String foundation) {
      this.foundation = foundation;
    }

    HouseBuilder addStructure(String structure) {
      this.structure = structure;
      return this;
    }

    HouseBuilder addRoof(String roof) {
      this.roof = roof;
      return this;
    }

    HouseBuilder addFurnished(boolean furnished) {
      this.furnished = furnished;
      return this;
    }

    HouseBuilder paintHouse(boolean painted) {
      this.painted = painted;
      return this;
    }

    House build() {
      return new House(this);
    }
  }
}
