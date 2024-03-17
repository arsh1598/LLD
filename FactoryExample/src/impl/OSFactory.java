package impl;

import interfaces.OS;

public class OSFactory {

    public OS getInstance(String s){
        if(s.equals("Android")) return new Android();
        else return new IOS();
    }
}
