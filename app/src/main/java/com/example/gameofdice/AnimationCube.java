package com.example.gameofdice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationCube {

    ObjectAnimator animationX, animationY, rotateAnimation;

    public void animationFirstObject() {
        Double generateX = (Double) (0 + Math.random() * 500);
        Double generateY = (Double) (100 + Math.random() * 700);
        float xEnd = generateX.floatValue();
        float yEnd = generateY.floatValue();

        AnimatorSet image1 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "x", -300f, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "y", -300f, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView1(), "rotation", 0f, yEnd);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image1.playTogether(animationX, animationY, rotateAnimation);
        image1.start();
    }

    public void animationTwoObject() {
        Double generateX = (Double) (0 + Math.random() * 500);
        Double generateY = (Double) (100 + Math.random() * 700);
        float xEnd = generateX.floatValue();
        float yEnd = generateY.floatValue();

        AnimatorSet image2 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "x", -300f, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "y", -300f, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView2(), "rotation", 0f, yEnd);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image2.playTogether(animationX, animationY, rotateAnimation);
        image2.start();
    }

    public void animationThreeObject() {
        Double generateX = (Double) (0 + Math.random() * 500);
        Double generateY = (Double) (100 + Math.random() * 700);
        float xEnd = generateX.floatValue();
        float yEnd = generateY.floatValue();

        AnimatorSet image3 = new AnimatorSet();
        animationX = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "x", -300f, xEnd);
        animationY = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "y", -300f, yEnd);
        rotateAnimation = ObjectAnimator.ofFloat(MainActivity.getInstance().getCubeImageView3(), "rotation", 0f, yEnd);
        animationX.setDuration(1000);
        animationY.setDuration(1000);
        rotateAnimation.setDuration(1000);
        image3.playTogether(animationX, animationY, rotateAnimation);
        image3.start();
    }



}
