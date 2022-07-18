import 'abstraction.dart';
import 'platform.dart';

void main(List<String> args) {
  Platform platform = ConcretePlatform();
  Abstraction abstraction = Abstraction(platform);
  RefinedAbstraction refinedAbstraction = RefinedAbstraction(platform);

  abstraction.feature1();
  abstraction.feature2();

  refinedAbstraction.featureN();
}
