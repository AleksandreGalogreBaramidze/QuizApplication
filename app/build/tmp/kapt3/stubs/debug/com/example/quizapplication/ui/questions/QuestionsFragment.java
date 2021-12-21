package com.example.quizapplication.ui.questions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR.\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/quizapplication/ui/questions/QuestionsFragment;", "Lcom/example/quizapplication/ui/basefragment/BaseFragment;", "Lcom/example/quizapplication/databinding/QuestionsFragmentBinding;", "Lcom/example/quizapplication/ui/questions/QuestionsViewModel;", "()V", "args", "Lcom/example/quizapplication/ui/questions/QuestionsFragmentArgs;", "getArgs", "()Lcom/example/quizapplication/ui/questions/QuestionsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "inflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getInflater", "()Lkotlin/jvm/functions/Function3;", "questionsRecyclerAdapter", "Lcom/example/quizapplication/ui/adapters/QuestionsRecyclerAdapter;", "userName", "", "addScore", "", "viewModel", "dialog", "dialogText", "getViewModel", "Ljava/lang/Class;", "initFragment", "initRecycler", "setListeners", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class QuestionsFragment extends com.example.quizapplication.ui.basefragment.BaseFragment<com.example.quizapplication.databinding.QuestionsFragmentBinding, com.example.quizapplication.ui.questions.QuestionsViewModel> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter questionsRecyclerAdapter;
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.quizapplication.ui.questions.QuestionsFragment.Companion Companion = null;
    private static final int UNCHECKED = -1;
    
    public QuestionsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, com.example.quizapplication.databinding.QuestionsFragmentBinding> getInflater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<com.example.quizapplication.ui.questions.QuestionsViewModel> getViewModel() {
        return null;
    }
    
    private final com.example.quizapplication.ui.questions.QuestionsFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void initFragment(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.ui.questions.QuestionsViewModel viewModel) {
    }
    
    private final void initRecycler() {
    }
    
    private final void addScore(com.example.quizapplication.ui.questions.QuestionsViewModel viewModel) {
    }
    
    private final void dialog(java.lang.String dialogText) {
    }
    
    private final void setListeners(com.example.quizapplication.ui.questions.QuestionsViewModel viewModel) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/quizapplication/ui/questions/QuestionsFragment$Companion;", "", "()V", "UNCHECKED", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}