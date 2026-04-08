package coil.util;

import android.os.SystemClock;
import coil.size.Dimension;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcoil/util/LimitedFileDescriptorHardwareBitmapService;", "Lcoil/util/HardwareBitmapService;", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class LimitedFileDescriptorHardwareBitmapService implements HardwareBitmapService {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lcoil/util/LimitedFileDescriptorHardwareBitmapService$Companion;", "", "", "MIN_SIZE_DIMENSION", "I", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // coil.util.HardwareBitmapService
    /* JADX INFO: renamed from: a */
    public final boolean mo12540a(Size size) {
        Dimension dimension = size.f33956a;
        if ((dimension instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension).f33941a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        Dimension dimension2 = size.f33957b;
        return (dimension2 instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension2).f33941a : Integer.MAX_VALUE) > 100;
    }

    @Override // coil.util.HardwareBitmapService
    /* JADX INFO: renamed from: b */
    public final boolean getF34012a() {
        boolean z2;
        synchronized (FileDescriptorCounter.f34002a) {
            try {
                int i = FileDescriptorCounter.f34004c;
                FileDescriptorCounter.f34004c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > FileDescriptorCounter.f34005d + ((long) 30000)) {
                    FileDescriptorCounter.f34004c = 0;
                    FileDescriptorCounter.f34005d = SystemClock.uptimeMillis();
                    String[] list = FileDescriptorCounter.f34003b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    FileDescriptorCounter.f34006e = list.length < 800;
                }
                z2 = FileDescriptorCounter.f34006e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
