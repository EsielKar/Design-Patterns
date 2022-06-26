package com.esielkar.builder;

public class BuilderExample {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();

        Director director = new Director(builder);
        director.make(1);
        System.out.println(builder.build());

        builder.reset();
        director.changeBuilder(builder);
        director.make(2);
        System.out.println(builder.build());

        builder.reset();
        builder.buildStepB();
        builder.buildStepC();
        System.out.println(builder.build());

    }

}
