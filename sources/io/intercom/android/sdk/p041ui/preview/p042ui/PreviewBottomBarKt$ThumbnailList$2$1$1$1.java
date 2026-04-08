package io.intercom.android.sdk.p041ui.preview.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class PreviewBottomBarKt$ThumbnailList$2$1$1$1 implements Function0<Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ Function1<Integer, Unit> $onThumbnailClick;

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewBottomBarKt$ThumbnailList$2$1$1$1(Function1<? super Integer, Unit> function1, int i) {
        this.$onThumbnailClick = function1;
        this.$index = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m22600invoke();
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22600invoke() {
        this.$onThumbnailClick.invoke(Integer.valueOf(this.$index));
    }
}
