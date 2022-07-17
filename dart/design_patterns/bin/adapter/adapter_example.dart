import 'adapter.dart';
import 'service.dart';

void main(List<String> args) {
  final Service service = ConcreteService();
  final adapter = Adapter(service);

  print(adapter.method(15));
}
