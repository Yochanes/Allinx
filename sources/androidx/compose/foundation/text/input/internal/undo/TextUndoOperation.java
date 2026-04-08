package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextUndoOperation {

    /* JADX INFO: renamed from: g */
    public static final TextUndoOperation$Companion$Saver$1 f9409g = new TextUndoOperation$Companion$Saver$1();

    /* JADX INFO: renamed from: a */
    public final int f9410a;

    /* JADX INFO: renamed from: b */
    public final String f9411b;

    /* JADX INFO: renamed from: c */
    public final String f9412c;

    /* JADX INFO: renamed from: d */
    public final long f9413d;

    /* JADX INFO: renamed from: e */
    public final long f9414e;

    /* JADX INFO: renamed from: f */
    public final long f9415f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z2, int i2) {
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        this.f9410a = i;
        this.f9411b = str;
        this.f9412c = str2;
        this.f9413d = j;
        this.f9414e = j2;
        this.f9415f = j3;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() == 0 && str2.length() > 0) {
            TextEditType textEditType = TextEditType.f9401a;
        } else if (str.length() <= 0 || str2.length() != 0) {
            TextEditType textEditType2 = TextEditType.f9403c;
        } else {
            TextEditType textEditType3 = TextEditType.f9402b;
        }
    }
}
