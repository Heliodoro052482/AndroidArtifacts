package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FitWindowsFrameLayout extends FrameLayout implements FitWindowsViewGroup {
   private FitWindowsViewGroup.OnFitSystemWindowsListener mListener;

   public FitWindowsFrameLayout(Context context) {
      super(context);
   }

   public FitWindowsFrameLayout(Context context, AttributeSet attrs) {
      super(context, attrs);
   }

   public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener listener) {
      this.mListener = listener;
   }

   protected boolean fitSystemWindows(Rect insets) {
      if (this.mListener != null) {
         this.mListener.onFitSystemWindows(insets);
      }

      return super.fitSystemWindows(insets);
   }
}