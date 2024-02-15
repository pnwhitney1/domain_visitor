# Domain Visitor

## Overview
This program provides an example of the use of the visitor pattern.

The example program uses a simple domain of a Customer having 1 to many
Orders and an Order having 1 to many Items  

The example implements a PrintOnVisitVisitor that invokes the toString
method of each object that it visits. This provides a display of each
class name along with any relevant class variables.  

Each of the Domain Classes (Customer, Order, Item) implement examples
of breadth first visitation (visting objects from top to bottom) and
depth first visitation (visiting objects at the bottom of the domain 
object graph followed by objects further up the object graph)  

Note that separate visitor implementations can be created such as a visitor
to save objects into a database, or for the execution of business logic. One
item that may not be quite obvious is for a database saving visitor the 
visitor could navigate the graph and collect all of the inserts, updates and
deletions and subsequently execute these in batch fashion for each distinct
class / table. This would greatly improve performance as opposed to executing
each crud operation individually!  

The core value of visitor is that the navigation code is written once and
executed by subsequently implementing new visitors for different purposes.  

The main class (DomainVisitorMain) builds a domain graph of 1 Customer with
2 Orders and each Order having 2 Items. This class then executes both a breadth
first visitation and then a depth first visitation.  

Each domain object (Customer, Order, Item) provides an implementation of the
IDomainAcceptVisitor interface. These implementations are coded to execute
either a self visit followed by a child object accept invocation (breadth first)
or a child object accept visitation followed by a self visit (depth first).  

The PrintoutOnVisitVisitor provides the implementation of exactly what to do
when objects are visited.  

## Arguments
The program takes no arguments  

## Build
The code base can be built with maven by navigating to the domain_visitor
directory and invoking the following build command:
mvn clean package  

## Example Invocations
Example invocation is listed below:  
  java -cp domain_visitor.jar com.gridgain.domain_visitor.DomainVisitorMain  


