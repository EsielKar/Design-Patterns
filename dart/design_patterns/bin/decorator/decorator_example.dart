import 'component.dart';
import 'decorator.dart';

void main(List<String> args) {
  Component stack = new ConcreteComponent();

  stack = ConcreteDecorator(stack);

  stack = ConcreteDecorator2(stack);

  stack.execute();
}
