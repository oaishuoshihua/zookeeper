package com.sodyu.learn.zookeeper.lock;

import java.util.concurrent.locks.Lock;

/**
 * Created by sodyu on 2018/3/18.
 */
public interface IZKLock extends Lock{
    void lock();

}
