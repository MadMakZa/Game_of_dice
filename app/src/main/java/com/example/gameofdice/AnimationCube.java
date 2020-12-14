package com.example.gameofdice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Анимация кубиков Кэп
 */
public class AnimationCube {

    ObjectAnimator animationX, animationY, rotateAnimation;
    //начальная точка броска кубиков
    public final float yStart = 2000f;
    public final float xStart = 500f;
    //конечная точка
    public final float xEnd = randomGeneratorX();
    public final float yEnd = randomGeneratorY();
    //генерация точки приземления кубиков
    public float randomGeneratorX(){
        Double generateX = (Double) (0 + Math.random() * 700);
        return generateX.floatValue();
    }
    public float randomGeneratorY(){
        Double generateY = (Double) (100 + Math.random() * 700);
        return generateY.floatValue();
    }
    public float randomGeneratorSplit(){
        Double generateY = (Double) (75 + Math.random() * 150);
        return generateY.floatValue();
    }


    //анимация первого кубика
    public void animationFirstObject() {

        AnimatorSet image1 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "x", xStart, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "y", yStart, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "rotation", 0f, yEnd);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image1.playTogether(animationX, animationY, rotateAnimation);
        image1.start();
    }
    //анимация второго кубика
    public void animationTwoObject() {
        float split = xEnd + randomGeneratorSplit();
        float split2 = yEnd + randomGeneratorSplit();

        AnimatorSet image2 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "x", xStart, split);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "y", yStart, split2);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "rotation", 0f, yEnd);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image2.playTogether(animationX, animationY, rotateAnimation);
        image2.start();
    }
    //анимация третьего кубика
    public void animationThreeObject() {
        float split = xEnd + randomGeneratorSplit();
        float split2 = yEnd + randomGeneratorSplit();

        AnimatorSet image3 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "x", xStart, split);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "y", yStart, split2);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "rotation", 0f, yEnd);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image3.playTogether(animationX, animationY, rotateAnimation);
        image3.start();
    }



}
