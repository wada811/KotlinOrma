package com.wada811.kotlinorma.data;

import android.content.Context;

public class OrmaDatabaseBuilder {

    public static OrmaDatabase build(Context context){
        return OrmaDatabase.builder(context).trace(true).build();
    }
}
