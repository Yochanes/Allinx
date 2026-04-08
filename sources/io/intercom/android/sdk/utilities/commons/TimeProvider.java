package io.intercom.android.sdk.utilities.commons;

import p006H.C0014a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new C0014a(0);

    long currentTimeMillis();
}
