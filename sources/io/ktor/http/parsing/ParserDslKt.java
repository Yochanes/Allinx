package io.ktor.http.parsing;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class ParserDslKt {
    /* JADX INFO: renamed from: a */
    public static final OrGrammar m17058a(Grammar grammar, Grammar grammar2) {
        return new OrGrammar(CollectionsKt.m18414O(grammar, grammar2));
    }

    /* JADX INFO: renamed from: b */
    public static final SequenceGrammar m17059b(Grammar grammar, Grammar grammar2) {
        return new SequenceGrammar(CollectionsKt.m18414O(grammar, grammar2));
    }
}
