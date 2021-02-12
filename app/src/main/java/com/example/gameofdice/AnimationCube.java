package com.example.gameofdice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Анимация кубиков
 */
public class AnimationCube {


    ObjectAnimator animationX, animationY, rotateAnimation;
    //размеры дисплея
    private final float displayHeight = (float) MainActivity.getInstance().getScreenHeight();
    private final float displayWidth = (float) MainActivity.getInstance().getScreenWidth();
    //точки для областей приземления кубиков
    //точка А1
    private final float a1_x = 100f;
    private final float a1_y = 100f;
    //точка B1
    private final float b1_x = (displayWidth/3f);
    private final float b1_y = 100f;
    //точка C1
    private final float c1_x = (displayWidth-(displayWidth/3f));
    private final float c1_y = 100f;
    //точка D1
    private final float d1_x = displayWidth;
    private final float d1_y = 100f;
    //точка E1
    private final float e1_x = 100f;
    private final float e1_y = displayHeight/5f;
    //черные кубики
    //точка А2
    private final float a2_x = 100f;
    private final float a2_y = displayHeight/2f;
    //точка B2
    private final float b2_x = (displayWidth/3f)-100f;
    private final float b2_y = displayHeight/2f;
    //точка C2
    private final float c2_x = (displayWidth-(displayWidth/3f)-100f);
    private final float c2_y = displayHeight/2f;
    //точка D2
    private final float d2_x = displayWidth-100f;
    private final float d2_y = displayHeight/2f;
    //точка E2
    private final float e2_x = 100f;
    private final float e2_y = displayHeight-(displayHeight/4f);


    //начальная точка броска красных кубиков
    public final float yStart = displayHeight*2;
    public final float xStart = displayWidth;
    //начальная точка броска черных кубиков
    public final float yBlackStart = -displayHeight;
    public final float xBlackStart = -displayWidth;

    //генерация точки приземления кубиков
    public float randomGeneratorX(float a, float b){
        Double generateX = (Double) (a + Math.random() * b);
        return generateX.floatValue();
    }
    public float randomGeneratorY(float c, float d){
        Double generateY = (Double) (c + Math.random() * d);
        return generateY.floatValue();
    }
    //проворот кубика
    public float randomRotation(float c, float d){
        Double generateR = (Double) (c + Math.random() * d);
        return generateR.floatValue();
    }


    //анимация первого кубика
    public void animationFirstObject() {
        float xEnd = randomGeneratorX(a1_x, b1_x);
        float yEnd = randomGeneratorY(a1_y, e1_y);
        float rotate = randomRotation(380f, 750f);

        AnimatorSet image1 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "x", xStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "y", yStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "rotation", 0f, rotate);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image1.playTogether(animationX, animationY, rotateAnimation);
        image1.start();
    }
    //анимация второго кубика
    public void animationTwoObject() {
        float xEnd = randomGeneratorX(b1_x, c1_x );
        float yEnd = randomGeneratorY(b1_y, e1_y);
        float rotate = randomRotation(280f, 750f);

        AnimatorSet image2 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "x", xStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "y", yStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "rotation", 0f, rotate);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image2.playTogether(animationX, animationY, rotateAnimation);
        image2.start();
    }
    //анимация третьего кубика
    public void animationThreeObject() {
        float xEnd = randomGeneratorX(c1_x, d1_x);
        float yEnd = randomGeneratorY(c1_y, e1_y);
        float rotate = randomRotation(280f, 750f);

        AnimatorSet image3 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "x", xStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "y", yStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "rotation", 0f, rotate);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image3.playTogether(animationX, animationY, rotateAnimation);
        image3.start();
    }
    //анимация первого черного кубика
    public void animationBlackFirstObject() {
        float xEnd = randomGeneratorX(a2_x, b2_x);
        float yEnd = randomGeneratorY(a2_y, e2_y);
        float rotate = randomRotation(380f, 750f);

        AnimatorSet image4 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView4(), "x", xBlackStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView4(), "y", yBlackStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView4(), "rotation", 0f, rotate);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image4.playTogether(animationX, animationY, rotateAnimation);
        image4.start();
    }
    //анимация второго черного кубика
    public void animationBlackTwoObject() {
        float xEnd = randomGeneratorX(b2_x, c2_x);
        float yEnd = randomGeneratorY(b2_y, e2_y);
        float rotate = randomRotation(280f, 750f);

        AnimatorSet image5 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView5(), "x", xBlackStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView5(), "y", yBlackStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView5(), "rotation", 0f, rotate);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image5.playTogether(animationX, animationY, rotateAnimation);
        image5.start();
    }
    //анимация третьего черного кубика
    public void animationBlackThreeObject() {
        float xEnd = randomGeneratorX(c2_x, d2_x);
        float yEnd = randomGeneratorY(c2_y, e2_y);
        float rotate = randomRotation(280f, 750f);

        AnimatorSet image6 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView6(), "x", xBlackStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView6(), "y", yBlackStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView6(), "rotation", 0f, rotate);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image6.playTogether(animationX, animationY, rotateAnimation);
        image6.start();
    }



}
