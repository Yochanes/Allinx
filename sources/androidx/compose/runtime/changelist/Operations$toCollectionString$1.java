package androidx.compose.runtime.changelist;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class Operations$toCollectionString$1 extends Lambda implements Function1<Object, CharSequence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Operations f16730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Operations$toCollectionString$1(Operations operations, String str) {
        super(1);
        this.f16730a = operations;
        this.f16731b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f16730a.m4552d(obj, this.f16731b);
    }
}
