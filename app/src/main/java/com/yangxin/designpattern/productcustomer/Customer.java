package com.yangxin.designpattern.productcustomer;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/3/1.
 */

public class Customer extends Thread {

    private Product mProduct;

    public Customer(Product product) {
        this.mProduct = product;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (mProduct != null) {
                synchronized (mProduct) {
                    while (mProduct != null) {
                        if (mProduct.getCount() > 0) {
                            System.out.println("custome--goods--" + mProduct.getCount());
                            mProduct.setCount(mProduct.getCount() - 1);
                            sleep(100);
                        } else {
                            mProduct.notifyAll();
                            break;
                        }
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
