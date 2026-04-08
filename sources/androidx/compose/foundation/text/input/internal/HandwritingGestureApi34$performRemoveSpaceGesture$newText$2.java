package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HandwritingGestureApi34$performRemoveSpaceGesture$newText$2 extends Lambda implements Function1<MatchResult, CharSequence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.IntRef f8925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.IntRef f8926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingGestureApi34$performRemoveSpaceGesture$newText$2(Ref.IntRef intRef, Ref.IntRef intRef2) {
        super(1);
        this.f8925a = intRef;
        this.f8926b = intRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        Ref.IntRef intRef = this.f8925a;
        if (intRef.f51657a == -1) {
            intRef.f51657a = matchResult.mo20393d().f51685a;
        }
        this.f8926b.f51657a = matchResult.mo20393d().f51686b + 1;
        return "";
    }
}
