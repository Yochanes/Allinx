package io.ktor.http.cio;

import io.ktor.utils.p043io.core.Input;
import io.ktor.utils.p043io.streams.InputKt;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lio/ktor/utils/io/core/Input;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CIOMultipartDataBase$partToData$lazyInput$1 extends Lambda implements Function0<Input> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f45750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f45751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOMultipartDataBase$partToData$lazyInput$1(Ref.BooleanRef booleanRef, File file) {
        super(0);
        this.f45750a = booleanRef;
        this.f45751b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f45750a.f51655a) {
            throw new IllegalStateException("Already disposed");
        }
        return InputKt.m17576a(new FileInputStream(this.f45751b));
    }
}
