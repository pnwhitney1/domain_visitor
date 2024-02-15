package com.gridgain.domain_visitor.domain;

import com.gridgain.domain_visitor.visitor.*;

public interface IDomainAcceptVisitor {

    void acceptBreadthFirst(IDomainVisitor v);

    void acceptDepthFirst(IDomainVisitor v);
    
}
