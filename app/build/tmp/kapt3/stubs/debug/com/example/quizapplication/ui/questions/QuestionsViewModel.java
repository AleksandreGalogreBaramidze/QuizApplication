package com.example.quizapplication.ui.questions;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u0002002\u0006\u00102\u001a\u000203J\u0016\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u000200J\u000e\u00107\u001a\u0002002\u0006\u00105\u001a\u00020\u0011J\u000e\u00108\u001a\u0002002\u0006\u00109\u001a\u00020\tJ\u000e\u0010:\u001a\u0002002\u0006\u00105\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001a\u0010\"\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010%\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/example/quizapplication/ui/questions/QuestionsViewModel;", "Landroidx/lifecycle/ViewModel;", "userPreference", "Lcom/example/quizapplication/user_preference/UserPreference;", "quizRepoImplementation", "Lcom/example/quizapplication/repository/JsonRepositoryImplementation;", "(Lcom/example/quizapplication/user_preference/UserPreference;Lcom/example/quizapplication/repository/JsonRepositoryImplementation;)V", "_answerLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_isQuizEnded", "", "_optionLiveData", "Lcom/example/quizapplication/models/QuizItem;", "_questionLiveData", "Lcom/example/quizapplication/models/Question;", "_scoreLiveData", "", "answerLiveData", "Landroidx/lifecycle/LiveData;", "getAnswerLiveData", "()Landroidx/lifecycle/LiveData;", "answerScores", "", "indexOfQuestion", "getIndexOfQuestion", "()I", "setIndexOfQuestion", "(I)V", "isQuizEnded", "optionLiveData", "getOptionLiveData", "questionLiveData", "getQuestionLiveData", "questionsLimit", "getQuestionsLimit", "setQuestionsLimit", "quizEnded", "getQuizEnded", "()Z", "setQuizEnded", "(Z)V", "score", "getScore", "setScore", "scoreLiveData", "getScoreLiveData", "addScore", "", "btnUnClickable", "btn", "Landroid/view/View;", "correctAnswers", "id", "userAnswer", "question", "saveScore", "userName", "setOption", "Companion", "app_debug"})
public final class QuestionsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.quizapplication.user_preference.UserPreference userPreference = null;
    private final com.example.quizapplication.repository.JsonRepositoryImplementation quizRepoImplementation = null;
    private androidx.lifecycle.MutableLiveData<com.example.quizapplication.models.QuizItem> _optionLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.quizapplication.models.QuizItem> optionLiveData = null;
    private androidx.lifecycle.MutableLiveData<com.example.quizapplication.models.Question> _questionLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.quizapplication.models.Question> questionLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _answerLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> answerLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _scoreLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> scoreLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isQuizEnded;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isQuizEnded = null;
    private final java.util.List<java.lang.Integer> answerScores = null;
    private boolean quizEnded = false;
    private int questionsLimit = 0;
    private int indexOfQuestion = 0;
    private int score = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.quizapplication.ui.questions.QuestionsViewModel.Companion Companion = null;
    private static final int FIRS_ITEM_INDEX = 0;
    private static final int DEFAULT_QUESTIONS_SIZE = 0;
    private static final int DEFAULT_SCORE = 0;
    private static final int ONE = 1;
    
    @javax.inject.Inject()
    public QuestionsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.user_preference.UserPreference userPreference, @org.jetbrains.annotations.NotNull()
    com.example.quizapplication.repository.JsonRepositoryImplementation quizRepoImplementation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.quizapplication.models.QuizItem> getOptionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.quizapplication.models.Question> getQuestionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAnswerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScoreLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isQuizEnded() {
        return null;
    }
    
    public final boolean getQuizEnded() {
        return false;
    }
    
    public final void setQuizEnded(boolean p0) {
    }
    
    public final int getQuestionsLimit() {
        return 0;
    }
    
    public final void setQuestionsLimit(int p0) {
    }
    
    public final int getIndexOfQuestion() {
        return 0;
    }
    
    public final void setIndexOfQuestion(int p0) {
    }
    
    public final int getScore() {
        return 0;
    }
    
    public final void setScore(int p0) {
    }
    
    public final void correctAnswers(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String userAnswer) {
    }
    
    public final void setOption(int id) {
    }
    
    public final void question(int id) {
    }
    
    public final void isQuizEnded() {
    }
    
    public final void addScore() {
    }
    
    public final void saveScore(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
    }
    
    public final void btnUnClickable(@org.jetbrains.annotations.NotNull()
    android.view.View btn) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/quizapplication/ui/questions/QuestionsViewModel$Companion;", "", "()V", "DEFAULT_QUESTIONS_SIZE", "", "DEFAULT_SCORE", "FIRS_ITEM_INDEX", "ONE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}