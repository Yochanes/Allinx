package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface PausableExecutor extends Executor {
    boolean isPaused();

    void pause();

    void resume();
}
