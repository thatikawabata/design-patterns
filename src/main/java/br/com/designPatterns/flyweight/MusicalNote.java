package br.com.designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicalNote {
    private static Map<String, Note> music = new HashMap<>();

    static {
        music.put("do", new Do());
        music.put("re", new Re());
        music.put("mi", new Mi());
        music.put("fa", new Fa());
        music.put("sol", new Sol());
        music.put("la", new La());
        music.put("si", new Si());
    }

    public Note get(String name){
        return music.get(name);
    }
}
