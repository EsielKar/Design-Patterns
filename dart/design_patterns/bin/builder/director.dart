import 'builder.dart';

class Director {
  Builder _builder;

  Director(Builder builder) : _builder = builder;

  set builder(Builder builder) {
    _builder = builder;
  }

  void make(int type) {
    switch (type) {
      case 1:
        _builder.buildStepA();
        break;
      case 2:
        _builder
          ..buildStepA()
          ..buildStepB();
        break;
      default:
        _builder
          ..buildStepA()
          ..buildStepB()
          ..buildStepC();
    }
  }
}
