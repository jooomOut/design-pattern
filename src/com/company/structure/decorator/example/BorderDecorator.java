package com.company.structure.decorator.example;

public class BorderDecorator extends Decorator{
    public BorderDecorator(VisualComponent textView) {
        super(textView);
    }

    @Override
    public void draw() {
        System.out.println("add HorizontalSB");
        super.draw();
    }
}
