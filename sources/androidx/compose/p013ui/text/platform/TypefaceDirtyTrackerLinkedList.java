package androidx.compose.p013ui.text.platform;

import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TypefaceDirtyTrackerLinkedList {

    /* JADX INFO: renamed from: a */
    public final State f20486a;

    /* JADX INFO: renamed from: b */
    public final TypefaceDirtyTrackerLinkedList f20487b;

    /* JADX INFO: renamed from: c */
    public final Object f20488c;

    public TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.f20486a = state;
        this.f20487b = typefaceDirtyTrackerLinkedList;
        this.f20488c = state.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6583a() {
        if (this.f20486a.getValue() != this.f20488c) {
            return true;
        }
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.f20487b;
        return typefaceDirtyTrackerLinkedList != null && typefaceDirtyTrackerLinkedList.m6583a();
    }
}
