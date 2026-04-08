package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/Api34Impl;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Api34Impl {
    /* JADX INFO: renamed from: a */
    public static float m141a(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: b */
    public static int m142b(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: c */
    public static float m143c(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: d */
    public static float m144d(BackEvent backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
