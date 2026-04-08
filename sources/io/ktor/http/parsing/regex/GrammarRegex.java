package io.ktor.http.parsing.regex;

import androidx.compose.p013ui.platform.AbstractC1313i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/parsing/regex/GrammarRegex;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
final class GrammarRegex {

    /* JADX INFO: renamed from: a */
    public final String f45948a;

    /* JADX INFO: renamed from: b */
    public final int f45949b;

    public GrammarRegex(String regexRaw, int i, boolean z2) {
        Intrinsics.m18599g(regexRaw, "regexRaw");
        this.f45948a = z2 ? AbstractC1313i.m6244a(')', "(", regexRaw) : regexRaw;
        this.f45949b = z2 ? i + 1 : i;
    }

    public /* synthetic */ GrammarRegex(String str, int i, int i2) {
        this(str, (i2 & 2) != 0 ? 0 : i, false);
    }
}
