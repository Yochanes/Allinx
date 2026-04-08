package io.ktor.http.cio;

import io.ktor.http.cio.MultipartEvent;
import io.ktor.utils.p043io.core.Input;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CIOMultipartDataBase$partToData$7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f45746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lazy f45747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MultipartEvent.MultipartPart f45748c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f45749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOMultipartDataBase$partToData$7(Ref.BooleanRef booleanRef, Lazy lazy, MultipartEvent.MultipartPart multipartPart, File file) {
        super(0);
        this.f45746a = booleanRef;
        this.f45747b = lazy;
        this.f45748c = multipartPart;
        this.f45749d = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        this.f45746a.f51655a = true;
        Lazy lazy = this.f45747b;
        if (lazy.isInitialized()) {
            ((Input) lazy.getValue()).close();
        }
        this.f45748c.mo17019a();
        this.f45749d.delete();
        return Unit.f51459a;
    }
}
