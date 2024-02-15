package com.gridgain.domain_visitor.domain;

import com.gridgain.domain_visitor.visitor.*;

public class Item implements IDomainAcceptVisitor {

    private static final String DEFAULT_NAME = "N/A";
    private static final Integer DEFAULT_QUANTITY = 0;

    private String itemName;
    private Integer quantity;

    public Item() {
        itemName = DEFAULT_NAME;
        quantity = DEFAULT_QUANTITY;
    }
    public Item(String itemName, Integer quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void acceptBreadthFirst(IDomainVisitor v) {
        v.visit(this);
    }

    public void acceptDepthFirst(IDomainVisitor v) {
        v.visit(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" ").append(itemName).append(", ").append(quantity);
        return sb.toString();
    }

}