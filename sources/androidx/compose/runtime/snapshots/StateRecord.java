package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class StateRecord {

    /* JADX INFO: renamed from: a */
    public long f17121a;

    /* JADX INFO: renamed from: b */
    public StateRecord f17122b;

    public StateRecord(long j) {
        this.f17121a = j;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3365a(StateRecord stateRecord);

    /* JADX INFO: renamed from: b */
    public abstract StateRecord mo3366b();

    /* JADX INFO: renamed from: c */
    public StateRecord mo4364c(long j) {
        StateRecord stateRecordMo3366b = mo3366b();
        stateRecordMo3366b.f17121a = j;
        return stateRecordMo3366b;
    }
}
