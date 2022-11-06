package com.company.structure.decorator.example;

public class ScrollDecorator extends Decorator{
    public ScrollDecorator(VisualComponent textView) {
        super(textView);
    }

    @Override
    public void draw() {
        System.out.println("Scroll in Decorator");
        super.draw();
    }
}
