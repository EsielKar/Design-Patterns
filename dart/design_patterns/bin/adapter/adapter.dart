import 'service.dart';

mixin ExistingInterface {
  double method(int data);
}

class Adapter implements ExistingInterface {
  final Service _adaptee;

  Adapter(Service adaptee) : _adaptee = adaptee;

  @override
  double method(int data) {
    return _adaptee.method(data.toString());
  }
}
