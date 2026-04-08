package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"", "message", "", "b", "(Ljava/lang/String;)V", "ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidPath_androidKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Path.Direction[] directionArr = Path.Direction.f17616a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AndroidPath m5161a() {
        return new AndroidPath(new android.graphics.Path());
    }

    /* JADX INFO: renamed from: b */
    public static final void m5162b(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
