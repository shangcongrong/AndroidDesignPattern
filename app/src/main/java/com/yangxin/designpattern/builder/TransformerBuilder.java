package com.yangxin.designpattern.builder;

/**
 * Created by liangyu on 17/11/12.
 */

public class TransformerBuilder {

    private String head;
    private String arms;
    private String legs;
    private String body;

    public TransformerBuilder() {
        head = "我来组成头部";
        arms = "我来组成手臂";
        legs = "我来组成腿部";
        body = "我来组成躯干";
    }

    public String getHead() {
        return head;
    }

    public TransformerBuilder setHead(String head) {
        this.head = head;
        return this;
    }

    public String getArms() {
        return arms;
    }

    public TransformerBuilder setArms(String arms) {
        this.arms = arms;
        return this;
    }

    public String getLegs() {
        return legs;
    }

    public TransformerBuilder setLegs(String legs) {
        this.legs = legs;
        return this;
    }

    public String getBody() {
        return body;
    }

    public TransformerBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public Transformer build(){
        return new Transformer(this);
    }
}
