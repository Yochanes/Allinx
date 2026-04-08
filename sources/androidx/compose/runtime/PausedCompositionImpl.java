package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedComposition;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PausedCompositionImpl implements PausedComposition {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                PausedCompositionState[] pausedCompositionStateArr = PausedCompositionState.f16427a;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PausedCompositionState[] pausedCompositionStateArr2 = PausedCompositionState.f16427a;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PausedCompositionState[] pausedCompositionStateArr3 = PausedCompositionState.f16427a;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PausedCompositionState[] pausedCompositionStateArr4 = PausedCompositionState.f16427a;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PausedCompositionState[] pausedCompositionStateArr5 = PausedCompositionState.f16427a;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PausedCompositionState[] pausedCompositionStateArr6 = PausedCompositionState.f16427a;
                iArr[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
