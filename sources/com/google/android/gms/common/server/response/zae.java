package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zae implements zai<Boolean> {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* bridge */ /* synthetic */ Boolean zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Boolean.valueOf(FastParser.zah(fastParser, bufferedReader, false));
    }
}
