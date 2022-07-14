import 'singletons.dart';

void main(List<String> arguments) {
  final i1 = Singleton.instance;
  final i2 = Singleton();
  final i3 = Singleton.getInstance();

  print(Singleton.instanceCount);
  print('---------------------');
  print('i1 == i2 ${i1 == i2}');
  print('i1 identical i2 ${identical(i1, i2)}');
  print('---------------------');
  print('i1 == i3 ${i1 == i3}');
  print('i1 identical i3 ${identical(i1, i3)}');
  print('---------------------');
  print('i2 == i3 ${i2 == i3}');
  print('i2 identical i3 ${identical(i2, i3)}');
  print('---------------------');
}
