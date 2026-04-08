package androidx.compose.foundation.internal;

import android.os.Parcel;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/internal/EncodeHelper;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class EncodeHelper {

    /* JADX INFO: renamed from: a */
    public Parcel f6222a;

    /* JADX INFO: renamed from: a */
    public final void m2702a(byte b2) {
        this.f6222a.writeByte(b2);
    }

    /* JADX INFO: renamed from: b */
    public final void m2703b(float f) {
        this.f6222a.writeFloat(f);
    }

    /* JADX INFO: renamed from: c */
    public final void m2704c(long j) {
        long jM6674b = TextUnit.m6674b(j);
        byte b2 = 0;
        if (!TextUnitType.m6682a(jM6674b, 0L)) {
            if (TextUnitType.m6682a(jM6674b, 4294967296L)) {
                b2 = 1;
            } else if (TextUnitType.m6682a(jM6674b, 8589934592L)) {
                b2 = 2;
            }
        }
        m2702a(b2);
        if (TextUnitType.m6682a(TextUnit.m6674b(j), 0L)) {
            return;
        }
        m2703b(TextUnit.m6675c(j));
    }
}
