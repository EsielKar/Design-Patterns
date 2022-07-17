abstract class Component {
  void execute();
}

class ConcreteComponent extends Component {
  @override
  void execute() {
    print("Execute from ConcreteComponent");
  }
}
