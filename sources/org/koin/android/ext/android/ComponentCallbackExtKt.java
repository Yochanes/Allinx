package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"koin-android_release"}, m18303k = 2, m18304mv = {1, 5, 1}, m18306xi = 48)
@SourceDebugExtension
public final class ComponentCallbackExtKt {
    /* JADX INFO: renamed from: a */
    public static final Koin m21785a(ComponentCallbacks componentCallbacks) {
        Intrinsics.m18599g(componentCallbacks, "<this>");
        return componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).mo21790a() : GlobalContext.f58199a.m21802a();
    }
}
