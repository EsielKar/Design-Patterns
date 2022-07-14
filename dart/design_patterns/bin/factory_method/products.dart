abstract class Product {
  void doStuff();
}

class ConcreteProduct1 extends Product {
  @override
  void doStuff() {
    print('ConcreteProduct1: doStuff()');
  }
}

class ConcreteProduct2 extends Product {
  @override
  void doStuff() {
    print('ConcreteProduct2: doStuff()');
  }
}
