package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ViewGroupKt$special$$inlined$Sequence$1 implements Sequence<View> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f23428a;

    public ViewGroupKt$special$$inlined$Sequence$1(ViewGroup viewGroup) {
        this.f23428a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new TreeIterator(new ViewGroupKt$children$1(this.f23428a).getF55142a());
    }
}
