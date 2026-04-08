package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Companion", "Api29Impl", "lifecycle-process_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ProcessLifecycleOwner implements LifecycleOwner {

    /* JADX INFO: renamed from: n */
    public static final ProcessLifecycleOwner f24932n = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: a */
    public int f24933a;

    /* JADX INFO: renamed from: b */
    public int f24934b;

    /* JADX INFO: renamed from: f */
    public Handler f24937f;

    /* JADX INFO: renamed from: c */
    public boolean f24935c = true;

    /* JADX INFO: renamed from: d */
    public boolean f24936d = true;

    /* JADX INFO: renamed from: g */
    public final LifecycleRegistry f24938g = new LifecycleRegistry(this);

    /* JADX INFO: renamed from: i */
    public final RunnableC0015a f24939i = new RunnableC0015a(this, 10);

    /* JADX INFO: renamed from: j */
    public final ProcessLifecycleOwner$initializationListener$1 f24940j = new ProcessLifecycleOwner$initializationListener$1(this);

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "lifecycle-process_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static final void m9156a(Activity activity, ProcessLifecycleOwner$attach$1$onActivityPreCreated$1 processLifecycleOwner$attach$1$onActivityPreCreated$1) {
            activity.registerActivityLifecycleCallbacks(processLifecycleOwner$attach$1$onActivityPreCreated$1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "Landroidx/lifecycle/ProcessLifecycleOwner;", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public final void m9155a() {
        int i = this.f24934b + 1;
        this.f24934b = i;
        if (i == 1) {
            if (this.f24935c) {
                this.f24938g.m9132f(Lifecycle.Event.ON_RESUME);
                this.f24935c = false;
            } else {
                Handler handler = this.f24937f;
                Intrinsics.m18596d(handler);
                handler.removeCallbacks(this.f24939i);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f24938g;
    }
}
