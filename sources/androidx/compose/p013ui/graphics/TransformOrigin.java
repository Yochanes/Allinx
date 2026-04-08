package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "Companion", "packedValue", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class TransformOrigin {

    /* JADX INFO: renamed from: b */
    public static final long f17678b = TransformOriginKt.m5252a(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f17679c = 0;

    /* JADX INFO: renamed from: a */
    public final long f17680a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ TransformOrigin(long j) {
        this.f17680a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5248a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m5249b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m5250c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m5251d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransformOrigin) {
            return this.f17680a == ((TransformOrigin) obj).f17680a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17680a);
    }

    public final String toString() {
        return m5251d(this.f17680a);
    }
}
