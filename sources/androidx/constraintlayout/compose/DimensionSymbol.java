package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/DimensionSymbol;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DimensionSymbol {

    /* JADX INFO: renamed from: a */
    public final String f20903a;

    /* JADX INFO: renamed from: b */
    public final String f20904b;

    public DimensionSymbol(String str, String str2) {
        this.f20903a = str;
        this.f20904b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final CLElement m6764a() {
        String str = this.f20903a;
        if (str != null) {
            return CLString.m6963j(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.f20904b + ". Using WrapContent.");
        return CLString.m6963j("wrap");
    }
}
