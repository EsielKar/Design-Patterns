import 'products.dart';

abstract class AbstractFactory {
  ProductA createProductA();
  ProductB createProductB();
}

class ConcreteFactory1 extends AbstractFactory {
  @override
  ProductA createProductA() => ConcreteProductA1();

  @override
  ProductB createProductB() => ConcreteProductB1();
}

class ConcreteFactory2 extends AbstractFactory {
  @override
  ProductA createProductA() => ConcreteProductA2();

  @override
  ProductB createProductB() => ConcreteProductB2();
}
