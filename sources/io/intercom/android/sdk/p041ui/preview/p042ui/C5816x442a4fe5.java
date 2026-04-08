package io.intercom.android.sdk.p041ui.preview.p042ui;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m18302d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C5816x442a4fe5 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5816x442a4fe5(List list) {
        super(1);
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        this.$items.get(i);
        return null;
    }
}
