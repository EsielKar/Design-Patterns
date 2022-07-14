import 'prototypes.dart';

void main(List<String> args) {
  final prototype1 = ConcretePrototype(10);
  final prototype2 = ConcretePrototype2(15, 'Prototype 2');

  final prototype1Clone = ConcretePrototype.clone(prototype1);
  prototype1Clone.value = 100;

  print(prototype1.value);
  print(prototype1Clone.value);

  final ConcretePrototype2 prototype2Clone =
      prototype2.clone() as ConcretePrototype2;
  prototype2Clone.value = 150;
  prototype2Clone.value2 = 'Prototype 2 Clone';

  print('${prototype2.value}, ${prototype2.value2}');
  print('${prototype2Clone.value}, ${prototype2Clone.value2}');
}
