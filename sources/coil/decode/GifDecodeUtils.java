package coil.decode;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-gif_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
public final class GifDecodeUtils {

    /* JADX INFO: renamed from: a */
    public static final ByteString f33494a;

    /* JADX INFO: renamed from: b */
    public static final ByteString f33495b;

    /* JADX INFO: renamed from: c */
    public static final ByteString f33496c;

    /* JADX INFO: renamed from: d */
    public static final ByteString f33497d;

    /* JADX INFO: renamed from: e */
    public static final ByteString f33498e;

    /* JADX INFO: renamed from: f */
    public static final ByteString f33499f;

    /* JADX INFO: renamed from: g */
    public static final ByteString f33500g;

    /* JADX INFO: renamed from: h */
    public static final ByteString f33501h;

    /* JADX INFO: renamed from: i */
    public static final ByteString f33502i;

    static {
        ByteString.Companion companion = ByteString.f57840d;
        f33494a = ByteString.Companion.m21633c("GIF87a");
        f33495b = ByteString.Companion.m21633c("GIF89a");
        f33496c = ByteString.Companion.m21633c("RIFF");
        f33497d = ByteString.Companion.m21633c("WEBP");
        f33498e = ByteString.Companion.m21633c("VP8X");
        f33499f = ByteString.Companion.m21633c("ftyp");
        f33500g = ByteString.Companion.m21633c("msf1");
        f33501h = ByteString.Companion.m21633c("hevc");
        f33502i = ByteString.Companion.m21633c("hevx");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12422a(BufferedSource bufferedSource) {
        return bufferedSource.mo21591e0(0L, f33495b) || bufferedSource.mo21591e0(0L, f33494a);
    }
}
