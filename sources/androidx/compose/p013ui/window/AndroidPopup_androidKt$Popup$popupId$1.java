package androidx.compose.p013ui.window;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidPopup_androidKt$Popup$popupId$1 extends Lambda implements Function0<UUID> {

    /* JADX INFO: renamed from: a */
    public static final AndroidPopup_androidKt$Popup$popupId$1 f20739a = new AndroidPopup_androidKt$Popup$popupId$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UUID.randomUUID();
    }
}
