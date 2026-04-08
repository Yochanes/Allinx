package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/platform/ViewConfiguration;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface ViewConfiguration {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    long mo5828a();

    /* JADX INFO: renamed from: b */
    long mo5829b();

    /* JADX INFO: renamed from: c */
    default float mo6097c() {
        return 2.0f;
    }

    /* JADX INFO: renamed from: d */
    default long mo5830d() {
        float f = 48;
        return DpKt.m6644b(f, f);
    }

    /* JADX INFO: renamed from: e */
    default float mo6098e() {
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: f */
    float mo5831f();

    /* JADX INFO: renamed from: g */
    default float mo6099g() {
        return 16.0f;
    }
}
