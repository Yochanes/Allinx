package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsPropertyKey<T> {

    /* JADX INFO: renamed from: a */
    public final String f19842a;

    /* JADX INFO: renamed from: b */
    public final Function2 f19843b;

    /* JADX INFO: renamed from: c */
    public boolean f19844c;

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C13271 extends Lambda implements Function2<Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C13271 f19845a = new C13271(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public SemanticsPropertyKey(String str, Function2 function2) {
        this.f19842a = str;
        this.f19843b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f19842a;
    }

    public /* synthetic */ SemanticsPropertyKey(String str) {
        this(str, C13271.f19845a);
    }

    public SemanticsPropertyKey(String str, boolean z2, Function2 function2) {
        this(str, function2);
        this.f19844c = z2;
    }
}
