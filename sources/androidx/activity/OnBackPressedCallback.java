package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class OnBackPressedCallback {

    /* JADX INFO: renamed from: a */
    public boolean f90a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f91b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public FunctionReferenceImpl f92c;

    public OnBackPressedCallback(boolean z2) {
        this.f90a = z2;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo161b();

    /* JADX INFO: renamed from: c */
    public void mo162c(BackEventCompat backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: d */
    public void mo163d(BackEventCompat backEvent) {
        Intrinsics.m18599g(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: e */
    public final void m164e() {
        Iterator it = this.f91b.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo160a() {
    }
}
