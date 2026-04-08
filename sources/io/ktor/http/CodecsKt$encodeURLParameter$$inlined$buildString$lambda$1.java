package io.ktor.http;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke", "io/ktor/http/CodecsKt$encodeURLParameter$1$1"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CodecsKt$encodeURLParameter$$inlined$buildString$lambda$1 extends Lambda implements Function1<Byte, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StringBuilder f45577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f45578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecsKt$encodeURLParameter$$inlined$buildString$lambda$1(StringBuilder sb, boolean z2) {
        super(1);
        this.f45577a = sb;
        this.f45578b = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        boolean zContains = CodecsKt.f45571a.contains(Byte.valueOf(bByteValue));
        StringBuilder sb = this.f45577a;
        if (zContains || CodecsKt.f45576f.contains(Byte.valueOf(bByteValue))) {
            sb.append((char) bByteValue);
        } else if (this.f45578b && bByteValue == ((byte) 32)) {
            sb.append('+');
        } else {
            sb.append(CodecsKt.m16939a(bByteValue));
        }
        return Unit.f51459a;
    }
}
