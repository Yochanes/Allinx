package androidx.paging.compose;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class LazyFoundationExtensionsKt$itemKey$1 extends Lambda implements Function1<Integer, Object> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new PagingPlaceholderKey(((Number) obj).intValue());
    }
}
