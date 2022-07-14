import 'product.dart';

abstract class Builder {
  void buildStepA();
  void buildStepB();
  void buildStepC();
  void reset();
}

class ProductBuilder extends Builder {
  late Product _product;

  ProductBuilder() {
    reset();
  }

  @override
  void buildStepA() {
    _product.a = true;
  }

  @override
  void buildStepB() {
    _product.b = true;
  }

  @override
  void buildStepC() {
    _product.c = true;
  }

  @override
  void reset() {
    _product = Product();
  }

  Product build() => _product;
}
