package androidx.compose.runtime.saveable;

import io.intercom.android.sdk.models.AttributeType;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "T", AttributeType.LIST, "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class MapSaverKt$mapSaver$2 extends Lambda implements Function1<List<? extends Object>, Object> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new IllegalStateException("non-zero remainder");
        }
        for (int i = 0; i < list.size(); i += 2) {
            Object obj2 = list.get(i);
            Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj2, list.get(i + 1));
        }
        throw null;
    }
}
