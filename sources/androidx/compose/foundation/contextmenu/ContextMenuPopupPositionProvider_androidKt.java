package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ContextMenuPopupPositionProvider_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m2538a(int i, int i2, int i3, boolean z2) {
        if (i2 >= i3) {
            if (z2) {
                return 0;
            }
            return i3 - i2;
        }
        if (z2) {
            if (z2) {
                if (z2) {
                }
            } else if (z2) {
            }
        } else {
            if (z2 ? i3 - i2 <= i : i2 > i) {
                if (z2) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z2) {
                return i - i2;
            }
        }
        return i;
    }
}
