class Flyweight {
  final int _repeatingState;

  Flyweight(int repeatingState) : _repeatingState = repeatingState;

  void operation(int uniqueState) {
    print('Flyweight: uniqueState = $uniqueState');
  }

  @override
  String toString() => "Flyweight: repeatingState = $_repeatingState";
}

class FlyweightFactory {
  static List<Flyweight?>? _cache;

  _internal() {}

  static Flyweight getFlyweight(int repeatingState) {
    if (_cache![repeatingState] == null) {
      _cache![repeatingState] = Flyweight(repeatingState);
    }

    return _cache![repeatingState]!;
  }

  static set flyweights(List<Flyweight?>? flyweights) {
    _cache = flyweights;
  }

  static List<Flyweight?>? get flyweights => _cache;
}
