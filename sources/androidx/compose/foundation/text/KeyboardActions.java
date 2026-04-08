package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KeyboardActions {

    /* JADX INFO: renamed from: d */
    public static final KeyboardActions f8482d = new KeyboardActions(null, null, null, 63);

    /* JADX INFO: renamed from: a */
    public final Function1 f8483a;

    /* JADX INFO: renamed from: b */
    public final Function1 f8484b;

    /* JADX INFO: renamed from: c */
    public final Function1 f8485c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public KeyboardActions(Function1 function1, Function1 function12, Function1 function13, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function12 = (i & 4) != 0 ? null : function12;
        function13 = (i & 16) != 0 ? null : function13;
        this.f8483a = function1;
        this.f8484b = function12;
        this.f8485c = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.f8483a == keyboardActions.f8483a && this.f8484b == keyboardActions.f8484b && this.f8485c == keyboardActions.f8485c;
    }

    public final int hashCode() {
        Function1 function1 = this.f8483a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 961;
        Function1 function12 = this.f8484b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 961;
        Function1 function13 = this.f8485c;
        return (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
    }
}
