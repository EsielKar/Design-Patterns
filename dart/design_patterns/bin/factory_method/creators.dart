import 'package:meta/meta.dart' show nonVirtual;

import 'products.dart';

abstract class Creator {
  Product createProduct();

  @nonVirtual
  void someOperation() {
    Product product = createProduct();
    product.doStuff();
  }
}

class ConcreteCreator1 extends Creator {
  @override
  Product createProduct() => ConcreteProduct1();
}

class ConcreteCreator2 extends Creator {
  @override
  Product createProduct() => ConcreteProduct2();
}
