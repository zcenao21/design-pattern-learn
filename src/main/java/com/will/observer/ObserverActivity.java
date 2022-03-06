package com.will.observer;

import com.will.observer.service.ObjectFor3D;
import com.will.observer.subscriber.ObserverUser1;
import com.will.observer.subscriber.ObserverUser2;

public class ObserverActivity{
    public static void main(String[] args) {
        // 创建服务号
        ObjectFor3D objectFor3D= new ObjectFor3D();
        // 创建两个订阅者
        ObserverUser1 observerUser1 = new ObserverUser1(objectFor3D);
        ObserverUser2 observerUser2 = new ObserverUser2(objectFor3D);
        // 两个观察者,发送两条信息
        objectFor3D.setMsg("201610121 的3D号为:127");
        objectFor3D.setMsg("20161022 的3D号为:000");
    }
}