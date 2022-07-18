abstract class Service {
  double method(String specialData);
}

class ConcreteService implements Service {
  @override
  double method(String specialData) => double.parse(specialData) + 10.0;
}
