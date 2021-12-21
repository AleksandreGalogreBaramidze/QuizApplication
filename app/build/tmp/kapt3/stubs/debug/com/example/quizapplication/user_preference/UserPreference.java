package com.example.quizapplication.user_preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/example/quizapplication/user_preference/UserPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreference", "Landroid/content/SharedPreferences;", "getSharedPreference", "()Landroid/content/SharedPreferences;", "sharedPreference$delegate", "Lkotlin/Lazy;", "currentUser", "", "isActive", "", "getCurrentUser", "getScore", "", "userName", "", "getUserName", "saveName", "name", "saveScore", "score", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class UserPreference {
    private final kotlin.Lazy sharedPreference$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.quizapplication.user_preference.UserPreference.Companion Companion = null;
    private static final java.lang.String PREFERENCE_TAG = "user_scores";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME_KEY = "name";
    private static final java.lang.String DEFAULT_NAME = "";
    private static final int DEFAULT_SCORE = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_USER = "isActive";
    public static final boolean DEFAULT_CURRENT_USER = false;
    
    @javax.inject.Inject()
    public UserPreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreference() {
        return null;
    }
    
    public final void saveName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void currentUser(boolean isActive) {
    }
    
    public final boolean getCurrentUser() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void saveScore(int score, @org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
    }
    
    public final int getScore(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/quizapplication/user_preference/UserPreference$Companion;", "", "()V", "CURRENT_USER", "", "DEFAULT_CURRENT_USER", "", "DEFAULT_NAME", "DEFAULT_SCORE", "", "NAME_KEY", "PREFERENCE_TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}