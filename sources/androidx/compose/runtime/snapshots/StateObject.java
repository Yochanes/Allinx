package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateObject;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface StateObject {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: e */
    void mo3362e(StateRecord stateRecord);

    /* JADX INFO: renamed from: g */
    StateRecord mo3363g();

    /* JADX INFO: renamed from: m */
    default StateRecord mo3364m(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return null;
    }
}
