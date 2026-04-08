package com.exchange.allin.utils.ext;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import p002B.C0001a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ToastExtKt {

    /* JADX INFO: renamed from: a */
    public static final Lazy f41676a = LazyKt.m18299b(new C0001a(24));

    /* JADX INFO: renamed from: a */
    public static final void m14235a(String str) {
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        LaunchExtKt.m14205f(CoroutineScopeKt.m20560a(MainDispatcherLoader.f56350a), null, null, null, null, new ToastExtKt$toast$1(str, null), 31);
    }
}
