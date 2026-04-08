package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C0782xf8ffea21 implements OffsetProvider, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f9707a;

    public C0782xf8ffea21(Function0 function0) {
        this.f9707a = function0;
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo3207a() {
        return ((Offset) this.f9707a.invoke()).f17524a;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: b */
    public final Function mo3595b() {
        return this.f9707a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OffsetProvider) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.m18594b(this.f9707a, ((FunctionAdapter) obj).mo3595b());
    }

    public final int hashCode() {
        return this.f9707a.hashCode();
    }
}
