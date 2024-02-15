package com.gridgain.domain_visitor.visitor;

import com.gridgain.domain_visitor.domain.*;

public interface IDomainVisitor {

    void visit(Customer c);

    void visit(Order o);

    void visit(Item i);

}
