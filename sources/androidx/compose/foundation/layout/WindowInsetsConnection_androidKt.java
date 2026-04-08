package androidx.compose.foundation.layout;

import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation-layout_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class WindowInsetsConnection_androidKt {

    /* JADX INFO: renamed from: a */
    public static final float f6596a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f6597b;

    /* JADX INFO: renamed from: c */
    public static final double f6598c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f6597b = dLog;
        f6598c = dLog - 1.0d;
    }
}
