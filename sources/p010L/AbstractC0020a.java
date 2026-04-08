package p010L;

import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.net.ssl.SSLSockets;
import android.text.TextDirectionHeuristic;
import android.view.Window;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.TextView;
import com.exchange.allin.R;
import java.util.function.IntFunction;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0020a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m43A(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ int m44B(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("buttonTint", R.attr.buttonTint);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m45C(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("buttonTintMode", R.attr.buttonTintMode);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ int m46D(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m47a(Insets insets) {
        return insets.left;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m48b(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m49c(PropertyMapper propertyMapper, IntFunction intFunction) {
        return propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, intFunction);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m50d(TextView textView) {
        return textView.getTextDirectionHeuristic();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m51e(Window window) {
        window.setStatusBarContrastEnforced(false);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m52f(Window window, boolean z2) {
        window.setNavigationBarContrastEnforced(z2);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m53g(PropertyReader propertyReader, int i, int i2) {
        propertyReader.readInt(i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m54h(PropertyReader propertyReader, int i, ColorStateList colorStateList) {
        propertyReader.readObject(i, colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m55i(PropertyReader propertyReader, int i, PorterDuff.Mode mode) {
        propertyReader.readObject(i, mode);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m56j(SSLSocket sSLSocket) {
        SSLSockets.setUseSessionTickets(sSLSocket, true);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m57k(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ boolean m58l(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ int m59m(Insets insets) {
        return insets.top;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ int m60n(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m61o(PropertyReader propertyReader, int i, int i2) {
        propertyReader.readIntEnum(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ int m62p(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ int m63q(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("tint", R.attr.tint);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ int m64r(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("tintMode", R.attr.tintMode);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ int m65s(PropertyMapper propertyMapper) {
        return propertyMapper.mapBoolean("baselineAligned", android.R.attr.baselineAligned);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ int m66t(Insets insets) {
        return insets.right;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m67u(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m68v(PropertyReader propertyReader, int i, int i2) {
        propertyReader.readGravity(i, i2);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int m69w(Insets insets) {
        return insets.bottom;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ int m70x(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m71y(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m72z(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
    }
}
