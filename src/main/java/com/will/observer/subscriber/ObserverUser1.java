package com.will.observer.subscriber;

import com.will.observer.iface.Observer;
import com.will.observer.iface.Subject;

public class ObserverUser1 implements Observer {
    public ObserverUser1(Subject subject) {
        subject.registerObserver(this);
    }
    @Override
    public void update(String msg) {
        System.out.println("-----ObserverUser1 "+ "得到 3D 号码:" + msg + ", 我要记下来。 ");
    }
}
