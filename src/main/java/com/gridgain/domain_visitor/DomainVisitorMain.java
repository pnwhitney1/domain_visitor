package src.main.java.com.gridgain.domain_visitor;

import com.gridgain.domain_visitor.domain.*;
import com.gridgain.domain_visitor.visitor.PrintoutOnVisitVisitor;

public class DomainVisitorMain {

    public static void main(String args[]) {
        Customer c = buildDomainGraph();
        System.out.println(" ");
        System.out.println("Breadth first visitation");
        visitBreadthFirst(c);
        System.out.println(" ");
        System.out.println("Depth first visitation");
        visitDepthFirst(c);
        System.out.println(" ");
    }

    private static Customer buildDomainGraph() {
        Customer c = new Customer("Pete");
        Order o1 = new Order("alcohol");
        o1.addItem(new Item("beer", 6));
        o1.addItem(new Item("rum", 1));
        c.addOrder(o1);
        Order o2 = new Order("munchies");
        o2.addItem(new Item("pretzels", 1));
        o2.addItem(new Item("chips", 1));
        c.addOrder(o2);
        return c;
    }

    private static void visitBreadthFirst(Customer c) {
        PrintoutOnVisitVisitor pov = new PrintoutOnVisitVisitor();
        c.acceptBreadthFirst(pov);
    }

    private static void visitDepthFirst(Customer c) {
        PrintoutOnVisitVisitor pov = new PrintoutOnVisitVisitor();
        c.acceptDepthFirst(pov);
    }

}
