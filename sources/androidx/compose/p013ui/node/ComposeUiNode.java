package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.CompositionLocalMap;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@PublishedApi
public interface ComposeUiNode {

    /* JADX INFO: renamed from: h */
    public static final Companion f18641h = Companion.f18642a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f18642a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final Function0 f18643b;

        /* JADX INFO: renamed from: c */
        public static final Function0 f18644c;

        /* JADX INFO: renamed from: d */
        public static final Function2 f18645d;

        /* JADX INFO: renamed from: e */
        public static final Function2 f18646e;

        /* JADX INFO: renamed from: f */
        public static final Function2 f18647f;

        /* JADX INFO: renamed from: g */
        public static final Function2 f18648g;

        /* JADX INFO: renamed from: h */
        public static final Function2 f18649h;

        /* JADX INFO: renamed from: i */
        public static final Function2 f18650i;

        /* JADX INFO: renamed from: j */
        public static final Function2 f18651j;

        static {
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.f18705X;
            f18643b = LayoutNode$Companion$Constructor$1.f18753a;
            f18644c = ComposeUiNode$Companion$VirtualConstructor$1.f18659a;
            f18645d = ComposeUiNode$Companion$SetModifier$1.f18656a;
            f18646e = ComposeUiNode$Companion$SetDensity$1.f18653a;
            f18647f = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.f18657a;
            f18648g = ComposeUiNode$Companion$SetMeasurePolicy$1.f18655a;
            f18649h = ComposeUiNode$Companion$SetLayoutDirection$1.f18654a;
            f18650i = ComposeUiNode$Companion$SetViewConfiguration$1.f18658a;
            f18651j = ComposeUiNode$Companion$SetCompositeKeyHash$1.f18652a;
        }

        /* JADX INFO: renamed from: a */
        public static Function0 m5731a() {
            return f18643b;
        }

        /* JADX INFO: renamed from: b */
        public static Function2 m5732b() {
            return f18651j;
        }

        /* JADX INFO: renamed from: c */
        public static Function2 m5733c() {
            return f18648g;
        }

        /* JADX INFO: renamed from: d */
        public static Function2 m5734d() {
            return f18645d;
        }

        /* JADX INFO: renamed from: e */
        public static Function2 m5735e() {
            return f18647f;
        }
    }

    /* JADX INFO: renamed from: c */
    void mo5724c(MeasurePolicy measurePolicy);

    /* JADX INFO: renamed from: d */
    void mo5725d(int i);

    /* JADX INFO: renamed from: e */
    void mo5726e(Modifier modifier);

    /* JADX INFO: renamed from: f */
    void mo5727f(Density density);

    /* JADX INFO: renamed from: i */
    void mo5728i(ViewConfiguration viewConfiguration);

    /* JADX INFO: renamed from: j */
    void mo5729j(LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: l */
    void mo5730l(CompositionLocalMap compositionLocalMap);
}
