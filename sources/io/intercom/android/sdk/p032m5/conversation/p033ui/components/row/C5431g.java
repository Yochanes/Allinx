package io.intercom.android.sdk.p032m5.conversation.p033ui.components.row;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5431g implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f44082b;

    public /* synthetic */ C5431g(Function0 function0, int i) {
        this.f44081a = i;
        this.f44082b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44081a) {
            case 0:
                return ClickableMessageRowKt$ClickableMessageRow$1$1.m15966b(this.f44082b, (Offset) obj);
            default:
                return ClickableMessageRowKt$ClickableMessageRow$1$1.m15965a(this.f44082b, (Offset) obj);
        }
    }
}
