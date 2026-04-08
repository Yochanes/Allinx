package androidx.compose.material;

import android.graphics.PathMeasure;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPathMeasure;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/CheckDrawingCache;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class CheckDrawingCache {

    /* JADX INFO: renamed from: a */
    public final AndroidPath f10340a;

    /* JADX INFO: renamed from: b */
    public final AndroidPathMeasure f10341b;

    /* JADX INFO: renamed from: c */
    public final AndroidPath f10342c;

    public CheckDrawingCache() {
        AndroidPath androidPathM5161a = AndroidPath_androidKt.m5161a();
        AndroidPathMeasure androidPathMeasure = new AndroidPathMeasure(new PathMeasure());
        AndroidPath androidPathM5161a2 = AndroidPath_androidKt.m5161a();
        this.f10340a = androidPathM5161a;
        this.f10341b = androidPathMeasure;
        this.f10342c = androidPathM5161a2;
    }
}
