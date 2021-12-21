package com.example.quizapplication.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0005H\u0016J(\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u001dH\u0003J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0016\u0010$\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR9\u0010\n\u001a!\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000f0\u000bj\u0002`\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/quizapplication/ui/adapters/QuestionsRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/quizapplication/ui/adapters/QuestionsRecyclerAdapter$ViewHolder;", "()V", "alreadyChecked", "", "getAlreadyChecked", "()I", "setAlreadyChecked", "(I)V", "answer", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", "Lcom/example/quizapplication/util/answer;", "getAnswer", "()Lkotlin/jvm/functions/Function1;", "setAnswer", "(Lkotlin/jvm/functions/Function1;)V", "data", "", "item", "getItemCount", "isChecked", "checkBox", "Landroid/widget/CheckBox;", "position", "Landroidx/cardview/widget/CardView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "Companion", "ViewHolder", "app_debug"})
public final class QuestionsRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter.ViewHolder> {
    private int alreadyChecked = -1;
    public kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> answer;
    private java.util.List<java.lang.String> data;
    private java.lang.String item;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter.Companion Companion = null;
    private static final int DEFAULT_CHECKER = -1;
    
    public QuestionsRecyclerAdapter() {
        super();
    }
    
    public final int getAlreadyChecked() {
        return 0;
    }
    
    public final void setAlreadyChecked(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getAnswer() {
        return null;
    }
    
    public final void setAnswer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.ui.adapters.QuestionsRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void isChecked(android.widget.CheckBox checkBox, int position, java.lang.String answer, androidx.cardview.widget.CardView item) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/quizapplication/ui/adapters/QuestionsRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/quizapplication/databinding/QuestionItemBinding;", "(Lcom/example/quizapplication/databinding/QuestionItemBinding;)V", "getBinding", "()Lcom/example/quizapplication/databinding/QuestionItemBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.quizapplication.databinding.QuestionItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.quizapplication.databinding.QuestionItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.quizapplication.databinding.QuestionItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/quizapplication/ui/adapters/QuestionsRecyclerAdapter$Companion;", "", "()V", "DEFAULT_CHECKER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}