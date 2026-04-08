package com.google.firebase.encoders;

import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface Encoder<TValue, TContext> {
    void encode(@NonNull TValue tvalue, @NonNull TContext tcontext);
}
