package com.example.quizapplication.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u001dH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R9\u0010\u0007\u001a!\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/quizapplication/ui/adapters/HomeRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/quizapplication/ui/adapters/HomeRecyclerAdapter$ViewHolder;", "()V", "data", "", "Lcom/example/quizapplication/models/QuizItem;", "getSubjectId", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "", "Lcom/example/quizapplication/util/getSubjectId;", "getGetSubjectId", "()Lkotlin/jvm/functions/Function1;", "setGetSubjectId", "(Lkotlin/jvm/functions/Function1;)V", "item", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "Lcom/example/quizapplication/models/Quiz;", "ViewHolder", "app_debug"})
public final class HomeRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.quizapplication.ui.adapters.HomeRecyclerAdapter.ViewHolder> {
    private java.util.List<com.example.quizapplication.models.QuizItem> data;
    public kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> getSubjectId;
    private com.example.quizapplication.models.QuizItem item;
    
    public HomeRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getGetSubjectId() {
        return null;
    }
    
    public final void setGetSubjectId(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.quizapplication.ui.adapters.HomeRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.ui.adapters.HomeRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.quizapplication.models.Quiz data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/quizapplication/ui/adapters/HomeRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/quizapplication/databinding/TopicItemBinding;", "(Lcom/example/quizapplication/databinding/TopicItemBinding;)V", "getBinding", "()Lcom/example/quizapplication/databinding/TopicItemBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.quizapplication.databinding.TopicItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.quizapplication.databinding.TopicItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.quizapplication.databinding.TopicItemBinding getBinding() {
            return null;
        }
    }
}