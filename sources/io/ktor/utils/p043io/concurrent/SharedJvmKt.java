package io.ktor.utils.p043io.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class SharedJvmKt {
    /* JADX INFO: renamed from: a */
    public static final ReadOnlyProperty m17426a(CoroutineScope value) {
        Intrinsics.m18599g(value, "value");
        return new SharedJvmKt$threadLocal$1(value);
    }
}
