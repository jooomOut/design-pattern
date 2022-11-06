package com.company.structure.decorator.example;

public class TextView implements VisualComponent {
    @Override
    public void draw() {
        System.out.println("Draw in TextView");
    }
}
