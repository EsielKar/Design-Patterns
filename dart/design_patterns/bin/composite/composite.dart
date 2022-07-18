import 'package:meta/meta.dart';

abstract class Component {
  void execute();
}

@sealed
class Leaf extends Component {
  static int _sid = 0;
  final id = ++_sid;
  @override
  void execute() {
    print('Leaf $id - Does work');
  }
}

class Composite extends Component {
  static int _sid = 0;
  final id = ++_sid;
  final List<Component> _children;

  Composite([List<Component>? children])
      : _children = children ?? <Component>[];

  List<Component> get children => _children.toList(growable: false);
  void add(Component component) => _children.add(component);
  bool remove(Component component) => _children.remove(component);

  @override
  void execute() {
    print('Composite $id');
    for (Component component in _children) {
      component.execute();
    }
  }
}
