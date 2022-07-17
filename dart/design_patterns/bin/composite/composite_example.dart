import 'composite.dart';

void main(List<String> args) {
  final composite = Composite(); // Composite 1
  final innerComposite = Composite(); // Composite 2

  composite.add(Leaf()); // Leaf 1

  innerComposite.add(Leaf()); // Leaf 2
  innerComposite.add(Leaf()); // Leaf 3

  composite.add(innerComposite);

  composite.execute();
}
