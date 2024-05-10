package org.designpattern.behavioral.visitor.elements;

import org.designpattern.behavioral.visitor.visitors.ShoppingCartVisitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
