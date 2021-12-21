package com.example.quizapplication.ui.start;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J.\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/quizapplication/ui/start/StartPageViewModel;", "Landroidx/lifecycle/ViewModel;", "userPreference", "Lcom/example/quizapplication/user_preference/UserPreference;", "(Lcom/example/quizapplication/user_preference/UserPreference;)V", "logUser", "", "saveUserName", "userName", "", "validateUserName", "navigation", "Lkotlin/Function0;", "error", "Companion", "app_debug"})
public final class StartPageViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.quizapplication.user_preference.UserPreference userPreference = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.quizapplication.ui.start.StartPageViewModel.Companion Companion = null;
    private static final int MINIMUM_PASSWORD_LENGTH = 3;
    
    @javax.inject.Inject()
    public StartPageViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.user_preference.UserPreference userPreference) {
        super();
    }
    
    private final void saveUserName(java.lang.String userName) {
    }
    
    private final void logUser() {
    }
    
    public final void validateUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> navigation, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> error) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/quizapplication/ui/start/StartPageViewModel$Companion;", "", "()V", "MINIMUM_PASSWORD_LENGTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}