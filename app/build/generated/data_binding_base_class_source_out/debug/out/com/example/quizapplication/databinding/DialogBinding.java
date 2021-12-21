// Generated by view binder compiler. Do not edit!
package com.example.quizapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.quizapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton XBtn;

  @NonNull
  public final TextView userScoreTV;

  private DialogBinding(@NonNull FrameLayout rootView, @NonNull ImageButton XBtn,
      @NonNull TextView userScoreTV) {
    this.rootView = rootView;
    this.XBtn = XBtn;
    this.userScoreTV = userScoreTV;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.XBtn;
      ImageButton XBtn = ViewBindings.findChildViewById(rootView, id);
      if (XBtn == null) {
        break missingId;
      }

      id = R.id.userScoreTV;
      TextView userScoreTV = ViewBindings.findChildViewById(rootView, id);
      if (userScoreTV == null) {
        break missingId;
      }

      return new DialogBinding((FrameLayout) rootView, XBtn, userScoreTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}