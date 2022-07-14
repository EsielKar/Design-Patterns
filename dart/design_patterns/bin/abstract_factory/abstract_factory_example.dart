import 'factories.dart';
import 'products.dart';

void main(List<String> args) {
  final AbstractFactory factory1 = ConcreteFactory1();
  final AbstractFactory factory2 = ConcreteFactory1();

  final ProductA productA1 = factory1.createProductA();
  final ProductA productA2 = factory2.createProductA();

  final ProductB productB1 = factory1.createProductB();
  final ProductB productB2 = factory2.createProductB();

  print("Factory: ${factory1.runtimeType}");
  print(productA1);
  print(productB1);
  print("Factory: ${factory2.runtimeType}");
  print(productA2);
  print(productB2);
}
