package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/internal/DecodeHelper;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DecodeHelper {

    /* JADX INFO: renamed from: a */
    public final Parcel f6221a;

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f6221a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    /* JADX INFO: renamed from: a */
    public final long m2701a() {
        Parcel parcel = this.f6221a;
        byte b2 = parcel.readByte();
        long j = b2 == 1 ? 4294967296L : b2 == 2 ? 8589934592L : 0L;
        return TextUnitType.m6682a(j, 0L) ? TextUnit.f20575c : TextUnitKt.m6681d(parcel.readFloat(), j);
    }
}
