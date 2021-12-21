package com.example.quizapplication.ui.splashscreen;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.quizapplication.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToStartPageFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_startPageFragment);
  }

  @NonNull
  public static NavDirections actionSplashFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_homeFragment);
  }
}
