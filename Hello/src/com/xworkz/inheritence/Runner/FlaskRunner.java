package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.flask.Flask;
import com.xworkz.inheritence.internal.flask.Cap;

public class FlaskRunner {
    public static void main(String[] args) {
        Flask flask =new Cap();
        flask.fill();
        flask.frozen();
        flask.glass();
        flask.milk();
        flask.water();

        System.out.println("**************************************");
        Cap cap = new Cap();
        cap.fill();
        cap.frozen();
        cap.glass();
        cap.milk();
        cap.water();

        System.out.println("**************************************");

    }
}
