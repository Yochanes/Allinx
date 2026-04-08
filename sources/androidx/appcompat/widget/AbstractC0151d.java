package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.hardware.camera2.CameraManager;
import android.view.Menu;
import android.view.View;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import com.exchange.allin.R;
import java.util.List;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0151d {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m773A(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("contentInsetLeft", R.attr.contentInsetLeft);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ int m774B(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("contentInsetRight", R.attr.contentInsetRight);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m775C(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("contentInsetStart", R.attr.contentInsetStart);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ int m776D(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("contentInsetStartWithNavigation", R.attr.contentInsetStartWithNavigation);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m777a(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("titleMarginEnd", R.attr.titleMarginEnd);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ RecordingCanvas m778b(RenderNode renderNode) {
        return renderNode.beginRecording();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ RenderNode m779c() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ List m780d(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m781e(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m782f(RenderNode renderNode) {
        renderNode.endRecording();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m783g(RenderNode renderNode, int i, int i2) {
        renderNode.setPosition(0, 0, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m784h(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m785i(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m786j(PropertyReader propertyReader, int i, int i2) {
        propertyReader.readResourceId(i, i2);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m787k(PropertyReader propertyReader, int i, Menu menu) {
        propertyReader.readObject(i, menu);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ int m788l(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("titleMarginStart", R.attr.titleMarginStart);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ int m789m(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("logo", R.attr.logo);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ int m790n(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("logoDescription", R.attr.logoDescription);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ int m791o(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("collapseContentDescription", R.attr.collapseContentDescription);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ int m792p(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("menu", R.attr.menu);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ int m793q(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("navigationContentDescription", R.attr.navigationContentDescription);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ int m794r(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("navigationIcon", R.attr.navigationIcon);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ int m795s(PropertyMapper propertyMapper) {
        return propertyMapper.mapResourceId("popupTheme", R.attr.popupTheme);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ int m796t(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("subtitle", R.attr.subtitle);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m797u(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("title", R.attr.title);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ int m798v(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("titleMarginBottom", R.attr.titleMarginBottom);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int m799w(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("titleMarginTop", R.attr.titleMarginTop);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ int m800x(PropertyMapper propertyMapper) {
        return propertyMapper.mapObject("collapseIcon", R.attr.collapseIcon);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m801y(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("contentInsetEnd", R.attr.contentInsetEnd);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m802z(PropertyMapper propertyMapper) {
        return propertyMapper.mapInt("contentInsetEndWithActions", R.attr.contentInsetEndWithActions);
    }
}
