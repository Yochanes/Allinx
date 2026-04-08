package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MatcherMatchResult$groupValues$1 extends AbstractList<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MatcherMatchResult f55201a;

    public MatcherMatchResult$groupValues$1(MatcherMatchResult matcherMatchResult) {
        this.f55201a = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c */
    public final int getF16756c() {
        return this.f55201a.f55197a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        String strGroup = this.f55201a.f55197a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
