package com.example.spacemad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Boom {

    Bitmap boom;
    Context context;
    int shx, shy;

    public Boom(Context context, int shx, int shy) {
        this.context = context;
        // Decode the bitmap with smaller dimensions
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 3; // Adjust this value to resize the image accordingly
        boom = BitmapFactory.decodeResource(context.getResources(), R.drawable.boom, options);
        this.shx = shx;
        this.shy = shy;
    }
    public Bitmap getBoom(){
        return boom;
    }
    public int getBoomWidth() {
        return boom.getWidth();
    }
    public int getBoomHeight() {
        return boom.getHeight();
    }


}