package androidx.compose.p013ui.platform;

import androidx.os.SavedStateRegistry;
import androidx.os.internal.SavedStateRegistryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C1287xec1ea390 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f19404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SavedStateRegistry f19405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f19406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287xec1ea390(boolean z2, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.f19404a = z2;
        this.f19405b = savedStateRegistry;
        this.f19406c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f19404a) {
            SavedStateRegistry savedStateRegistry = this.f19405b;
            String str = this.f19406c;
            SavedStateRegistryImpl savedStateRegistryImpl = savedStateRegistry.f32027a;
            synchronized (savedStateRegistryImpl.f32034c) {
            }
        }
        return Unit.f51459a;
    }
}
