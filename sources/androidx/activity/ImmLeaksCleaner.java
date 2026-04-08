package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/LifecycleEventObserver;", "Cleaner", "Companion", "FailedInitialization", "ValidCleaner", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public static final Lazy f87a = LazyKt.m18299b(ImmLeaksCleaner$Companion$cleaner$2.f88a);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/ImmLeaksCleaner$Cleaner;", "", "Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class Cleaner {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/ImmLeaksCleaner$Companion;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class FailedInitialization extends Cleaner {

        /* JADX INFO: renamed from: a */
        public static final FailedInitialization f89a = new FailedInitialization();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class ValidCleaner extends Cleaner {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            throw null;
        }
    }
}
