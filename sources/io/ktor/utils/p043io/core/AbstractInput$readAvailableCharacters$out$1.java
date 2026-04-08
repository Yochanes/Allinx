package io.ktor.utils.p043io.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"io/ktor/utils/io/core/AbstractInput$readAvailableCharacters$out$1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class AbstractInput$readAvailableCharacters$out$1 implements Appendable {

    /* JADX INFO: renamed from: a */
    public int f47333a;

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        this.f47333a++;
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        boolean z2 = charSequence instanceof String;
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
