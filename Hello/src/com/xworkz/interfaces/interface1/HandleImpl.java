package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Handle;

public class HandleImpl implements Handle {
    public void grip() {
        System.out.println("grip called");
    }
    public void twist() {
        System.out.println("twist called");
    }
    public void pull() {
        System.out.println("pull called");
    }

}
