package io.intercom.android.sdk.p032m5.data;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$addConversations$lambda$2$$inlined$sortedByDescending$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C5480x31aba7a<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return ComparisonsKt.m18545a(Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t2)), Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t)));
    }
}
