package com.example.quizapplication.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/quizapplication/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "userPreference", "Lcom/example/quizapplication/user_preference/UserPreference;", "resProvider", "Lcom/example/quizapplication/util/ResProvider;", "quizRepoImplementation", "Lcom/example/quizapplication/repository/JsonRepositoryImplementation;", "(Lcom/example/quizapplication/user_preference/UserPreference;Lcom/example/quizapplication/util/ResProvider;Lcom/example/quizapplication/repository/JsonRepositoryImplementation;)V", "_nameLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_optionLiveData", "Lcom/example/quizapplication/models/Quiz;", "_userNameLiveData", "nameLivedata", "Landroidx/lifecycle/LiveData;", "getNameLivedata", "()Landroidx/lifecycle/LiveData;", "optionLiveData", "getOptionLiveData", "userNameLiveData", "getUserNameLiveData", "getOptions", "", "getUserName", "getUserPreferences", "logOut", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.quizapplication.user_preference.UserPreference userPreference = null;
    private final com.example.quizapplication.util.ResProvider resProvider = null;
    private final com.example.quizapplication.repository.JsonRepositoryImplementation quizRepoImplementation = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _nameLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> nameLivedata = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _userNameLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> userNameLiveData = null;
    private androidx.lifecycle.MutableLiveData<com.example.quizapplication.models.Quiz> _optionLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.quizapplication.models.Quiz> optionLiveData = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.user_preference.UserPreference userPreference, @org.jetbrains.annotations.NotNull()
    com.example.quizapplication.util.ResProvider resProvider, @org.jetbrains.annotations.NotNull()
    com.example.quizapplication.repository.JsonRepositoryImplementation quizRepoImplementation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNameLivedata() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getUserNameLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.quizapplication.models.Quiz> getOptionLiveData() {
        return null;
    }
    
    public final void getOptions() {
    }
    
    public final void getUserName() {
    }
    
    public final void logOut() {
    }
    
    public final void getUserPreferences() {
    }
}