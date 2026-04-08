package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class MatcherMatchResult implements MatchResult {

    /* JADX INFO: renamed from: a */
    public final Matcher f55197a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f55198b;

    /* JADX INFO: renamed from: c */
    public final MatcherMatchResult$groups$1 f55199c;

    /* JADX INFO: renamed from: d */
    public MatcherMatchResult$groupValues$1 f55200d;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.m18599g(input, "input");
        this.f55197a = matcher;
        this.f55198b = input;
        this.f55199c = new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    /* JADX INFO: renamed from: a */
    public final MatchResult.Destructured mo20390a() {
        return new MatchResult.Destructured(this);
    }

    @Override // kotlin.text.MatchResult
    /* JADX INFO: renamed from: b */
    public final List mo20391b() {
        if (this.f55200d == null) {
            this.f55200d = new MatcherMatchResult$groupValues$1(this);
        }
        MatcherMatchResult$groupValues$1 matcherMatchResult$groupValues$1 = this.f55200d;
        Intrinsics.m18596d(matcherMatchResult$groupValues$1);
        return matcherMatchResult$groupValues$1;
    }

    @Override // kotlin.text.MatchResult
    /* JADX INFO: renamed from: c, reason: from getter */
    public final MatcherMatchResult$groups$1 getF55199c() {
        return this.f55199c;
    }

    @Override // kotlin.text.MatchResult
    /* JADX INFO: renamed from: d */
    public final IntRange mo20393d() {
        Matcher matcher = this.f55197a;
        return RangesKt.m18664k(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f55197a.group();
        Intrinsics.m18598f(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher = this.f55197a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f55198b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.m18598f(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new MatcherMatchResult(matcher2, charSequence);
        }
        return null;
    }
}
