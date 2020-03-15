package com.company;

import java.util.ArrayList;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<String> testheros = new ArrayList<String>();
        testheros.add("1");
        testheros.add("2");
        testheros.add("3");
        String[] list = new String[testheros.size()];
        testheros.toArray(list);
        for (int i = 0;i < testheros.size();i ++){
            System.out.print(list[i]);
        }
        String[] array = (String[])testheros.toArray(new String[testheros.size()]);
        ArrayList<Hero> her = new ArrayList<>();
        ArrayList<Hero> heros =new ArrayList<>();
//        heros.add(1);
//        heros.add(new Hero("盖伦"));
//        heros.add(new Hero("提莫"));
//        heros.add(new Hero(2));
        for (int i = 0;i < 5; i++){
            heros.add(new Hero("hero"+1));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        System.out.println("ArrayList的大小是：");
        System.out.println(heros.size());
        System.out.println("当前ArrayList是：");
        System.out.println(heros.toString());
        System.out.println("ArrayList是否包含hero 1：");
        System.out.println(heros.contains(new Hero("hero1")));
        System.out.println("当前ArrayList是：");
        System.out.println(heros.toString());
        System.out.println("ArrayList是否包含：special hero");
        System.out.println(heros.contains(specialHero));
        System.out.println(heros.get(5));
        System.out.println(heros.indexOf(specialHero));
        System.out.println(heros.remove(specialHero));
        System.out.println("当前ArrayList是：");
        System.out.println(heros.toString());
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
        String name = "hero1";
        for (int i = 0; i < hs.length;i++){
            if (name.equals(hs[i])){
                System.out.println("ok");
            }

        }
        heros.clear();
    }
}
