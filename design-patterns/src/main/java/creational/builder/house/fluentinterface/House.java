package creational.builder.house.fluentinterface;

public class House {
  private final String foundation;
  private final String structure;
  private final String roof;
  private final boolean furnished;
  private final boolean painted;

  private House(String foundation, String structure, String roof, boolean furnished, boolean painted) {
    this.foundation = foundation;
    this.structure = structure;
    this.roof = roof;
    this.furnished = furnished;
    this.painted = painted;
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

  public interface Foundation {
    Structure addFoundation(String foundation);
  }

  public interface Structure {
    Roof addStructure(String structure);
  }

  public interface Roof {
    HouseCreator addRoof(String roof);
  }

  public interface HouseCreator {
    HouseCreator addFurnished(boolean furnished);

    HouseCreator paintHouse(boolean painted);

    House build();
  }

  static class HouseBuilder implements Foundation, Structure, Roof, HouseCreator {

    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    HouseBuilder() {
    }

    @Override
    public Structure addFoundation(String foundation) {
      this.foundation = foundation;
      return this;
    }

    @Override
    public Roof addStructure(String structure) {
      this.structure = structure;
      return this;
    }

    @Override
    public HouseCreator addRoof(String roof) {
      this.roof = roof;
      return this;
    }

    @Override
    public HouseCreator addFurnished(boolean furnished) {
      this.furnished = furnished;
      return this;
    }

    @Override
    public HouseCreator paintHouse(boolean painted) {
      this.painted = painted;
      return this;
    }

    @Override
    public House build() {
      return new House(foundation, structure, roof, furnished, painted);
    }

  }
}
