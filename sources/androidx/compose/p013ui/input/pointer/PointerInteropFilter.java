package androidx.compose.p013ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "DispatchToViewState", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PointerInteropFilter implements PointerInputModifier {

    /* JADX INFO: renamed from: a */
    public Function1 f18335a;

    /* JADX INFO: renamed from: b */
    public RequestDisallowInterceptTouchEvent f18336b;

    /* JADX INFO: renamed from: c */
    public boolean f18337c;

    /* JADX INFO: renamed from: d */
    public final PointerInteropFilter$pointerInputFilter$1 f18338d = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DispatchToViewState {

        /* JADX INFO: renamed from: a */
        public static final DispatchToViewState f18339a;

        /* JADX INFO: renamed from: b */
        public static final DispatchToViewState f18340b;

        /* JADX INFO: renamed from: c */
        public static final DispatchToViewState f18341c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ DispatchToViewState[] f18342d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f18343f;

        static {
            DispatchToViewState dispatchToViewState = new DispatchToViewState("Unknown", 0);
            f18339a = dispatchToViewState;
            DispatchToViewState dispatchToViewState2 = new DispatchToViewState("Dispatching", 1);
            f18340b = dispatchToViewState2;
            DispatchToViewState dispatchToViewState3 = new DispatchToViewState("NotDispatching", 2);
            f18341c = dispatchToViewState3;
            DispatchToViewState[] dispatchToViewStateArr = {dispatchToViewState, dispatchToViewState2, dispatchToViewState3};
            f18342d = dispatchToViewStateArr;
            f18343f = EnumEntriesKt.m18563a(dispatchToViewStateArr);
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) f18342d.clone();
        }
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputModifier
    /* JADX INFO: renamed from: K0, reason: from getter */
    public final PointerInteropFilter$pointerInputFilter$1 getF18338d() {
        return this.f18338d;
    }
}
