import 'context.dart';
import 'flyweight.dart';

void main(List<String> args) {
  // Flyweights
  final repeatingState1 = Flyweight(0);
  final repeatingState2 = Flyweight(1);
  final repeatingState3 = Flyweight(2);

  FlyweightFactory.flyweights = <Flyweight>[
    repeatingState1,
    repeatingState2,
    repeatingState3,
  ];

  // Context
  final contexts = [
    Context(2, 22),
    Context(0, 10),
    Context(2, 1),
    Context(0, 2),
    Context(1, 500),
  ];

  for (Flyweight? flyweight in FlyweightFactory.flyweights!) {
    print("--------- $flyweight ---------");
    for (Context context in contexts) {
      print('$context ${context.hasFlyweight(flyweight!)}');
    }
  }
}
