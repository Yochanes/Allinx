package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"scarlet"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class LifecycleStateUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m15434a(Lifecycle.State isEquivalentTo, Lifecycle.State other) {
        Intrinsics.m18599g(isEquivalentTo, "$this$isEquivalentTo");
        Intrinsics.m18599g(other, "other");
        if (isEquivalentTo.equals(other)) {
            return true;
        }
        return (isEquivalentTo instanceof Lifecycle.State.Stopped) && (other instanceof Lifecycle.State.Stopped);
    }
}
