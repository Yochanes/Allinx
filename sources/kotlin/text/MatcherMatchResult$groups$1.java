package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MatcherMatchResult f55202a;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f55202a = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c */
    public final int getF16756c() {
        return this.f55202a.f55197a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final MatchGroup m20394e(int i) {
        MatcherMatchResult matcherMatchResult = this.f55202a;
        Matcher matcher = matcherMatchResult.f55197a;
        IntRange intRangeM18664k = RangesKt.m18664k(matcher.start(i), matcher.end(i));
        if (intRangeM18664k.f51685a < 0) {
            return null;
        }
        String strGroup = matcherMatchResult.f55197a.group(i);
        Intrinsics.m18598f(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeM18664k);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new TransformingSequence.C62481();
    }
}
