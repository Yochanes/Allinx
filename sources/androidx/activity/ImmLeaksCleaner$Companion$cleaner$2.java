package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ImmLeaksCleaner$Companion$cleaner$2 extends Lambda implements Function0<ImmLeaksCleaner.Cleaner> {

    /* JADX INFO: renamed from: a */
    public static final ImmLeaksCleaner$Companion$cleaner$2 f88a = new ImmLeaksCleaner$Companion$cleaner$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
            return new ImmLeaksCleaner.ValidCleaner();
        } catch (NoSuchFieldException unused) {
            return ImmLeaksCleaner.FailedInitialization.f89a;
        }
    }
}
