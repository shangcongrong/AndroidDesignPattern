package com.yangxin.designpattern.productcustomer;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/28.
 */

public class Producer extends Thread {

    private Product mProduct;

    public Producer(Product product) {
        this.mProduct = product;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (mProduct != null) {
                synchronized (mProduct) {
                    while (mProduct != null) {
                        if (mProduct.getCount() < 10) {
                            System.out.println("product--goods--" + mProduct.getCount());
                            mProduct.setCount(mProduct.getCount() + 1);
                            sleep(100);
                        } else {
                            mProduct.wait();
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
