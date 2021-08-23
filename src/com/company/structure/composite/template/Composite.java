package com.company.structure.composite.template;

import java.util.Iterator;
import java.util.List;

public class Composite extends Component{
    private List<Component> children;

    @Override
    public void add(Component child){
        this.children.add(child);
    }
    public void remove(Component child){
        this.children.removeIf(target -> target.equals(child));
    }
    public List<Component> getChildren(){
        return this.children;
    }
}
