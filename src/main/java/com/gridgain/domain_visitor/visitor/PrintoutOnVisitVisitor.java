package com.gridgain.domain_visitor.visitor;

import com.gridgain.domain_visitor.domain.*;

public class PrintoutOnVisitVisitor implements IDomainVisitor {

    public void visit(Customer c) {
        displayVisit(c.toString());
    }

    public void visit(Order o) {
        displayVisit(o.toString());
    }

    public void visit(Item i) {
        displayVisit(i.toString());
    }

    private void displayVisit(String visitedInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" visiting ");
        sb.append(visitedInfo);
        System.out.println(sb.toString());
    }

}