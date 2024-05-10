package org.designpattern.behavioral.visitor.visitors;

import org.designpattern.behavioral.visitor.elements.Book;
import org.designpattern.behavioral.visitor.elements.Fruit;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
