package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull Task<TResult> task);
}
