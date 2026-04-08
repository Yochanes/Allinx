package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {

    /* JADX INFO: renamed from: a */
    public static final Regex$findAll$2 f55204a = new Regex$findAll$2(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p0 = (MatchResult) obj;
        Intrinsics.m18599g(p0, "p0");
        return p0.next();
    }
}
