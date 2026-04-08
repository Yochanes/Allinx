package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface zzhy {
    @Nullable
    String zza(ContentResolver contentResolver, String str);

    <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzhv<T> zzhvVar);
}
