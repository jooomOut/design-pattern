package com.company.structure.composite.template;

public class Leaf extends Component{
    Leaf(int value, Component parent){
        this.value = value;
        this.parent = parent;
    }

}
