package com.yangxin.designpattern.builder;

/**
 * Created by liangyu on 17/11/12.
 */

public class Transformer {

    private TransformerBuilder transformerBuilder;

    public Transformer(TransformerBuilder builder) {
        transformerBuilder = builder;
    }
}
