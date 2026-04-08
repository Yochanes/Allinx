package androidx.compose.p013ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/TextRange;", "", "Companion", "packedValue", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class TextRange {

    /* JADX INFO: renamed from: b */
    public static final long f20115b = TextRangeKt.m6410a(0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f20116c = 0;

    /* JADX INFO: renamed from: a */
    public final long f20117a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ TextRange(long j) {
        this.f20117a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m6402a(long j, long j2) {
        return (m6407f(j) <= m6407f(j2)) & (m6406e(j2) <= m6406e(j));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6403b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m6404c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final int m6405d(long j) {
        return m6406e(j) - m6407f(j);
    }

    /* JADX INFO: renamed from: e */
    public static final int m6406e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final int m6407f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m6408g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static String m6409h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0000a.m17n(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextRange) {
            return this.f20117a == ((TextRange) obj).f20117a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20117a);
    }

    public final String toString() {
        return m6409h(this.f20117a);
    }
}
