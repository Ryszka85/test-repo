package com.htlwienwest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("hallo fucking world");*/
        List<Gretter> foo = new ArrayList<>();
        foo.add(() -> System.out.println("Geh scheissen"));
        foo.add(() -> System.out.println("Du kannst mich mal 999"));
        foo.forEach(Gretter::greet);

    }
}
