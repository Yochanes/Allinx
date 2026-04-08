package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okio"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class ByteString {

    /* JADX INFO: renamed from: a */
    public static final char[] f57921a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static final int m21716a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }
}
