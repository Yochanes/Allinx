package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextDragObserver f8541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(TextDragObserver textDragObserver) {
        super(0);
        this.f8541a = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f8541a.onStop();
        return Unit.f51459a;
    }
}
