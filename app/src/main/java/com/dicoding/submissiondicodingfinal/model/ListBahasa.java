package com.dicoding.submissiondicodingfinal.model;

import java.util.ArrayList;

public class ListBahasa {
    public static String[][] dataList = new String[][]{
            {"Python","adf","https://banner2.kisspng.com/20180804/zxy/kisspng-python-computer-icons-programmer-javascript-progra-tweet-on-twitter-trend-by-gp_pulipaka-twitter-tre-5b6648da225a38.5188591515334299781407.jpg"},
            {"Java","",""},
            {"Kotlin","",""},
            {"C","",""},
            {"C++","",""},
            {"C#","",""},
            {"JavaScript","",""},
            {"Swift","",""},
            {"Ruby","","https://www.pinclipart.com/picdir/middle/11-118411_nice-ideas-ruby-clipart-3-clip-art-ruby.png"},
            {"PHP","",""},


    };
    public static ArrayList<varData> getListData(){
        ArrayList<varData> list = new ArrayList<>();
        for (String[] aData : dataList) {
            varData varData = new varData();
            varData.setName(aData[0]);
            varData.setFrom(aData[1]);
            varData.setPhoto(aData[2]);
            list.add(varData);
        }
        return list;
    }
}
