package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zab implements zai<Long> {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* synthetic */ Long zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Long.valueOf(FastParser.zad(fastParser, bufferedReader));
    }
}
