package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/concurrent/Task;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Task {

    /* JADX INFO: renamed from: a */
    public final String f57348a;

    /* JADX INFO: renamed from: b */
    public final boolean f57349b;

    /* JADX INFO: renamed from: c */
    public TaskQueue f57350c;

    /* JADX INFO: renamed from: d */
    public long f57351d;

    public Task(String name, boolean z2) {
        Intrinsics.m18599g(name, "name");
        this.f57348a = name;
        this.f57349b = z2;
        this.f57351d = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo21366a();

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF57348a() {
        return this.f57348a;
    }
}
