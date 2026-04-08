package io.ktor.http.parsing;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/parsing/SequenceGrammar;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/ComplexGrammar;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SequenceGrammar extends Grammar implements ComplexGrammar {

    /* JADX INFO: renamed from: a */
    public final ArrayList f45946a;

    public SequenceGrammar(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SequenceGrammar) {
                CollectionsKt.m18434i(arrayList, ((ComplexGrammar) obj).mo17057b());
            } else {
                arrayList.add(obj);
            }
        }
        this.f45946a = arrayList;
    }

    @Override // io.ktor.http.parsing.ComplexGrammar
    /* JADX INFO: renamed from: b */
    public final List mo17057b() {
        return this.f45946a;
    }
}
