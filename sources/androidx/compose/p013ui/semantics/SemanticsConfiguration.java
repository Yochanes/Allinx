package androidx.compose.p013ui.semantics;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.platform.JvmActuals_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final MutableScatterMap f19764a;

    /* JADX INFO: renamed from: b */
    public Map f19765b;

    /* JADX INFO: renamed from: c */
    public boolean f19766c;

    /* JADX INFO: renamed from: d */
    public boolean f19767d;

    public SemanticsConfiguration() {
        long[] jArr = ScatterMapKt.f3844a;
        this.f19764a = new MutableScatterMap();
    }

    @Override // androidx.compose.p013ui.semantics.SemanticsPropertyReceiver
    /* JADX INFO: renamed from: c */
    public final void mo6263c(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        boolean z2 = obj instanceof AccessibilityAction;
        MutableScatterMap mutableScatterMap = this.f19764a;
        if (!z2 || !mutableScatterMap.m2107c(semanticsPropertyKey)) {
            mutableScatterMap.m2081m(semanticsPropertyKey, obj);
            return;
        }
        Object objM2109e = mutableScatterMap.m2109e(semanticsPropertyKey);
        Intrinsics.m18597e(objM2109e, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) objM2109e;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        String str = accessibilityAction2.f19714a;
        if (str == null) {
            str = accessibilityAction.f19714a;
        }
        Function function = accessibilityAction2.f19715b;
        if (function == null) {
            function = accessibilityAction.f19715b;
        }
        mutableScatterMap.m2081m(semanticsPropertyKey, new AccessibilityAction(str, function));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SemanticsConfiguration m6264e() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f19766c = this.f19766c;
        semanticsConfiguration.f19767d = this.f19767d;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.f19764a;
        mutableScatterMap.getClass();
        MutableScatterMap from = this.f19764a;
        Intrinsics.m18599g(from, "from");
        Object[] objArr = from.f3840b;
        Object[] objArr2 = from.f3841c;
        long[] jArr = from.f3839a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            mutableScatterMap.m2081m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return semanticsConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return Intrinsics.m18594b(this.f19764a, semanticsConfiguration.f19764a) && this.f19766c == semanticsConfiguration.f19766c && this.f19767d == semanticsConfiguration.f19767d;
    }

    /* JADX INFO: renamed from: f */
    public final Object m6265f(SemanticsPropertyKey semanticsPropertyKey) {
        Object objM2109e = this.f19764a.m2109e(semanticsPropertyKey);
        if (objM2109e != null) {
            return objM2109e;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: g */
    public final Object m6266g(SemanticsPropertyKey semanticsPropertyKey, Function0 function0) {
        Object objM2109e = this.f19764a.m2109e(semanticsPropertyKey);
        return objM2109e == null ? function0.invoke() : objM2109e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19767d) + AbstractC0455a.m2230e(this.f19764a.hashCode() * 31, 31, this.f19766c);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map mapM2105a = this.f19765b;
        if (mapM2105a == null) {
            mapM2105a = this.f19764a.m2105a();
            this.f19765b = mapM2105a;
        }
        return mapM2105a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: j */
    public final void m6267j(SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap mutableScatterMap = semanticsConfiguration.f19764a;
        Object[] objArr = mutableScatterMap.f3840b;
        Object[] objArr2 = mutableScatterMap.f3841c;
        long[] jArr = mutableScatterMap.f3839a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        MutableScatterMap mutableScatterMap2 = this.f19764a;
                        Object objM2109e = mutableScatterMap2.m2109e(semanticsPropertyKey);
                        Intrinsics.m18597e(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = semanticsPropertyKey.f19843b.invoke(objM2109e, obj2);
                        if (objInvoke != null) {
                            mutableScatterMap2.m2081m(semanticsPropertyKey, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f19766c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f19767d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        MutableScatterMap mutableScatterMap = this.f19764a;
        Object[] objArr = mutableScatterMap.f3840b;
        Object[] objArr2 = mutableScatterMap.f3841c;
        long[] jArr = mutableScatterMap.f3839a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((SemanticsPropertyKey) obj).f19842a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return JvmActuals_jvmKt.m6152a(this) + "{ " + ((Object) sb) + " }";
    }
}
