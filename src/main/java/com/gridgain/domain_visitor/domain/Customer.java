package com.gridgain.domain_visitor.domain;

import com.gridgain.domain_visitor.visitor.*;

import java.util.ArrayList;
import java.util.List;

public class Customer implements IDomainAcceptVisitor {

    private String name;
    private List<Order> orders;

    public Customer (String name) {
        this.name = name;
        orders = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void acceptBreadthFirst(IDomainVisitor v) {
        v.visit(this);
        for(Order o : orders) {
            o.acceptBreadthFirst(v);
        }
    }

    public void acceptDepthFirst(IDomainVisitor v) {
        for(Order o : orders) {
            o.acceptDepthFirst(v);
        }
        v.visit(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" ").append(name);
        return sb.toString();
    }

}