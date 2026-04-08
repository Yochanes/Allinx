package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class Handshake$peerCertificates$2 extends Lambda implements Function0<List<? extends Certificate>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f57105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(Function0 function0) {
        super(0);
        this.f57105a = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return (List) this.f57105a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return EmptyList.f51496a;
        }
    }
}
