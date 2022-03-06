package com.will.observer.service;

import com.will.observer.iface.Observer;
import com.will.observer.iface.Subject;
import java.util.ArrayList;

public class ObjectFor3D implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    /**
     * 3D 彩票的号码
     */
    private String msg;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
    /**
     * 主题更新信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
