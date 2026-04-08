package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zad implements zai<Double> {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* synthetic */ Double zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Double.valueOf(FastParser.zaa(fastParser, bufferedReader));
    }
}
