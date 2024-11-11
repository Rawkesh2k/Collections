package com.collections.java.set;

import java.util.EnumSet;

public class EnumSetImpl {

    //creating an enum
    enum Lang {
        Java,
        CSharp,
        JavaScript,
        Python,
        Linux
    }


    public static void main(String[] args) {

        //creating an new enum set
        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
        System.out.println(langs);

        //creating an empty enum
        EnumSet<Lang> emptyLangs = EnumSet.noneOf(Lang.class);
        System.out.println(emptyLangs);

        //range(element1, element2)
        EnumSet<Lang> range = EnumSet.range(Lang.Java, Lang.Python);
        System.out.println(range);

        //of()
        EnumSet<Lang> cSharpEnum = EnumSet.of(Lang.CSharp);
        System.out.println(cSharpEnum);


    }
}
