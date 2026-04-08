package com.google.common.p027io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
abstract class LineBuffer {
    private StringBuilder line = new StringBuilder();
    private boolean sawReturn;

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z2) {
        handleLine(this.line.toString(), this.sawReturn ? z2 ? "\r\n" : "\r" : z2 ? "\n" : "");
        this.line = new StringBuilder();
        this.sawReturn = false;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(char[] cArr, int i, int i2) {
        int i3;
        if (!this.sawReturn || i2 <= 0) {
            i3 = i;
        } else {
            if (finishLine(cArr[i] == '\n')) {
                i3 = i + 1;
            }
        }
        int i4 = i + i2;
        int i5 = i3;
        while (i3 < i4) {
            char c2 = cArr[i3];
            if (c2 == '\n') {
                this.line.append(cArr, i5, i3 - i5);
                finishLine(true);
            } else if (c2 != '\r') {
                i3++;
            } else {
                this.line.append(cArr, i5, i3 - i5);
                this.sawReturn = true;
                int i6 = i3 + 1;
                if (i6 < i4) {
                    if (finishLine(cArr[i6] == '\n')) {
                        i3 = i6;
                    }
                }
            }
            i5 = i3 + 1;
            i3++;
        }
        this.line.append(cArr, i5, i4 - i5);
    }

    public void finish() {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }

    public abstract void handleLine(String str, String str2);
}
