package io.ktor.utils.p043io.jvm.javaio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
@JvmName
public final class PollersKt {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f47485a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static final Parking m17573a() {
        Parking parking = (Parking) f47485a.get();
        return parking != null ? parking : DefaultParking.f47466a;
    }
}
