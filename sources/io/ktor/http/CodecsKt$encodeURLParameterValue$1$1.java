package io.ktor.http;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CodecsKt$encodeURLParameterValue$1$1 extends Lambda implements Function1<Byte, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StringBuilder f45579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecsKt$encodeURLParameterValue$1$1(StringBuilder sb) {
        super(1);
        this.f45579a = sb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        boolean zContains = CodecsKt.f45571a.contains(Byte.valueOf(bByteValue));
        StringBuilder sb = this.f45579a;
        if (zContains || CodecsKt.f45576f.contains(Byte.valueOf(bByteValue)) || bByteValue == ((byte) 61)) {
            sb.append((char) bByteValue);
        } else if (bByteValue == ((byte) 32)) {
            sb.append('+');
        } else {
            sb.append(CodecsKt.m16939a(bByteValue));
        }
        return Unit.f51459a;
    }
}
