abstract class ServiceInterface {
  void operation();
}

class Service implements ServiceInterface {
  @override
  void operation() {
    print("Service: operation");
  }
}
