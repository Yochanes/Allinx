package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.Writer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface DataEncoder {
    @NonNull
    String encode(@NonNull Object obj);

    void encode(@NonNull Object obj, @NonNull Writer writer);
}
