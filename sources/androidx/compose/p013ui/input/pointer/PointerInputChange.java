package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PointerInputChange {

    /* JADX INFO: renamed from: a */
    public final long f18297a;

    /* JADX INFO: renamed from: b */
    public final long f18298b;

    /* JADX INFO: renamed from: c */
    public final long f18299c;

    /* JADX INFO: renamed from: d */
    public final boolean f18300d;

    /* JADX INFO: renamed from: e */
    public final float f18301e;

    /* JADX INFO: renamed from: f */
    public final long f18302f;

    /* JADX INFO: renamed from: g */
    public final long f18303g;

    /* JADX INFO: renamed from: h */
    public final boolean f18304h;

    /* JADX INFO: renamed from: i */
    public final int f18305i;

    /* JADX INFO: renamed from: j */
    public final long f18306j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f18307k;

    /* JADX INFO: renamed from: l */
    public final long f18308l;

    /* JADX INFO: renamed from: m */
    public boolean f18309m;

    /* JADX INFO: renamed from: n */
    public boolean f18310n;

    /* JADX INFO: renamed from: o */
    public PointerInputChange f18311o;

    public PointerInputChange(long j, long j2, long j3, boolean z2, float f, long j4, long j5, boolean z3, boolean z4, int i, long j6) {
        this.f18297a = j;
        this.f18298b = j2;
        this.f18299c = j3;
        this.f18300d = z2;
        this.f18301e = f;
        this.f18302f = j4;
        this.f18303g = j5;
        this.f18304h = z3;
        this.f18305i = i;
        this.f18306j = j6;
        this.f18308l = 0L;
        this.f18309m = z4;
        this.f18310n = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m5562a() {
        PointerInputChange pointerInputChange = this.f18311o;
        if (pointerInputChange == null) {
            this.f18309m = true;
            this.f18310n = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.m5562a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5563b() {
        PointerInputChange pointerInputChange = this.f18311o;
        return pointerInputChange != null ? pointerInputChange.m5563b() : this.f18309m || this.f18310n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) PointerId.m5561b(this.f18297a));
        sb.append(", uptimeMillis=");
        sb.append(this.f18298b);
        sb.append(", position=");
        sb.append((Object) Offset.m5060j(this.f18299c));
        sb.append(", pressed=");
        sb.append(this.f18300d);
        sb.append(", pressure=");
        sb.append(this.f18301e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f18302f);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.m5060j(this.f18303g));
        sb.append(", previousPressed=");
        sb.append(this.f18304h);
        sb.append(", isConsumed=");
        sb.append(m5563b());
        sb.append(", type=");
        sb.append((Object) PointerType.m5573a(this.f18305i));
        sb.append(", historical=");
        Object obj = this.f18307k;
        if (obj == null) {
            obj = EmptyList.f51496a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) Offset.m5060j(this.f18306j));
        sb.append(')');
        return sb.toString();
    }

    public PointerInputChange(long j, long j2, long j3, boolean z2, float f, long j4, long j5, boolean z3, int i, ArrayList arrayList, long j6, long j7) {
        this(j, j2, j3, z2, f, j4, j5, z3, false, i, j6);
        this.f18307k = arrayList;
        this.f18308l = j7;
    }
}
