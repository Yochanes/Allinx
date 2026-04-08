package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zaa implements zai<Integer> {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* synthetic */ Integer zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Integer.valueOf(FastParser.zac(fastParser, bufferedReader));
    }
}
