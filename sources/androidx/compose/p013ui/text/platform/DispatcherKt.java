package androidx.compose.p013ui.text.platform;

import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DispatcherKt {

    /* JADX INFO: renamed from: a */
    public static final MainCoroutineDispatcher f20482a;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        f20482a = MainDispatcherLoader.f56350a;
    }
}
