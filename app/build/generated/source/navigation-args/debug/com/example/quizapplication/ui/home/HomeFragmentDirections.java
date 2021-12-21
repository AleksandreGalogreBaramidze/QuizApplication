package com.example.quizapplication.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.quizapplication.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToQuestionsFragment actionHomeFragmentToQuestionsFragment(int id,
      @NonNull String userName) {
    return new ActionHomeFragmentToQuestionsFragment(id, userName);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToStartPageFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_startPageFragment);
  }

  public static class ActionHomeFragmentToQuestionsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToQuestionsFragment(int id, @NonNull String userName) {
      this.arguments.put("id", id);
      if (userName == null) {
        throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userName", userName);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToQuestionsFragment setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToQuestionsFragment setUserName(@NonNull String userName) {
      if (userName == null) {
        throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userName", userName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id")) {
        int id = (int) arguments.get("id");
        __result.putInt("id", id);
      }
      if (arguments.containsKey("userName")) {
        String userName = (String) arguments.get("userName");
        __result.putString("userName", userName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_questionsFragment;
    }

    @SuppressWarnings("unchecked")
    public int getId() {
      return (int) arguments.get("id");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUserName() {
      return (String) arguments.get("userName");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToQuestionsFragment that = (ActionHomeFragmentToQuestionsFragment) object;
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != that.getId()) {
        return false;
      }
      if (arguments.containsKey("userName") != that.arguments.containsKey("userName")) {
        return false;
      }
      if (getUserName() != null ? !getUserName().equals(that.getUserName()) : that.getUserName() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getId();
      result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToQuestionsFragment(actionId=" + getActionId() + "){"
          + "id=" + getId()
          + ", userName=" + getUserName()
          + "}";
    }
  }
}
