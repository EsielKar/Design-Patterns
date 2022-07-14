mixin Prototype {
  Prototype clone();
}

class ConcretePrototype with Prototype {
  int value;

  ConcretePrototype(this.value);

  //Named clone constructor (Easy copy)
  ConcretePrototype.clone(ConcretePrototype prototype)
      : value = prototype.value;

  //Factory clone constructor (Complex copy)
  factory ConcretePrototype.cloneFrom(ConcretePrototype prototype) =>
      ConcretePrototype(prototype.value);

  //Clone method (Easy/complex copy)
  @override
  Prototype clone() => ConcretePrototype.cloneFrom(this);
}

class ConcretePrototype2 extends ConcretePrototype {
  String value2;

  ConcretePrototype2(super.value, this.value2);

  ConcretePrototype2.clone(ConcretePrototype2 prototype2)
      : value2 = prototype2.value2,
        super.clone(prototype2);

  factory ConcretePrototype2.cloneFrom(ConcretePrototype2 prototype2) =>
      ConcretePrototype2(prototype2.value, prototype2.value2);

  @override
  Prototype clone() => ConcretePrototype2.cloneFrom(this);
}
