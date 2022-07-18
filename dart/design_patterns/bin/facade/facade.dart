import 'subsystem.dart';

class Facade {
  final _subsystem = new Subsystem1();
  final _subsystem2 = new Subsystem2();
  final _additonalFacade = new AdditonalFacade();

  void subsystemsOperation() {
    _subsystem.execute();
    _subsystem2.execute();
    _additonalFacade.subsystemsOperation();
  }
}

class AdditonalFacade {
  final _subsystem3 = Subsystem3();

  void subsystemsOperation() {
    _subsystem3.execute();
  }
}
