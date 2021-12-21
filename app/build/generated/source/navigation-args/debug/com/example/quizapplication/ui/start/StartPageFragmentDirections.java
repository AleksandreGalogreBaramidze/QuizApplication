package com.example.quizapplication.ui.start;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.quizapplication.R;

public class StartPageFragmentDirections {
  private StartPageFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionStartPageFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_startPageFragment_to_homeFragment);
  }
}
