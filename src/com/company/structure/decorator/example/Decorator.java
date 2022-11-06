package com.company.structure.decorator.example;

public class Decorator implements VisualComponent {
    private VisualComponent textView;

    public Decorator(VisualComponent textView) {
        this.textView = textView;
    }

    @Override
    public void draw() {
        this.textView.draw();
    }
}
