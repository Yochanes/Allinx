package io.ktor.http.parsing;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/parsing/AtLeastOne;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/SimpleGrammar;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class AtLeastOne extends Grammar implements SimpleGrammar {

    /* JADX INFO: renamed from: a */
    public final Grammar f45942a;

    public AtLeastOne(Grammar grammar) {
        this.f45942a = grammar;
    }

    @Override // io.ktor.http.parsing.SimpleGrammar
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Grammar getF45942a() {
        return this.f45942a;
    }
}
