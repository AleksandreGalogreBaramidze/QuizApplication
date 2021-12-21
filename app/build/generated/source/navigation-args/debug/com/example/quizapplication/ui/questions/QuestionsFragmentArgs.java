package com.example.quizapplication.ui.questions;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class QuestionsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private QuestionsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private QuestionsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static QuestionsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    QuestionsFragmentArgs __result = new QuestionsFragmentArgs();
    bundle.setClassLoader(QuestionsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("id")) {
      int id;
      id = bundle.getInt("id");
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("userName")) {
      String userName;
      userName = bundle.getString("userName");
      if (userName == null) {
        throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("userName", userName);
    } else {
      throw new IllegalArgumentException("Required argument \"userName\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    QuestionsFragmentArgs that = (QuestionsFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getId();
    result = 31 * result + (getUserName() != null ? getUserName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "QuestionsFragmentArgs{"
        + "id=" + getId()
        + ", userName=" + getUserName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(QuestionsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int id, @NonNull String userName) {
      this.arguments.put("id", id);
      if (userName == null) {
        throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userName", userName);
    }

    @NonNull
    public QuestionsFragmentArgs build() {
      QuestionsFragmentArgs result = new QuestionsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUserName(@NonNull String userName) {
      if (userName == null) {
        throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userName", userName);
      return this;
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
  }
}
