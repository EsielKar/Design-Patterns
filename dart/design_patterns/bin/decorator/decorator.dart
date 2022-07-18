import 'package:meta/meta.dart';

import 'component.dart';

class Decorator implements Component {
  @protected
  final Component wrapee;

  Decorator(this.wrapee);

  @override
  void execute() {
    wrapee.execute();
  }
}

class ConcreteDecorator extends Decorator {
  ConcreteDecorator(super.wrapee);

  @override
  void execute() {
    print("Execute from ConcreteDecorator");
    super.execute();
  }
}

class ConcreteDecorator2 extends Decorator {
  ConcreteDecorator2(super.wrapee);

  @override
  void execute() {
    print("Execute from ConcreteDecorator2");
    super.execute();
  }
}
