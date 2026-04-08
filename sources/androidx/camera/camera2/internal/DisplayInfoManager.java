package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.firebase.messaging.Constants;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DisplayInfoManager {

    /* JADX INFO: renamed from: e */
    public static final Size f1769e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f */
    public static final Size f1770f = new Size(320, 240);

    /* JADX INFO: renamed from: g */
    public static final Size f1771g = new Size(640, 480);

    /* JADX INFO: renamed from: h */
    public static final Object f1772h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile DisplayInfoManager f1773i;

    /* JADX INFO: renamed from: a */
    public final DisplayManager f1774a;

    /* JADX INFO: renamed from: b */
    public volatile Size f1775b = null;

    /* JADX INFO: renamed from: c */
    public final MaxPreviewSize f1776c = new MaxPreviewSize();

    /* JADX INFO: renamed from: d */
    public final DisplaySizeCorrector f1777d = new DisplaySizeCorrector();

    public DisplayInfoManager(Context context) {
        this.f1774a = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    /* JADX INFO: renamed from: b */
    public static DisplayInfoManager m1012b(Context context) {
        if (f1773i == null) {
            synchronized (f1772h) {
                try {
                    if (f1773i == null) {
                        f1773i = new DisplayInfoManager(context);
                    }
                } finally {
                }
            }
        }
        return f1773i;
    }

    /* JADX INFO: renamed from: d */
    public static Display m1013d(Display[] displayArr, boolean z2) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z2 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x * point.y;
                if (i2 > i) {
                    display = display2;
                    i = i2;
                }
            }
        }
        return display;
    }

    /* JADX INFO: renamed from: a */
    public final Size m1014a() {
        Size sizeM1156d;
        Point point = new Point();
        m1015c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = SizeUtil.f3012a;
        if (size.getHeight() * size.getWidth() < SizeUtil.m1663a(f1770f)) {
            size = this.f1777d.f2073a != null ? (Size) SmallDisplaySizeQuirk.f2068a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f1771g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f1769e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (this.f1776c.f2080a != null && (sizeM1156d = ExtraCroppingQuirk.m1156d(SurfaceConfig.ConfigType.f2793a)) != null) {
            if (sizeM1156d.getHeight() * sizeM1156d.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeM1156d;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: c */
    public final Display m1015c(boolean z2) {
        Display[] displays = this.f1774a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM1013d = m1013d(displays, z2);
        if (displayM1013d == null && z2) {
            displayM1013d = m1013d(displays, false);
        }
        if (displayM1013d != null) {
            return displayM1013d;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: renamed from: e */
    public final Size m1016e() {
        if (this.f1775b != null) {
            return this.f1775b;
        }
        this.f1775b = m1014a();
        return this.f1775b;
    }
}
