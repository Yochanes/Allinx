package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f8371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter f8372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1(boolean z2, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        super(0);
        this.f8371a = z2;
        this.f8372b = legacyPlatformTextInputServiceAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f8371a) {
            this.f8372b.mo3298i();
        }
        return Unit.f51459a;
    }
}
