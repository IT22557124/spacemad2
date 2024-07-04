package com.example.spacemad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Alien {

    Context context;
    Bitmap enemyAlien;
    int ex,ey;
    int enemyVelosity;
    Random random;

    public Alien(Context context){
        this.context = context;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2; // Adjust this value to resize the image accordingly
        enemyAlien = BitmapFactory.decodeResource(context.getResources(), R.drawable.alian2, options);
        random = new Random();
        resetEnemyAlien();
    }

    public Bitmap getEnemyAlien() {
        return enemyAlien;
    }
    int getEnemyAlienWidth(){
        return enemyAlien.getWidth();
    }

    int getEnemyAlienHeight(){
        return enemyAlien.getHeight();
    }

    private void resetEnemyAlien(){
        ex = 200 + random.nextInt(400);
        ey = 0;
        enemyVelosity = 17+random.nextInt(10);
    }

}