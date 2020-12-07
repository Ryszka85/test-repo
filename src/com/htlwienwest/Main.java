package com.htlwienwest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("hallo fucking world");*/
        List<Greeter> foo = new ArrayList<>();
        foo.add(() -> System.out.println("Geh scheissen"));
        foo.add(() -> System.out.println("Du kannst mich mal"));
        foo.add(() -> System.out.println("Du kannst mich mal 30"));
        foo.forEach(Greeter::greet);

    }
}
