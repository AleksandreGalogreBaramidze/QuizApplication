package com.example.quizapplication.ui.basefragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H&J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\u001a\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR,\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u00028\u0001X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/example/quizapplication/ui/basefragment/BaseFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "V", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "inflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getInflater", "()Lkotlin/jvm/functions/Function3;", "viewModel", "Landroidx/lifecycle/ViewModel;", "getViewModel", "Ljava/lang/Class;", "initFragment", "", "(Landroidx/lifecycle/ViewModel;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "container", "onDestroyView", "onViewCreated", "view", "app_debug"})
public abstract class BaseFragment<T extends androidx.viewbinding.ViewBinding, V extends androidx.lifecycle.ViewModel> extends androidx.fragment.app.Fragment {
    private V viewModel;
    private T _binding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<V> getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final T getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, T> getInflater();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public abstract void initFragment(@org.jetbrains.annotations.NotNull()
    V viewModel);
}