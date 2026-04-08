package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "state", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SnapshotKt$mergedWriteObserver$1 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f17055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f17056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedWriteObserver$1(Function1 function1, Function1 function12) {
        super(1);
        this.f17055a = function1;
        this.f17056b = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f17055a.invoke(obj);
        this.f17056b.invoke(obj);
        return Unit.f51459a;
    }
}
