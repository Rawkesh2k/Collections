package com.collections.java.set;

import java.util.EnumSet;
import java.util.Iterator;

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

        //of() - to create an enumset of specific element
        EnumSet<Lang> cSharpEnum = EnumSet.of(Lang.CSharp);
        System.out.println(cSharpEnum);

        //to create an enumset of multiple elements
        EnumSet<Lang> multiENumVals = EnumSet.of(Lang.Linux, Lang.Java);
        System.out.println(multiENumVals);

        //add(), addAll()

        EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);

        //adding one element from lang1 to empty lang2
        lang2.add(Lang.Linux);
        System.out.println(lang2);
        //adding all elements from lang1 to lang2
        lang2.addAll(lang1);
        System.out.println(lang2);

        //iteration
        EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
        Iterator<Lang> iterator = fullLang.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //remove(), removeAll()
        System.out.println("Enum Set before removal -> " + fullLang);
        fullLang.remove(Lang.CSharp);
        System.out.println("Enum Set after removal -> " + fullLang);
        System.out.println("--------------------------------------");
        System.out.println("Enum Set before removal of all items ->" + fullLang);

        fullLang.removeAll(fullLang);
        System.out.println("Enum Set after removal of all items -> " + fullLang);

        //can use clear() method to clear/remove as well
        fullLang.clear();
        System.out.println(fullLang);
    }
}
