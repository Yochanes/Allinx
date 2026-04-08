package androidx.appcompat.widget;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0148a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m743A(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ int m744B(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m745C(PropertyMapper propertyMapper) {
        return propertyMapper.mapBoolean("iconifiedByDefault", com.exchange.allin.R.attr.iconifiedByDefault);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ int m746D(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("queryHint", com.exchange.allin.R.attr.queryHint);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m747a(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m748b(PropertyMapper propertyMapper, IntFunction intFunction) {
        return propertyMapper.mapIntEnum("orientation", R.attr.orientation, intFunction);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m749c(PropertyReader propertyReader, int i, float f) {
        propertyReader.readFloat(i, f);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m750d(PropertyReader propertyReader, int i, int i2) {
        propertyReader.readIntFlag(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m751e(PropertyReader propertyReader, int i, Drawable drawable) {
        propertyReader.readObject(i, drawable);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m752f(PropertyReader propertyReader, int i, CharSequence charSequence) {
        propertyReader.readObject(i, charSequence);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m753g(PropertyReader propertyReader, int i, boolean z2) {
        propertyReader.readBoolean(i, z2);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ int m754h(PropertyMapper propertyMapper) {
        return propertyMapper.mapGravity("gravity", R.attr.gravity);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ int m755i(PropertyMapper propertyMapper, IntFunction intFunction) {
        return propertyMapper.mapIntFlag("showDividers", com.exchange.allin.R.attr.showDividers, intFunction);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ int m756j(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("textOff", R.attr.textOff);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ int m757k(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("thumbTextPadding", com.exchange.allin.R.attr.thumbTextPadding);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ int m758l(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("thumbTint", com.exchange.allin.R.attr.thumbTint);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ int m759m(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("thumbTintMode", com.exchange.allin.R.attr.thumbTintMode);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ int m760n(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("track", com.exchange.allin.R.attr.track);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ int m761o(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("trackTint", com.exchange.allin.R.attr.trackTint);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ int m762p(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("trackTintMode", com.exchange.allin.R.attr.trackTintMode);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ int m763q(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("textOn", R.attr.textOn);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ int m764r(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("thumb", R.attr.thumb);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ int m765s(PropertyMapper propertyMapper) {
        return propertyMapper.mapBoolean("showText", com.exchange.allin.R.attr.showText);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ int m766t(PropertyMapper propertyMapper) {
        return propertyMapper.mapFloat("weightSum", R.attr.weightSum);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m767u(PropertyMapper propertyMapper) {
        return propertyMapper.mapBoolean("splitTrack", com.exchange.allin.R.attr.splitTrack);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ int m768v(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("switchMinWidth", com.exchange.allin.R.attr.switchMinWidth);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int m769w(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("switchPadding", com.exchange.allin.R.attr.switchPadding);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ int m770x(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("divider", com.exchange.allin.R.attr.divider);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m771y(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("dividerPadding", com.exchange.allin.R.attr.dividerPadding);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m772z(PropertyMapper propertyMapper) {
        return propertyMapper.mapBoolean("measureWithLargestChild", com.exchange.allin.R.attr.measureWithLargestChild);
    }
}
