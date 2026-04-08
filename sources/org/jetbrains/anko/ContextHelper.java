package org.jetbrains.anko;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/jetbrains/anko/ContextHelper;", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
final class ContextHelper {
    static {
        new Handler(Looper.getMainLooper());
    }
}
