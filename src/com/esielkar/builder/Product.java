package com.esielkar.builder;

public class Product {
    private boolean a;
    private boolean b;
    private boolean c;

    public void setA(boolean a) {
        this.a = a;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "A: " + a + " B: " + b + " C: " + c;
    }

    public static class ProductBuilder implements Builder {
        private Product product;

        public ProductBuilder() {
            reset();
        }

        @Override
        public void reset() {
            product = new Product();
        }

        @Override
        public Builder buildStepA() {
            product.setA(true);
            return this;
        }

        @Override
        public Builder buildStepB() {
            product.setB(true);
            return this;
        }

        @Override
        public Builder buildStepC() {
            product.setC(true);
            return this;
        }

        public Product build() {
            return product;
        }

    }

}
