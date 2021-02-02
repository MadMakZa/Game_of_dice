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
    //начальная точка броска красных кубиков
    public final float yStart = MainActivity.getInstance().getScreenHeight();
    public final float xStart = MainActivity.getInstance().getScreenWidth();
    //начальная точка броска черных кубиков
    public final float yBlackStart = -MainActivity.getInstance().getScreenHeight();;
    public final float xBlackStart = -MainActivity.getInstance().getScreenWidth();;

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
        float xEnd = randomGeneratorX(0f, 200f);
        float yEnd = randomGeneratorY(300f, 750f);
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
        float xEnd = randomGeneratorX(250f, 400f);
        float yEnd = randomGeneratorY(300f, 850f);
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
        float xEnd = randomGeneratorX(270f, 400f);
        float yEnd = randomGeneratorY(780f, 1000f);
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
        float xEnd = randomGeneratorX(200f, 750f);
        float yEnd = randomGeneratorY(500f, 950f);
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
        float xEnd = randomGeneratorX(100f, 750f);
        float yEnd = randomGeneratorY(600f, 1000f);
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
        float xEnd = randomGeneratorX(300f, 750f);
        float yEnd = randomGeneratorY(700f, 1050f);
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
