class Singleton {
  static int _instanceCount = 0;
  static get instanceCount => _instanceCount;

  static Singleton? _instance;
  //Singleton as property
  static Singleton get instance => _instance ??= Singleton._internal();
  //Singleton as method
  static Singleton getInstance() => _instance ??= Singleton._internal();
  //Singleton as factory constructor
  factory Singleton() => _instance ??= Singleton._internal();

  Singleton._internal() {
    _instanceCount++;
  }
}
