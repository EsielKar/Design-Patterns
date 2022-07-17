abstract class Platform {
  void method1();

  void method2();

  void method3();
}

class ConcretePlatform extends Platform {
  @override
  void method1() {
    print("method1");
  }

  @override
  void method2() {
    print("method2");
  }

  @override
  void method3() {
    print("method3");
  }
}
