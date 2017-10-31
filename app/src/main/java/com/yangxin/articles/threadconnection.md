### Android多线程之间的通信方式：

1.runOnUiThread；

2.Handler+Looper+Message；

3.AsyncTask；

4.post和postDelay；

5.广播broadCast；

6.eventbus；

### java线程之间的通信方式：

1.synchronized；

2.while轮询，在一个线程中一直轮询等待另一个线程执行完成；缺点是：会浪费cpu资源；

3.wait/notify机制；