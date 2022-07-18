import 'proxy.dart';
import 'service.dart';

void main(List<String> args) {
  Service service = Service();
  Proxy proxy = Proxy(service);

  proxy.operation();
}
