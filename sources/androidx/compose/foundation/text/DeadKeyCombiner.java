package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DeadKeyCombiner {

    /* JADX INFO: renamed from: a */
    public Integer f8397a;

    /* JADX INFO: renamed from: a */
    public final Integer m3226a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.f8397a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f8397a;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.f8397a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(unicodeChar) : num2;
    }
}
