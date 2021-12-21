package com.example.quizapplication.ui.splashscreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/quizapplication/ui/splashscreen/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "userPreference", "Lcom/example/quizapplication/user_preference/UserPreference;", "(Lcom/example/quizapplication/user_preference/UserPreference;)V", "_isLogged", "Landroidx/lifecycle/MutableLiveData;", "", "isLogged", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "getUserName", "", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.quizapplication.user_preference.UserPreference userPreference = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLogged;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLogged = null;
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.user_preference.UserPreference userPreference) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLogged() {
        return null;
    }
    
    public final void getUserName() {
    }
}