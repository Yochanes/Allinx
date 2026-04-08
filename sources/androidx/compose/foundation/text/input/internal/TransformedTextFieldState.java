package androidx.compose.foundation.text.input.internal;

import androidx.activity.compose.C0044a;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "Companion", "TransformedText", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TransformedTextFieldState {

    /* JADX INFO: renamed from: a */
    public InputTransformation f9176a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    WedgeAffinity wedgeAffinity = WedgeAffinity.f9181a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class TransformedText {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            ((TransformedText) obj).getClass();
            return Intrinsics.m18594b(null, null) && Intrinsics.m18594b(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "TransformedText(text=" + ((Object) null) + ", offsetMapping=" + ((Object) null) + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3374b(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z2, int i) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f9406a;
        InputTransformation inputTransformation = transformedTextFieldState.f9176a;
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static void m3375c(TransformedTextFieldState transformedTextFieldState, String str, long j, boolean z2, int i) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f9406a;
        InputTransformation inputTransformation = transformedTextFieldState.f9176a;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3376a(C0044a c0044a, ContinuationImpl continuationImpl) {
        TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$1;
        if (continuationImpl instanceof TransformedTextFieldState$collectImeNotifications$1) {
            transformedTextFieldState$collectImeNotifications$1 = (TransformedTextFieldState$collectImeNotifications$1) continuationImpl;
            int i = transformedTextFieldState$collectImeNotifications$1.f9180d;
            if ((i & Integer.MIN_VALUE) != 0) {
                transformedTextFieldState$collectImeNotifications$1.f9180d = i - Integer.MIN_VALUE;
            } else {
                transformedTextFieldState$collectImeNotifications$1 = new TransformedTextFieldState$collectImeNotifications$1(this, continuationImpl);
            }
        }
        Object obj = transformedTextFieldState$collectImeNotifications$1.f9178b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = transformedTextFieldState$collectImeNotifications$1.f9180d;
        if (i2 != 0) {
            if (i2 == 1) {
                throw AbstractC0455a.m2245t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        transformedTextFieldState$collectImeNotifications$1.f9177a = c0044a;
        transformedTextFieldState$collectImeNotifications$1.f9180d = 1;
        new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(transformedTextFieldState$collectImeNotifications$1)).m20534p();
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m3377d(long j) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f9406a;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
