package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {

    /* JADX INFO: renamed from: a */
    public final TransformedTextFieldState f8918a;

    /* JADX INFO: renamed from: b */
    public int f8919b;

    /* JADX INFO: renamed from: c */
    public final MutableVector f8920c = new MutableVector(new Function1[16], 0);

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.f8918a = transformedTextFieldState;
    }

    /* JADX INFO: renamed from: a */
    public final void m3314a(Function1 function1) {
        this.f8919b++;
        this.f8920c.m4568b(function1);
        int i = this.f8919b - 1;
        this.f8919b = i;
        if (i == 0 && this.f8920c.f16736c != 0) {
            throw null;
        }
    }
}
