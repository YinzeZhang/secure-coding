package com.dylan;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

public class WhileLoopsMustUseBracesRuleTest extends SimpleAggregatorTst {
    @Override
    public void setUp() {
        addRule("rulesets/rules.xml", "WhileLoopsMustUseBracesRule");
        addRule("rulesets/rules.xml", "WhileLoopsMustUseBracesXpath");
    }
}
