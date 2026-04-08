package coil.util;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/util/FileDescriptorCounter;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class FileDescriptorCounter {

    /* JADX INFO: renamed from: a */
    public static final FileDescriptorCounter f34002a = new FileDescriptorCounter();

    /* JADX INFO: renamed from: b */
    public static final File f34003b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c */
    public static int f34004c = 30;

    /* JADX INFO: renamed from: d */
    public static long f34005d = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e */
    public static boolean f34006e = true;
}
