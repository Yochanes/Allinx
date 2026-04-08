package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/CompositionLocalMap;", "", "Companion", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface CompositionLocalMap {

    /* JADX INFO: renamed from: e */
    public static final Companion f16328e = Companion.f16329a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/CompositionLocalMap$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f16329a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final PersistentCompositionLocalHashMap f16330b = PersistentCompositionLocalHashMap.f16932g;
    }

    /* JADX INFO: renamed from: c */
    Object mo4356c(CompositionLocal compositionLocal);
}
