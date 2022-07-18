import 'package:meta/meta.dart';

import 'platform.dart';

class Abstraction {
  @protected
  final Platform platform;

  Abstraction(this.platform);

  void feature1() {
    platform.method1();
    platform.method2();
  }

  void feature2() {
    platform.method3();
  }
}

class RefinedAbstraction extends Abstraction {
  RefinedAbstraction(super.platform);

  void featureN() {
    platform.method1();
    platform.method2();
    platform.method3();
  }
}
