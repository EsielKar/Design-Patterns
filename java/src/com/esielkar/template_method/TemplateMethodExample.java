package com.esielkar.template_method;

public class TemplateMethodExample {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass();
        AbstractClass class2 = new ConcreteClass2();

        System.out.println("Template method ConcreteClass");
        class1.templateMethod();

        System.out.println("Template method ConcreteClass2");
        class2.templateMethod();
    }
}
