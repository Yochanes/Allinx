package com.google.android.gms.cloudmessaging;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z2) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z2);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return zzd.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return zzd.class;
    }
}
