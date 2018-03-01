package com.yangxin.designpattern.productcustomer;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/28.
 */

public class Productor extends Thread {

    private Product mProduct;

    public Productor(Product product) {
        this.mProduct = product;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (mProduct) {
                if (mProduct.getCount() < 10) {
                    System.out.println("product--goods");
                    sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
