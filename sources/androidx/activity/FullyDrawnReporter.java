package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FullyDrawnReporter {

    /* JADX INFO: renamed from: a */
    public final Executor f77a;

    /* JADX INFO: renamed from: b */
    public final Function0 f78b;

    /* JADX INFO: renamed from: c */
    public final Object f79c;

    /* JADX INFO: renamed from: d */
    public int f80d;

    /* JADX INFO: renamed from: e */
    public boolean f81e;

    /* JADX INFO: renamed from: f */
    public boolean f82f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f83g;

    /* JADX INFO: renamed from: h */
    public final RunnableC0047f f84h;

    public FullyDrawnReporter(Executor executor, Function0 function0) {
        Intrinsics.m18599g(executor, "executor");
        this.f77a = executor;
        this.f78b = function0;
        this.f79c = new Object();
        this.f83g = new ArrayList();
        this.f84h = new RunnableC0047f(this, 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m158a() {
        synchronized (this.f79c) {
            try {
                this.f82f = true;
                Iterator it = this.f83g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f83g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m159b() {
        int i;
        synchronized (this.f79c) {
            if (!this.f82f && (i = this.f80d) > 0) {
                int i2 = i - 1;
                this.f80d = i2;
                if (!this.f81e && i2 == 0) {
                    this.f81e = true;
                    this.f77a.execute(this.f84h);
                }
            }
        }
    }
}
