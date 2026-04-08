package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zac implements zai<Float> {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* synthetic */ Float zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Float.valueOf(FastParser.zab(fastParser, bufferedReader));
    }
}
