package com.gridgain.domain_visitor.domain;

import com.gridgain.domain_visitor.visitor.*;

import java.util.ArrayList;
import java.util.List;

public class Order implements IDomainAcceptVisitor {

    private String name;
    private List<Item> items;

    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public void acceptBreadthFirst(IDomainVisitor v) {
        v.visit(this);
        for(Item i : items) {
            i.acceptBreadthFirst(v);
        }
    }

    public void acceptDepthFirst(IDomainVisitor v) {
        for(Item i : items) {
            i.acceptDepthFirst(v);
        }
        v.visit(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" ").append(getName());
        return sb.toString();
    }

}