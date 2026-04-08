package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/text/MatchResult;", "", "Destructured", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface MatchResult {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Destructured {

        /* JADX INFO: renamed from: a */
        public final MatchResult f55196a;

        public Destructured(MatchResult matchResult) {
            this.f55196a = matchResult;
        }
    }

    /* JADX INFO: renamed from: a */
    Destructured mo20390a();

    /* JADX INFO: renamed from: b */
    List mo20391b();

    /* JADX INFO: renamed from: c */
    MatcherMatchResult$groups$1 getF55199c();

    /* JADX INFO: renamed from: d */
    IntRange mo20393d();

    String getValue();

    MatchResult next();
}
