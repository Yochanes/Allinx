package androidx.compose.p013ui.semantics;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "", "parentValue", "childValue", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SemanticsProperties$ContentDescription$1 extends Lambda implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {

    /* JADX INFO: renamed from: a */
    public static final SemanticsProperties$ContentDescription$1 f19824a = new SemanticsProperties$ContentDescription$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if (list == null) {
            return list2;
        }
        ArrayList arrayListM18469z0 = CollectionsKt.m18469z0(list);
        arrayListM18469z0.addAll(list2);
        return arrayListM18469z0;
    }
}
