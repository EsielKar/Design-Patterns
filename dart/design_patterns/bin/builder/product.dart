class Product {
  bool _a;
  bool _b;
  bool _c;

  Product()
      : _a = false,
        _b = false,
        _c = false;

  set a(bool a) {
    _a = a;
  }

  set b(bool b) {
    _b = b;
  }

  set c(bool c) {
    _c = c;
  }

  @override
  String toString() => "A: $_a  B: $_b  C: $_c";
}
