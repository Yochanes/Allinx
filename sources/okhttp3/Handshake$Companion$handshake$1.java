package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class Handshake$Companion$handshake$1 extends Lambda implements Function0<List<? extends Certificate>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f57104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$handshake$1(List list) {
        super(0);
        this.f57104a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f57104a;
    }
}
