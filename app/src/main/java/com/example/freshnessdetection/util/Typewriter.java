package com.example.freshnessdetection.util;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

public class Typewriter extends androidx.appcompat.widget.AppCompatTextView {

  private CharSequence mText;
  private int mIndex;
  private long mDelay = 500; //Default 500ms delay


  public Typewriter(Context context) {
    super(context);
  }

  public Typewriter(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  private final Handler mHandler = new Handler();
  private final Runnable characterAdder = new Runnable() {
    @Override
    public void run() {
      setText(mText.subSequence(0, mIndex++));
      if(mIndex <= mText.length()) {
        mHandler.postDelayed(characterAdder, mDelay);
      }
    }
  };

  public void animateText(CharSequence text) {
    mText = text;
    mIndex = 0;

    setText("");
    mHandler.removeCallbacks(characterAdder);
    mHandler.postDelayed(characterAdder, mDelay);
  }

  public void setCharacterDelay(long millis) {
    mDelay = millis;
  }
}