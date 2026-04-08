package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.RunnableC1407a;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "T", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public abstract class ConstraintTracker<T> {

    /* JADX INFO: renamed from: a */
    public final WorkManagerTaskExecutor f32950a;

    /* JADX INFO: renamed from: b */
    public final Context f32951b;

    /* JADX INFO: renamed from: c */
    public final Object f32952c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f32953d;

    /* JADX INFO: renamed from: e */
    public Object f32954e;

    public ConstraintTracker(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f32950a = workManagerTaskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m18598f(applicationContext, "context.applicationContext");
        this.f32951b = applicationContext;
        this.f32952c = new Object();
        this.f32953d = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo12194a();

    /* JADX INFO: renamed from: b */
    public final void m12199b(Object obj) {
        synchronized (this.f32952c) {
            Object obj2 = this.f32954e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f32954e = obj;
                this.f32950a.f33150d.execute(new RunnableC1407a(16, CollectionsKt.m18465x0(this.f32953d), this));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo12197c();

    /* JADX INFO: renamed from: d */
    public abstract void mo12198d();
}
