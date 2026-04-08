package androidx.compose.p013ui;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface MotionDurationScale extends CoroutineContext.Element {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/MotionDurationScale;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Key implements CoroutineContext.Key<MotionDurationScale> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Key f17196a = new Key();
    }

    /* JADX INFO: renamed from: W */
    float mo2462W();

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey */
    default CoroutineContext.Key getF51575a() {
        return Key.f17196a;
    }
}
