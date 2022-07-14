import 'builder.dart';
import 'director.dart';

void main(List<String> args) {
  final builder = ProductBuilder();

  builder.reset();
  builder.buildStepB();
  builder.buildStepC();
  print(builder.build());

  builder.reset();
  final director = Director(builder);
  director.make(1);
  print(builder.build());
}
