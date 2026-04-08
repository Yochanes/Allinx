package coil.util;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import coil.decode.DataSource;
import coil.request.ViewTargetRequestManager;
import coil.size.Dimension;
import coil.size.Scale;
import com.exchange.allin.R;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Headers;

/* JADX INFO: renamed from: coil.util.-Utils, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class Utils {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f33996a;

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config f33997b;

    /* JADX INFO: renamed from: c */
    public static final Headers f33998c;

    /* JADX INFO: renamed from: coil.util.-Utils$WhenMappings */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33999a;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DataSource dataSource = DataSource.f33468a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DataSource dataSource2 = DataSource.f33468a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DataSource dataSource3 = DataSource.f33468a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f33999a = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Scale scale = Scale.f33951a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f33996a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, AbstractC1212a.m4888a()} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f33997b = i >= 26 ? AbstractC1212a.m4911x() : Bitmap.Config.ARGB_8888;
        f33998c = new Headers.Builder().m21249e();
    }

    /* JADX INFO: renamed from: a */
    public static final void m12533a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m12534b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.m20448x(str)) {
            return null;
        }
        String strM20424V = StringsKt.m20424V(StringsKt.m20424V(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.m20420R('.', StringsKt.m20420R('/', strM20424V, strM20424V), ""));
    }

    /* JADX INFO: renamed from: c */
    public static final ViewTargetRequestManager m12535c(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(R.id.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(R.id.coil_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m12536d(Uri uri) {
        return Intrinsics.m18594b(uri.getScheme(), "file") && Intrinsics.m18594b((String) CollectionsKt.m18402D(uri.getPathSegments()), "android_asset");
    }

    /* JADX INFO: renamed from: e */
    public static final int m12537e(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f33941a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
