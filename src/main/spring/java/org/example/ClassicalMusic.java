package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }

    @Override
    public String getSong() {
        return "Classic song";
    }
}
