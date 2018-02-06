package com.yangxin.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/6.
 */

public class CurrentClient {

    public static void test() {
        List<IElement> elements = new ArrayList<>();
        elements.add(new ElementA());
        elements.add(new ElementB());
        for (IElement e : elements) {
            e.accept(new ConcreteVistor());
        }
    }
}
