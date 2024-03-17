package impl;

import interfaces.OS;

public class Android implements OS {
    @Override
    public void spec() {
        System.out.println("In Android");
    }
}
