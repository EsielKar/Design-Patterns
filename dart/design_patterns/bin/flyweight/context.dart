import 'flyweight.dart';

class Context {
  final int _uniqueState;
  final Flyweight _flyweight;

  Context(int repeatingState, int uniqueState)
      : _uniqueState = uniqueState,
        _flyweight = FlyweightFactory.getFlyweight(repeatingState);

  void operation() {
    _flyweight.operation(_uniqueState);
  }

  bool hasFlyweight(Flyweight flyweight) {
    return _flyweight == flyweight;
  }

  @override
  String toString() {
    return 'Context: uniqueState = $_uniqueState $_flyweight';
  }
}
