package com.exchange.allin.p024ui.widgets;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/widgets/TabPositionEx;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TabPositionEx {

    /* JADX INFO: renamed from: a */
    public final float f41331a;

    /* JADX INFO: renamed from: b */
    public final float f41332b;

    public TabPositionEx(float f, float f2) {
        this.f41331a = f;
        this.f41332b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPositionEx)) {
            return false;
        }
        TabPositionEx tabPositionEx = (TabPositionEx) obj;
        return C1338Dp.m6641a(this.f41331a, tabPositionEx.f41331a) && C1338Dp.m6641a(this.f41332b, tabPositionEx.f41332b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f41332b) + (Float.hashCode(this.f41331a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f41331a;
        AbstractC0455a.m2248w(f, ", right=", sb);
        float f2 = this.f41332b;
        sb.append((Object) C1338Dp.m6642b(f + f2));
        sb.append(", width=");
        sb.append((Object) C1338Dp.m6642b(f2));
        sb.append(')');
        return sb.toString();
    }
}
