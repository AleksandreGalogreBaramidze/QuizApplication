// Generated by Dagger (https://dagger.dev).
package com.example.quizapplication.ui.questions;

import com.example.quizapplication.repository.JsonRepositoryImplementation;
import com.example.quizapplication.user_preference.UserPreference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class QuestionsViewModel_Factory implements Factory<QuestionsViewModel> {
  private final Provider<UserPreference> userPreferenceProvider;

  private final Provider<JsonRepositoryImplementation> quizRepoImplementationProvider;

  public QuestionsViewModel_Factory(Provider<UserPreference> userPreferenceProvider,
      Provider<JsonRepositoryImplementation> quizRepoImplementationProvider) {
    this.userPreferenceProvider = userPreferenceProvider;
    this.quizRepoImplementationProvider = quizRepoImplementationProvider;
  }

  @Override
  public QuestionsViewModel get() {
    return newInstance(userPreferenceProvider.get(), quizRepoImplementationProvider.get());
  }

  public static QuestionsViewModel_Factory create(Provider<UserPreference> userPreferenceProvider,
      Provider<JsonRepositoryImplementation> quizRepoImplementationProvider) {
    return new QuestionsViewModel_Factory(userPreferenceProvider, quizRepoImplementationProvider);
  }

  public static QuestionsViewModel newInstance(UserPreference userPreference,
      JsonRepositoryImplementation quizRepoImplementation) {
    return new QuestionsViewModel(userPreference, quizRepoImplementation);
  }
}