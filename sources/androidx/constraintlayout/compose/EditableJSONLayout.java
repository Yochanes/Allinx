package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@PublishedApi
public abstract class EditableJSONLayout implements LayoutInformationReceiver {

    /* JADX INFO: renamed from: a */
    public MutableLongState f20905a;

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: g */
    public final void mo6765g() {
        System.nanoTime();
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: h */
    public final void mo6766h(MutableLongState mutableLongState) {
        this.f20905a = mutableLongState;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: i */
    public final LayoutInfoFlags mo6767i() {
        return null;
    }
}
