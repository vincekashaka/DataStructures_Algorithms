package com.vince.Recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));
    }

    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up .charAt(0);

        subseq(p, up.substring(1));
        subseq(p + ch, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up .charAt(0);

          ArrayList<String> left =  subseqRet(p, up.substring(1));
          ArrayList<String> right = subseqRet(p + ch, up.substring(1));

          left.addAll(right);
          return left;
    }
}
