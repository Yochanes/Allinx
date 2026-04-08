package androidx.media3.common.util;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MediaFormatUtil {
    /* JADX INFO: renamed from: a */
    public static void m9517a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9518b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC0000a.m9f(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
