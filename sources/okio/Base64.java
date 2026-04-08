package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.ByteString;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okio"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmName
public final class Base64 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f57815a;

    static {
        ByteString.Companion companion = ByteString.f57840d;
        f57815a = ByteString.Companion.m21633c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f57842a;
        ByteString.Companion.m21633c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
