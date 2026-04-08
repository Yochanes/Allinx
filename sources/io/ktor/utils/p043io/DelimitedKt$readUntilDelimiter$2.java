package io.ktor.utils.p043io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lio/ktor/utils/io/LookAheadSession;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class DelimitedKt$readUntilDelimiter$2 extends Lambda implements Function1<LookAheadSession, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f47262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteBuffer f47263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.BooleanRef f47264c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref.IntRef f47265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelimitedKt$readUntilDelimiter$2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, Ref.BooleanRef booleanRef, Ref.IntRef intRef) {
        super(1);
        this.f47262a = byteBuffer;
        this.f47263b = byteBuffer2;
        this.f47264c = booleanRef;
        this.f47265d = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Ref.BooleanRef booleanRef;
        LookAheadSession receiver = (LookAheadSession) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        do {
            ByteBuffer byteBuffer = this.f47262a;
            ByteBuffer byteBuffer2 = this.f47263b;
            int iM17389a = DelimitedKt.m17389a(receiver, byteBuffer, byteBuffer2);
            if (iM17389a != 0) {
                booleanRef = this.f47264c;
                if (iM17389a < 0) {
                    booleanRef.f51655a = true;
                    iM17389a = -iM17389a;
                }
                this.f47265d.f51657a += iM17389a;
                if (!byteBuffer2.hasRemaining()) {
                    break;
                }
            } else {
                break;
            }
        } while (!booleanRef.f51655a);
        return Unit.f51459a;
    }
}
