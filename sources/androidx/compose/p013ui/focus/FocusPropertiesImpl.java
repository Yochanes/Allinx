package androidx.compose.p013ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FocusPropertiesImpl implements FocusProperties {

    /* JADX INFO: renamed from: a */
    public boolean f17468a;

    /* JADX INFO: renamed from: b */
    public FocusRequester f17469b;

    /* JADX INFO: renamed from: c */
    public FocusRequester f17470c;

    /* JADX INFO: renamed from: d */
    public FocusRequester f17471d;

    /* JADX INFO: renamed from: e */
    public FocusRequester f17472e;

    /* JADX INFO: renamed from: f */
    public FocusRequester f17473f;

    /* JADX INFO: renamed from: g */
    public FocusRequester f17474g;

    /* JADX INFO: renamed from: h */
    public FocusRequester f17475h;

    /* JADX INFO: renamed from: i */
    public FocusRequester f17476i;

    /* JADX INFO: renamed from: j */
    public Lambda f17477j;

    /* JADX INFO: renamed from: k */
    public Lambda f17478k;

    @Override // androidx.compose.p013ui.focus.FocusProperties
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF17468a() {
        return this.f17468a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.focus.FocusProperties
    /* JADX INFO: renamed from: b */
    public final void mo4997b(Function1 function1) {
        this.f17478k = (Lambda) function1;
    }

    @Override // androidx.compose.p013ui.focus.FocusProperties
    /* JADX INFO: renamed from: c */
    public final void mo4998c(boolean z2) {
        this.f17468a = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.focus.FocusProperties
    /* JADX INFO: renamed from: d */
    public final void mo4999d(Function1 function1) {
        this.f17477j = (Lambda) function1;
    }
}
