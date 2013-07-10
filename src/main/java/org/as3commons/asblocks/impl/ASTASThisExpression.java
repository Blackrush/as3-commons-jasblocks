package org.as3commons.asblocks.impl;

import org.as3commons.asblocks.dom.IASThisExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

/**
 * @author blackrush
 */
public class ASTASThisExpression extends ASTExpression implements IASThisExpression {
    public ASTASThisExpression(LinkedListTree ast) {
        super(ast);
    }
}
