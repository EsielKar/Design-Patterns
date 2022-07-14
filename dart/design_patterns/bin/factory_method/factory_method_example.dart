import 'creators.dart';

void main(List<String> args) {
  Creator creator1 = ConcreteCreator1();
  Creator creator2 = ConcreteCreator2();

  creator1.someOperation();
  creator2.someOperation();
}
