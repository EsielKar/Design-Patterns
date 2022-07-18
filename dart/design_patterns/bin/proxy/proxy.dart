import 'dart:math';

import 'service.dart';

class Proxy implements ServiceInterface {
  final Service _realService;

  Proxy(Service service) : _realService = service;

  bool _checkAccess() {
    return Random().nextInt(2) % 2 == 0;
  }

  @override
  void operation() {
    print("Proxy: operation");
    if (_checkAccess()) {
      _realService.operation();
    }
  }
}
