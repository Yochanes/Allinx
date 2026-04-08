package io.ktor.client.engine.cio;

import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/engine/cio/ConnectionResponseTask;", "", "ktor-client-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class ConnectionResponseTask {

    /* JADX INFO: renamed from: a */
    public final GMTDate f45040a;

    /* JADX INFO: renamed from: b */
    public final RequestTask f45041b;

    public ConnectionResponseTask(GMTDate gMTDate, RequestTask task) {
        Intrinsics.m18599g(task, "task");
        this.f45040a = gMTDate;
        this.f45041b = task;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionResponseTask)) {
            return false;
        }
        ConnectionResponseTask connectionResponseTask = (ConnectionResponseTask) obj;
        return Intrinsics.m18594b(this.f45040a, connectionResponseTask.f45040a) && Intrinsics.m18594b(this.f45041b, connectionResponseTask.f45041b);
    }

    public final int hashCode() {
        GMTDate gMTDate = this.f45040a;
        int iHashCode = (gMTDate != null ? gMTDate.hashCode() : 0) * 31;
        RequestTask requestTask = this.f45041b;
        return iHashCode + (requestTask != null ? requestTask.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectionResponseTask(requestTime=" + this.f45040a + ", task=" + this.f45041b + ")";
    }
}
