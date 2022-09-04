package creational.builder.house;

class Houses {
  private Houses() {
  }

  static <T> House<T> unmodifiableHouse(House<T> house) {
    return new UnmodifiableHouse<>(house);
  }

  private static class UnmodifiableHouse<E> implements House<E> {
    final House<E> house;

    UnmodifiableHouse(House<E> house) {
      this.house = house;
    }

    @Override
    public String print() {
      return house.print();
    }
  }
}
