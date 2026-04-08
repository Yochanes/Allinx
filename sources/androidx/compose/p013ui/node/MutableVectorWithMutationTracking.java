package androidx.compose.p013ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "T", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableVectorWithMutationTracking<T> {

    /* JADX INFO: renamed from: a */
    public final MutableVector f18903a;

    /* JADX INFO: renamed from: b */
    public final Function0 f18904b;

    public MutableVectorWithMutationTracking(MutableVector mutableVector, Function0 function0) {
        this.f18903a = mutableVector;
        this.f18904b = function0;
    }
}
